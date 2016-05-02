import jxl.read.biff.BiffException;

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
        Path path = Paths.get("D:\\1.xls");
        while (true) {
            if (Files.exists(path)) {
                InputStream inputStream = new FileInputStream(String.valueOf(path));
                Info info = new Info();
                info.loadFromXls(inputStream);
                System.out.println(info.getFirstName() + " " + info.getLastName());
                System.out.println(info.getPhoneNumber());
                System.out.println(info.getProposal());
                for (int i = 0; i < info.getService().size(); i++) {
                    System.out.println(info.getService().get(i) + " amount: " + info.getAmount().get(i) + " price: " + info.getPrice().get(i));
                }
                System.out.println("Total: " + info.getTotal());
                inputStream.close();
                Files.delete(path);
            }
        }
    }
}
