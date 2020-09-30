/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Alvarado Montes
 */
public class SistemaVentasController implements Initializable {
    @FXML
    private AnchorPane clientePanel;
    @FXML
    private AnchorPane productoPanel;
    @FXML
    private AnchorPane ordenPanel;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clienteClicked(ActionEvent event) {
        if (clientePanel.isVisible()) {
            clientePanel.setVisible(false);
        }
        clientePanel.setVisible(true);
        
        productoPanel.setVisible(false);
        ordenPanel.setVisible(false);
    }

    @FXML
    private void productoClicked(ActionEvent event) {
        if (productoPanel.isVisible()) {
            productoPanel.setVisible(false);
        }
        productoPanel.setVisible(true);
        
        clientePanel.setVisible(false);
        ordenPanel.setVisible(false);
    }

    @FXML
    private void ordenClicked(ActionEvent event) {
        if (ordenPanel.isVisible()) {
            ordenPanel.setVisible(false);
        }
        ordenPanel.setVisible(true);
        
        clientePanel.setVisible(false);
        productoPanel.setVisible(false);
    }
}
