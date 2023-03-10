/**
 * Sample Skeleton for 'PatientShowInfo.fxml' Controller Class
 */

package il.cshaifasweng.OCSFMediatorExample.client;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PatientShowInfoController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="app_status_txt"
    private Text app_status_txt; // Value injected by FXMLLoader

    @FXML // fx:id="clinic_name_txt"
    private TextField clinic_name_txt; // Value injected by FXMLLoader

    @FXML // fx:id="email_txt"
    private TextField email_txt; // Value injected by FXMLLoader

    @FXML // fx:id="firstName_txt"
    private TextField firstName_txt; // Value injected by FXMLLoader

    @FXML // fx:id="hello_user_lbl"
    private Text hello_user_lbl; // Value injected by FXMLLoader

    @FXML // fx:id="lastName_txt"
    private TextField lastName_txt; // Value injected by FXMLLoader

    @FXML // fx:id="logout_btn"
    private FontAwesomeIconView logout_btn; // Value injected by FXMLLoader

    @FXML // fx:id="make_app_btn"
    private Button make_app_btn; // Value injected by FXMLLoader

    @FXML // fx:id="profile_btn"
    private Button profile_btn; // Value injected by FXMLLoader

    @FXML // fx:id="reload_btn"
    private Button reload_btn; // Value injected by FXMLLoader

    @FXML // fx:id="show_app_btn"
    private Button show_app_btn; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert app_status_txt != null : "fx:id=\"app_status_txt\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert clinic_name_txt != null : "fx:id=\"clinic_name_txt\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert email_txt != null : "fx:id=\"email_txt\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert firstName_txt != null : "fx:id=\"firstName_txt\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert hello_user_lbl != null : "fx:id=\"hello_user_lbl\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert lastName_txt != null : "fx:id=\"lastName_txt\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert logout_btn != null : "fx:id=\"logout_btn\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert make_app_btn != null : "fx:id=\"make_app_btn\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert profile_btn != null : "fx:id=\"profile_btn\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert reload_btn != null : "fx:id=\"reload_btn\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";
        assert show_app_btn != null : "fx:id=\"show_app_btn\" was not injected: check your FXML file 'PatientShowInfo.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
