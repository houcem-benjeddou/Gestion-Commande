/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panier.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import panier.Entities.panier;
import panier.Services.servicepanier;

/**
 * FXML Controller class
 *
 * @author benje
 */
public class PanierController implements Initializable {

    @FXML
    private TextField idField;
    @FXML
    private TextField prixField;
    servicepanier sp = new servicepanier();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterPanier(ActionEvent event) {
        panier p= new panier();
        p.setId_oeuvre(Integer.parseInt(idField.getText()));
        p.setPrix_Total(Float.parseFloat(prixField.getText()));
        sp.add(p);
        
    }
    
}
