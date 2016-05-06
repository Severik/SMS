import jxl.read.biff.BiffException;

import java.io.*;
import java.util.Date;

/**
 * Created by Денис on 04/16/2016.
 * Формирует СМС и отправляет его на сервис TurboSMS.ua
 */
public class Sms {

    public static void main(String[] args) throws IOException, BiffException {
        File file = new File("D:\\123.xls");
        Date now = new Date();
        Date modified;
            if (file.exists()) {
                modified = new Date(file.lastModified());
                if (modified.compareTo(now) == 1) {
                    InputStream inputStream = new FileInputStream(file);
                    Info info = new Info();
                    fgh
                    info.loadFromXls(inputStream);
                    System.out.println(info.getFirstName() + " " + info.getLastName());
                    System.out.println(info.getPhoneNumber());
                    System.out.println(info.getProposal());
                    for (int i = 0; i < info.getService().size(); i++) {
                        System.out.println(info.getService().get(i) + " amount: " + info.getAmount().get(i) + " price: " + info.getPrice().get(i));
                    }
                    System.out.println("Total: " + info.getTotal());
                    inputStream.close();
            }
        }
    }
}
