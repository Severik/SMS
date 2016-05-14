package ua.gotsman.sms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Created by denis on 12.05.16.
 */
public class Controller {

    @FXML
    public Button start;
    @FXML
    public Button stop;

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
