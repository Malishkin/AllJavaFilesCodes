package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpfirstName;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUplasttName;

    @FXML
    private TextField login_field2;

    @FXML
    private TextField signUpCountry;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    void initialize() {
        assert signUpfirstName != null : "fx:id=\"signUpfirstName\" was not injected: check your FXML file 'signUp.fxml'.";
        assert password_field != null : "fx:id=\"password_field\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpButton != null : "fx:id=\"signUpButton\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUplasttName != null : "fx:id=\"signUplasttName\" was not injected: check your FXML file 'signUp.fxml'.";
        assert login_field2 != null : "fx:id=\"login_field2\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpCountry != null : "fx:id=\"signUpCountry\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpCheckBoxMale != null : "fx:id=\"signUpCheckBoxMale\" was not injected: check your FXML file 'signUp.fxml'.";
        assert signUpCheckBoxFemale != null : "fx:id=\"signUpCheckBoxFemale\" was not injected: check your FXML file 'signUp.fxml'.";

    }
}
