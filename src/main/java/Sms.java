import jxl.read.biff.BiffException;
import ua.in.turbosms.api.turbo.Auth;
import ua.in.turbosms.api.turbo.SendSMS;
import ua.in.turbosms.api.turbo.Service;

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
public class Sms{

    public static void main(String[] args) throws IOException, BiffException {
        Service service = new Service();
        service.getServiceSoap();
        Auth auth = new Auth();
        auth.setLogin("Severik");
        auth.setPassword("cdjkjxm666");
        Path path = Paths.get("D:\\1.xls");
        //while (true) {
            //if (Files.exists(path)) {
                InputStream inputStream = new FileInputStream(String.valueOf(path));
                Info info = new Info();
                info.loadFromXls(inputStream);
                SendSMS sendSMS = new SendSMS();
                sendSMS.setSender("+380665367875");
                sendSMS.setDestination("+380953545044");
                sendSMS.setText("test");
                inputStream.close();
                Files.delete(path);
            }
        }
    //}
//}
