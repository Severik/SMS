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
 * Created by Денис on 04/16/2016.
 * Формирует СМС и отправляет его на шлюз smsc.ua через SOAP протокол
 */
public class Sms {
    private final static String login = "Severik";
    private final static String password = "Derparol12!@";
    private final static String sender = "SoftTechno";
    private final static String time = "0";

    public static void main(String[] args) throws IOException, BiffException {
        Service service = new Service();
        ServiceSoap port = service.getServiceSoap();
        Path path = Paths.get("D:\\1.xls");
        while (true) {
            if (Files.exists(path)) {
                InputStream inputStream = new FileInputStream(String.valueOf(path));
                Info info = new Info();
                info.loadFromXls(inputStream);

                inputStream.close();
                Files.delete(path);
            }
        }
    }
}
