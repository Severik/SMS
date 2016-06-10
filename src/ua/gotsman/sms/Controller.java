package ua.gotsman.sms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public Button start;
    public Button stop;
    public TextField balanceField;
    public Hyperlink siteLink;
    public TextField smsCount;
    public TextArea mainTextArea;
    public TextArea infoTextArea;
    private Sms sms = new Sms();

    @FXML
    public void btnStart() {
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
    public void smsCount() {
        smsCount.setText("СМС отправлено: " + sms.smsCount);
    }
}
