package ua.gotsman.sms;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import jxl.read.biff.BiffException;

import java.io.IOException;

/**
 * Created by denis on 12.05.16.
 *
 */
public class Controller {
    @FXML
    public Button start;
    @FXML
    public Button stop;

    @FXML
    public void btnStart() throws IOException, BiffException {
        Sms.sendSms(new Info());
    }

    @FXML
    public void btnStop() {

    }
}
