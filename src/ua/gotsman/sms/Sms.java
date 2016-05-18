package ua.gotsman.sms;

import jxl.read.biff.BiffException;
import ua.smsc.sys.soap.Service;
import ua.smsc.sys.soap.ServiceSoap;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Формирует СМС и отправляет его на шлюз smsc.ua через SOAP протокол
 */
public class Sms {
    private final static String LOGIN = "Severik";
    private final static String PASSWORD = "Derparol12!@";
    private final static String SENDER = "SoftTechno";
    private final static String TIME = "0";

    public static void sendSms(Info info) throws IOException, BiffException {
        Service service = new Service();
        ServiceSoap port = service.getServiceSoap();
        Path path = Paths.get("D:\\1.xls");
        while (true) {
            if (Files.exists(path)) {
                InputStream inputStream = new FileInputStream(String.valueOf(path));
                info.loadFromXls(inputStream);
                inputStream.close();
                Files.delete(path);
            }
        }
    }
}
