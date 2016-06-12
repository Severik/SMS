package ua.gotsman.sms;

import jxl.read.biff.BiffException;
import ua.smsc.sys.soap.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Формирует СМС и отправляет его на шлюз smsc.ua через SOAP протокол
 */
class Sms implements Runnable {
    private final static String LOGIN = "Severik";
    private final static String PASSWORD = "Derparol12!@";
    private Path path = Paths.get("D:\\1.xls");
    private Info info = new Info();
    private Service service = new Service();
    private ServiceSoap port = service.getServiceSoap();
    int stopTime = 0;

    @Override
    public void run() {
        while (true) {
            if (stopTime == 1) break;
            if (Files.exists(path)) {
                try (InputStream inputStream = new FileInputStream(String.valueOf(path))){
                    info.loadFromXls(inputStream);
                    sendSms();
                    Files.delete(path);
                } catch (IOException | BiffException e) {
                    System.out.println(e);
                }
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

    public void sendSms () {
        Send send = new Send();
        send.setLogin(LOGIN);
        send.setPsw(PASSWORD);
        send.setPhones(info.getPhoneNumber());
        send.setMes("This is test message, please don't response");
        send.setId("");
        send.setSender("SoftTechno");
        send.setTime("0");
        port.sendSms(send);
    }
}
