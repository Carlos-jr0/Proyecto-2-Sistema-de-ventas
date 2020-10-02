/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alvarado Montes
 */
public class SistemaVentasController implements Initializable {
     @FXML
    private AnchorPane clienteIndividualPanel;
    @FXML
    private AnchorPane clienteEmpresaPanel;
    @FXML
    private AnchorPane productoPanel;
    @FXML
    private AnchorPane ordenPanel;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtDpi;
    @FXML
    private TableView<Individual> tblClientesIndividuales;
    @FXML
    private TableColumn columId;
    @FXML
    private TableColumn columNombre;
    @FXML
    private TableColumn columApellido;
    @FXML
    private TableColumn columDireccion;
    @FXML
    private TableColumn columDpi;
    
    private ObservableList<Individual> individual;
    @FXML
    private TextField txtNombreEm;
    @FXML
    private TextField txtApellidoEmp;
    @FXML
    private TextField txtDireccionEmp;
    @FXML
    private TextField txtContactoEmp;
    @FXML
    private TableView<Empresa> tblClientesEmpresas;
    @FXML
    private TableColumn colIdEmp;
    @FXML
    private TableColumn colNombreEmp;
    @FXML
    private TableColumn colApellidoEmp;
    @FXML
    private TableColumn colDireccionEmp;
    @FXML
    private TableColumn colContactoEmp;
    @FXML
    private TableColumn colDescuentoEmp;
    @FXML
    private TextField txtDescuestoEmp;
    
