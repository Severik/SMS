package ua.gotsman.sms;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import ua.smsc.sys.soap.Send;

import java.io.IOException;

public class Controller {

    public Button start;
    public Button stop;
    public Button log;
    public Button accept;
    public Button cancel;
    public TextArea mainTextArea;
    public TextField balanceField;
    public TextField smsCount;
    public Hyperlink siteLink;
    public TextField enterPhone;
    public TextArea enterSms;
    private String phoneNumber;
    private String message;
    private Sms sms = new Sms();

    @FXML
    void btnStart() throws InterruptedException, IOException {
        Task showStatus = new Task<TextArea>() {
            @Override
            protected TextArea call() throws Exception {
                int count = 1;
                while (Sms.stopTime == 0) {
                    if (count < Sms.smsCount) {
                        mainTextArea.appendText(sms.showMainInfo());
                        showBalance();
                        smsCount();
                        count++;
                        Thread.sleep(1000);
                    }
                }
                return mainTextArea;
            }
        };
        Thread thread = new Thread(sms);
        Thread thread1 = new Thread(showStatus);
        thread.start();
        thread1.start();
    }

    @FXML
    void btnStop() {
        Sms.stopTime = 1;
    }

    @FXML
    private void showBalance() {
        balanceField.setText("Баланс: " + sms.getUserBalance() + " грн.");
    }

    @FXML
    private void smsCount() {
        smsCount.setText("СМС отправлено: " + String.valueOf(Sms.smsCount - 1));
    }

    @FXML
    void accept() {
        phoneNumber = enterPhone.getText();
        message = enterSms.getText();
        sendSms();
        Sms.smsCount++;
        smsCount();
        showBalance();
        enterPhone.clear();
        enterSms.clear();
    }

    @FXML
    void cancel() {
        enterPhone.clear();
        enterSms.clear();
    }

    private void sendSms() {
        Send send = new Send();
        send.setLogin(Sms.getLogin());
        send.setPsw(Sms.getPassword());
        send.setPhones("+38" + phoneNumber);
        send.setMes(message);
        send.setSender("SoftTechno");
        send.setTime("0");
        sms.getPort().sendSms(send);
    }
}
