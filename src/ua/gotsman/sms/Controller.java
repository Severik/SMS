package ua.gotsman.sms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ua.smsc.sys.soap.Send;

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
    private Sms sms = new Sms();


    @FXML
    public void btnStart() throws InterruptedException {
        Thread thread = new Thread(sms);
        thread.start();
    }

    @FXML
    public void btnStop() {
        sms.stopTime = 1;
    }

    @FXML
    public void showBalance() {
        balanceField.setText("Баланс: " + sms.getUserBalance() + " грн.");
    }

    @FXML
    public void smsCount () {
        smsCount.setText("СМС отправлено: " + String.valueOf(sms.smsCount));
    }

    @FXML
    public void accept () {
        String phoneNumber = enterPhone.getText();
        String message = enterSms.getText();
        Send send = new Send();
        send.setLogin(Sms.getLogin());
        send.setPsw(Sms.getPassword());
        send.setPhones("+38" + phoneNumber);
        send.setMes(message);
        send.setSender("SoftTechno");
        send.setTime("0");
        sms.getPort().sendSms(send);
        enterPhone.clear();
        enterSms.clear();
    }

    @FXML
    public void cancel () {
        enterPhone.clear();
        enterSms.clear();
    }
}