    private ObservableList<Empresa> empresa;
    @FXML
    private TextField txtCodigoProducto;
    @FXML
    private TextField txtNombreProducto;
    @FXML
    private TextField txtPrecioUnitario;
    @FXML
    private TextField txtPrecioMayor;
    @FXML
    private TextField txtCantidadProducto;
    @FXML
    private TableView<Producto> tblProducto;
    @FXML
    private TableColumn columCodigoProducto;
    @FXML
    private TableColumn columNombreProducto;
    @FXML
    private TableColumn columPrecioUnitario;
    @FXML
    private TableColumn columPrecioMayor;
    @FXML
    private TableColumn ColumCantidadProducto;
    private ObservableList<Producto> producto;    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       //Agregar datos a tabla clientes individuales
        individual=FXCollections.observableArrayList();
        this.columId.setCellValueFactory(new PropertyValueFactory("id"));
        this.columNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.columApellido.setCellValueFactory(new PropertyValueFactory("apellido"));
        this.columDireccion.setCellValueFactory(new PropertyValueFactory("direccion"));
        this.columDpi.setCellValueFactory(new PropertyValueFactory("dpi"));
     //Agregar datos a la tabla clientes empresas
        empresa=FXCollections.observableArrayList();
        this.colIdEmp.setCellValueFactory(new PropertyValueFactory("id"));
        this.colNombreEmp.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidoEmp.setCellValueFactory(new PropertyValueFactory("apellido"));
        this.colDireccionEmp.setCellValueFactory(new PropertyValueFactory("direccion"));
        this.colContactoEmp.setCellValueFactory(new PropertyValueFactory("contacto"));
        this.colDescuentoEmp.setCellValueFactory(new PropertyValueFactory("descuento"));
     //Agregar datos a la tabla de productos
        producto=FXCollections.observableArrayList();
        this.columId.setCellValueFactory(new PropertyValueFactory("id"));
        this.columCodigoProducto.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.columNombreProducto.setCellValueFactory(new PropertyValueFactory("nombreProducto"));
        this.columPrecioUnitario.setCellValueFactory(new PropertyValueFactory("precioUnitario"));
        this.columPrecioMayor.setCellValueFactory(new PropertyValueFactory("precioPorMayor"));
        this.ColumCantidadProducto.setCellValueFactory(new PropertyValueFactory("cantidad"));
    }    
    //agregar datos a la tabla de clientes individuales
    @FXML
    private void agregarClientes(ActionEvent event) {
        String nombre=this.txtNombre.getText();
        String apellido=this.txtApellido.getText();
        String direccion=this.txtDireccion.getText();
        String dpi=this.txtDpi.getText();
        
        Individual i=new Individual(nombre, apellido, direccion, dpi);
        
        if(!this.individual.contains(i)){
            this.individual.add(i);
            this.tblClientesIndividuales.setItems(individual);
        }
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtDireccion.setText("");
        this.txtDpi.setText("");
        
    }
    
    
    @FXML
    private void seleccionar(javafx.scene.input.MouseEvent event) {
        Individual i=this.tblClientesIndividuales.getSelectionModel().getSelectedItem();
        if(i !=null){
            this.txtNombre.setText(i.getNombre());
            this.txtApellido.setText(i.getApellido());
            this.txtDireccion.setText(i.getDireccion());
            this.txtDpi.setText(i.getDpi());
            
        }
    }
    
     @FXML
    private void modificarClientesIndividuales(ActionEvent event) {
        Individual i=this.tblClientesIndividuales.getSelectionModel().getSelectedItem();
        if(i ==null){
           Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor seleccionar un cliente");
            alert.showAndWait(); 
        }else{
            String nombre=this.txtNombre.getText();
            String apellido=this.txtApellido.getText();
            String direccion=this.txtDireccion.getText();
            String dpi=this.txtDpi.getText();
            
            Individual aux=new Individual(nombre, apellido, direccion, dpi);
            
            if(!this.individual.contains(aux)){
                i.setNombre(aux.getNombre());
                 i.setApellido(aux.getApellido());
                  i.setDireccion(aux.getDireccion());
                   i.setDpi(aux.getDpi());
                   
                   this.tblClientesIndividuales.refresh();
                   Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Cliente modificado");
                    alert.showAndWait();
                
            }
        }
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtDireccion.setText("");
        this.txtDpi.setText("");
        
    }
      
    @FXML
    private void eliminarClientesIndividuales(ActionEvent event) {
        Individual i=this.tblClientesIndividuales.getSelectionModel().getSelectedItem();
        if(i ==null){
           Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor seleccionar un cliente");
            alert.showAndWait(); 
        }else{
            this.individual.remove(i);
            this.tblClientesIndividuales.refresh();
            
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Cliente eliminado");
            alert.showAndWait();
        }
    }
    //agregar datos a la tabla de clientes de empresas
    @FXML
    private void agregarClientesEmpresas(ActionEvent event) {
      String nombre=this.txtNombreEm.getText();
        String apellido=this.txtApellidoEmp.getText();
        String direccion=this.txtDireccionEmp.getText();
        String contacto=this.txtContactoEmp.getText();
        int descuento=Integer.parseInt(this.txtDescuestoEmp.getText());
        
        Empresa e= new Empresa(nombre, apellido, direccion, contacto, descuento);
        
        if(!this.empresa.contains(e)){
            this.empresa.add(e);
            this.tblClientesEmpresas.setItems(empresa);
        }
        this.txtNombreEm.setText("");
        this.txtApellidoEmp.setText("");
        this.txtDireccionEmp.setText("");
        this.txtContactoEmp.setText("");  
        this.txtDescuestoEmp.setText("");  
    }
     @FXML
    private void seleccionarTablaEmpresa(javafx.scene.input.MouseEvent event) {
        Empresa e=this.tblClientesEmpresas.getSelectionModel().getSelectedItem();
        if(e !=null){
            this.txtNombreEm.setText(e.getNombre());
            this.txtApellidoEmp.setText(e.getApellido());
            this.txtDireccionEmp.setText(e.getDireccion());
            this.txtContactoEmp.setText(e.getContacto());
            this.txtDescuestoEmp.setText(e.getDescuento() + "");
            
        }
    }
    
      @FXML
    private void modificarClientesEmpresas(ActionEvent event) {
        Empresa e=this.tblClientesEmpresas.getSelectionModel().getSelectedItem();
        if(e ==null){
           Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor seleccionar un cliente");
            alert.showAndWait(); 
        }else{
            String nombre=this.txtNombreEm.getText();
            String apellido=this.txtApellidoEmp.getText();
            String direccion=this.txtDireccionEmp.getText();
            String contacto=this.txtContactoEmp.getText();
            int descuento=Integer.parseInt(this.txtDescuestoEmp.getText());
            
            Empresa aux=new Empresa(nombre, apellido, direccion, contacto, descuento);
            
            if(!this.empresa.contains(aux)){
                e.setNombre(aux.getNombre());
                 e.setApellido(aux.getApellido());
                  e.setDireccion(aux.getDireccion());
                   e.setContacto(aux.getContacto());
                   e.setDescuento(aux.getDescuento());
                   
                   this.tblClientesEmpresas.refresh();
                   Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Cliente modificado");
                    alert.showAndWait();
                
            }
        }
        this.txtNombreEm.setText("");
        this.txtApellidoEmp.setText("");
        this.txtDireccionEmp.setText("");
        this.txtContactoEmp.setText("");
        this.txtDescuestoEmp.setText("");
        
    }

    @FXML
    private void eliminarClientesEmpresas(ActionEvent event) {
       Empresa e=this.tblClientesEmpresas.getSelectionModel().getSelectedItem();
        if(e ==null){
           Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor seleccionar un cliente");
            alert.showAndWait(); 
        }else{
            this.empresa.remove(e);
            this.tblClientesEmpresas.refresh();
            
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Cliente eliminado");
            alert.showAndWait();
        } 
    }
    //agregar datos a la tabla de producto
    @FXML
    private void agregarProducto(ActionEvent event) {
        int codigo=Integer.parseInt(this.txtCodigoProducto.getText());
        String nombreProducto=this.txtNombreProducto.getText();
        double precioUnitario=Double.parseDouble(this.txtPrecioUnitario.getText());
        double precioMayor=Double.parseDouble(this.txtPrecioMayor.getText());
        int cantidad=Integer.parseInt(this.txtCantidadProducto.getText());
        
            Producto p=new Producto(codigo, nombreProducto, precioUnitario, precioMayor, cantidad );
        
        if(!this.producto.contains(p)){
            this.producto.add(p);
            this.tblProducto.setItems(producto);
        }
        this.txtCodigoProducto.setText("");
        this.txtNombreProducto.setText("");
        this.txtPrecioUnitario.setText("");
        this.txtPrecioMayor.setText("");
        this.txtCantidadProducto.setText("");
        
    }
    
    @FXML
    private void seleccionarTablaProducto(javafx.scene.input.MouseEvent event) {
        Producto p=this.tblProducto.getSelectionModel().getSelectedItem();
        if(p !=null){
            this.txtCodigoProducto.setText(p.getCodigo() +"");
            this.txtNombreProducto.setText(p.getNombreProducto());
            this.txtPrecioUnitario.setText(p.getPrecioUnitario() +"");
            this.txtPrecioMayor.setText(p.getPrecioPorMayor() +"");
            this.txtCantidadProducto.setText(p.getCantidad() + "");
            
        }
    }
    
     @FXML
    private void modificarProductos(ActionEvent event) {
        Producto p=this.tblProducto.getSelectionModel().getSelectedItem();
        if(p ==null){
           Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor seleccionar un producto");
            alert.showAndWait(); 
        }else{
            int codigo=Integer.parseInt(this.txtCodigoProducto.getText());
            String nombreProducto=this.txtNombreProducto.getText();
            double precioUnitario=Double.parseDouble(this.txtPrecioUnitario.getText());
            double precioMayor=Double.parseDouble(this.txtPrecioMayor.getText());
            int cantidad=Integer.parseInt(this.txtCantidadProducto.getText());
            
            Producto aux=new Producto(codigo, nombreProducto, precioUnitario, precioMayor, cantidad);
            
            if(!this.producto.contains(aux)){
                p.setCodigo(aux.getCodigo());
                 p.setNombreProducto(aux.getNombreProducto());
                  p.setPrecioUnitario(aux.getPrecioUnitario());
                   p.setPrecioPorMayor(aux.getPrecioPorMayor());
                   p.setCantidad(aux.getCantidad());
                   
                   this.tblProducto.refresh();
                   Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Producto modificado");
                    alert.showAndWait();
                
            }
        }
        this.txtCodigoProducto.setText("");
        this.txtNombreProducto.setText("");
        this.txtPrecioUnitario.setText("");
        this.txtPrecioMayor.setText("");
        this.txtCantidadProducto.setText("");
    }

    @FXML
    private void eliminarProductos(ActionEvent event) {
       Producto p=this.tblProducto.getSelectionModel().getSelectedItem();
        if(p ==null){
           Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor seleccionar un producto");
            alert.showAndWait(); 
        }else{
            this.producto.remove(p);
            this.tblProducto.refresh();
            
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Producto eliminado");
            alert.showAndWait();
        }  
        
    }
    /*
    Empieza el control para los botones superiores y los paneles*/
    @FXML
    private void productoClicked(ActionEvent event) {
        if (productoPanel.isVisible()) {
            productoPanel.setVisible(false);
        }
        productoPanel.setVisible(true);
        
        clienteIndividualPanel.setVisible(false);
        clienteEmpresaPanel.setVisible(false);
        ordenPanel.setVisible(false);
    }

    @FXML
    private void ordenClicked(ActionEvent event) {
        if (ordenPanel.isVisible()) {
            ordenPanel.setVisible(false);
        }
        ordenPanel.setVisible(true);
        
        clienteIndividualPanel.setVisible(false);
        clienteEmpresaPanel.setVisible(false);
        productoPanel.setVisible(false);
    }

    @FXML
    private void clienteIndividualClicked(ActionEvent event) {
         if (clienteIndividualPanel.isVisible()) {
            clienteIndividualPanel.setVisible(false);
        }
        clienteIndividualPanel.setVisible(true);
        
        clienteEmpresaPanel.setVisible(false);
        productoPanel.setVisible(false);
        ordenPanel.setVisible(false);
    }
    

    @FXML
    private void clienteEmpresaClicked(ActionEvent event) {
        if (clienteEmpresaPanel.isVisible()) {
            clienteEmpresaPanel.setVisible(false);
        }
        clienteEmpresaPanel.setVisible(true);
        
        clienteIndividualPanel.setVisible(false);
        productoPanel.setVisible(false);
        ordenPanel.setVisible(false);
    }

   

}
