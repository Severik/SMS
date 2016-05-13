package ua.gotsman.sms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Created by denis on 12.05.16.
 *
 */
public class Controller {

    @FXML
    public void btnStart(ActionEvent actionEvent) {
        System.out.println("Поехали!!!");
    }
    @FXML
    public void btnStop(ActionEvent actionEvent) {
        System.out.println("Стоп машина!!!");
    }
}
