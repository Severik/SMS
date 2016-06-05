package ua.gotsman.sms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    public Button start;
    public Button stop;
    public Button balance;
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
    public void btnBalance() {
        System.out.println(sms.getUserBalance());
    }
}
