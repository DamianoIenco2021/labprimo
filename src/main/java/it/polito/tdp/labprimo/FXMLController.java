package it.polito.tdp.labprimo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {
 

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPassword;

    @FXML
    private Label lblRisposta;

    @FXML
    void handleAccedi(ActionEvent event) {
    	this.lblRisposta.setDisable(true);
    	
    	String user=txtNome.getText();
    	String pass=txtPassword.getText();
    	
    	if(user.length()==0 && pass.length()==0) {
    		lblRisposta.setText("Devi Riempire i campi di accesso!");
    	}

    	if(pass.length()<7 && !pass.contains("!") && !pass.contains("?") && !pass.contains("@") && !pass.contains("#")) {
    		lblRisposta.setText("La password deve avere almeno 7 caratteri e contenere un carattere speciale tra !-?-@-#");
    		return;
    	}
    	
    	
    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblRisposta != null : "fx:id=\"lblRisposta\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}