/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvarado Montes
 */
public class ControllerUsuario {
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasenia;

    @FXML
    private void validarUsuario(ActionEvent event) {
        if(txtUsuario.getText().equals("carlosA") && txtContrasenia.getText().equals("12345")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SistemaVentas.fxml"));
                AnchorPane root = (AnchorPane) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Sistema de Ventas");
                stage.setScene(new Scene(root, 600, 500));
                stage.show();

                
                Stage stage2 = (Stage) txtUsuario.getScene().getWindow();
                
                stage2.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña INCORRECTO");
        }

        
    }
  }
    

