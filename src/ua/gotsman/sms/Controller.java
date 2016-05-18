package ua.gotsman.sms;

import javafx.fxml.FXML;

public class Controller {

    @FXML
    public void btnStart() {
        Thread thread = new Thread(new Sms());
        thread.start();
    }

    @FXML
    public void btnStop() {
        Sms.stopTime = 1;
    }
}
