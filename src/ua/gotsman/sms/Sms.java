package ua.gotsman.sms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import jxl.read.biff.BiffException;
import ua.smsc.sys.soap.Service;
import ua.smsc.sys.soap.ServiceSoap;

import javax.swing.*;
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
public class Sms extends Application {
    private final static String LOGIN = "Severik";
    private final static String PASSWORD = "Derparol12!@";
    private final static String SENDER = "SoftTechno";
    private final static String TIME = "0";

    public static void main(String[] args) throws IOException, BiffException {
        launch(args);
        /*Service service = new Service();
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
        }*/
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Центр управления полетами");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
