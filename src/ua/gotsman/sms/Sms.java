package ua.gotsman.sms;

import jxl.read.biff.BiffException;
import ua.smsc.sys.soap.*;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.logging.Logger;

class Sms implements Runnable {
    private final static String LOGIN = "Severik";
    private final static String PASSWORD = "Derparol12!@";
    private final static Logger log = Logger.getLogger(Sms.class.getName());
    private Path path = Paths.get("D:\\test");
    private Info info = new Info();
    private Service service = new Service();
    private ServiceSoap port = service.getServiceSoap();
    int stopTime = 0;
    int smsCount = 1;

    @Override
    public void run() {
        while (true) {
            if (stopTime == 1) break;
            try (DirectoryStream<Path> entries = Files.newDirectoryStream(path, "*xls")) {
                for (Path entry : entries) {
                    InputStream inputStream = new FileInputStream(String.valueOf(entry));
                    info.loadFromXls(inputStream);
                    inputStream.close();
                    sendSms();
                    smsStatus();
                    Files.delete(entry);
                    smsCount += 1;
                    writeHistory();
                }
            } catch (IOException | BiffException e) {
                log.info(e.toString());
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stopTime = 0;
    }

    static String getLogin() {
        return LOGIN;
    }

    static String getPassword() {
        return PASSWORD;
    }

    ServiceSoap getPort() {
        return port;
    }

    String getUserBalance() {
        Balance balance = new Balance();
        balance.setLogin(LOGIN);
        balance.setPsw(PASSWORD);
        BalanceResponse response = port.getBalance(balance);
        return response.getBalanceresult().getBalance();
    }

    private void sendSms() {
        Send send = new Send();
        send.setLogin(LOGIN);
        send.setPsw(PASSWORD);
        send.setId(String.valueOf(smsCount));
        send.setPhones("+38" + info.getPhoneNumber());
        send.setMes("This is test message, please don't response");
        send.setSender("SoftTechno");
        send.setTime("0");
        port.sendSms(send);
    }

    private void writeHistory() throws IOException {
        FileWriter writer = new FileWriter("D:\\Projects\\SMS\\out\\artifacts\\sms\\history.txt", true);
        LocalDateTime time = LocalDateTime.now();
        writer.write(time + " " + info.getLastName() + " " + info.getFirstName() + " " + info.getPhoneNumber() + " " + info.getProposal() + "\n");
        writer.write("-----------------------------------------------------------------" + "\n");
        writer.close();
    }

    private void smsStatus() {
        Status status = new Status();
        status.setLogin(LOGIN);
        status.setPsw(PASSWORD);
        status.setId(String.valueOf(smsCount));
        status.setPhone("+38" + info.getPhoneNumber());
        status.setAll("1");
        StatusResponse response = port.getStatus(status);
        String text = response.getStatusresult().getStatus();
        switch (text) {
            case "-3":
                System.out.println("Сообщение не найдено");
                break;
            case "-1":
                System.out.println("Сообщение ожидает отправки");
                break;
            case "0":
                System.out.println("Сообщение передано оператору");
                break;
            case "1":
                System.out.println("Сообщение доставлено");
                break;
            case "3":
                System.out.println("Сообщение просрочено");
                break;
            case "20":
                System.out.println("Сообщение невозможно доставить");
                break;
            case "22":
                System.out.println("Неверный номер");
                break;
            case "23":
                System.out.println("Сообщение запрещено");
                break;
            case "24":
                System.out.println("Недостаточно средств на счету");
                break;
            case "25":
                System.out.println("Недоступный номер");
                break;
        }
    }
}
