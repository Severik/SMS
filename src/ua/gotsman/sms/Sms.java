package ua.gotsman.sms;

import jxl.read.biff.BiffException;
import ua.smsc.sys.soap.Send;
import ua.smsc.sys.soap.Service;
import ua.smsc.sys.soap.ServiceSoap;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Денис on 04/16/2016.
 * Формирует СМС и отправляет его на сервис TurboSMS.ua
 */
public class Sms {

    public static void main(String[] args) throws IOException, BiffException {
        Service service = new Service();
        ServiceSoap port = service.getServiceSoap();
        Send send = new Send();
        send.setLogin("Severik");
        send.setPsw("Derparol12!@");
        send.setSender("SoftTechno");
        send.setTime("0");
        Path path = Paths.get("D:\\1.xls");
        /*while (true) {
            if (Files.exists(path)) {
                InputStream inputStream = new FileInputStream(String.valueOf(path));
                Info info = new Info();
                info.loadFromXls(inputStream);
                inputStream.close();
                Files.delete(path);
            }
        }*/
    }
}
