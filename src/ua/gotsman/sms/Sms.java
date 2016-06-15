package ua.gotsman.sms;

import jxl.read.biff.BiffException;
import ua.smsc.sys.soap.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;


/**
 * Формирует СМС и отправляет его на шлюз smsc.ua через SOAP протокол
 */
class Sms implements Runnable {
    private final static String LOGIN = "Severik";
    private final static String PASSWORD = "Derparol12!@";
    private final static Logger log = Logger.getLogger(Sms.class.getName());
    private Path path = Paths.get("D:\\");
    private Info info = new Info();
    private Service service = new Service();
    private ServiceSoap port = service.getServiceSoap();
    int stopTime = 0;
    int smsCount = 0;

    @Override
    public void run() {
        while (true) {
            if (stopTime == 1) break;
            if (Files.exists(path)) {
                try (DirectoryStream<Path> entries = Files.newDirectoryStream(path, "*xls")){
                    for (Path entry : entries) {
                        InputStream inputStream = new FileInputStream(String.valueOf(entry));
                        info.loadFromXls(inputStream);
                        inputStream.close();
                        sendSms();
                        Files.delete(path);
                        smsCount += 1;
                    }
                } catch (IOException | BiffException e) {
                    log.info(e.toString());
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stopTime = 0;
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
        send.setPhones("+38" + info.getPhoneNumber());
        send.setMes("This is test message, please don't response");
        send.setId("");
        send.setSender("SoftTechno");
        send.setTime("0");
        port.sendSms(send);
    }
}
