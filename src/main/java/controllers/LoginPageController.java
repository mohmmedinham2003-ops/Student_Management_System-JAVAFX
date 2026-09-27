package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController {

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        String name = txtUserName.getText();
        String password = txtPassword.getText();
        boolean b = checkUserNameandPassword(name,password);

        System.out.println(b);
    }

    private boolean checkUserNameandPassword(String name, String password) {
        if(name.equals("nimal") && password.equals("1234")){
            return true;
        }
        return false;
    }
}
