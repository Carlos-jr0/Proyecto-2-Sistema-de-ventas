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
    private TableColumn columIdI;
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
    private TableColumn columIdE;
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
    @FXML
    private TextField txtClienteOrden;
    @FXML
    private TextField txtProductoOrden;
    @FXML
    private TextField txtDiasEnvio;
    @FXML
    private TextField txtPrecioEnvio;
    @FXML
    private TextField txtTipoEnvio;
    @FXML
    private TextField txtEstado;
    @FXML
    private TableColumn columnaId;
    @FXML
    private TableColumn columnaClienteOrden;
    @FXML
    private TableColumn columnaProductoOrden;
    @FXML
    private TableColumn columnaDiasEnvio;
    @FXML
    private TableColumn columnaPrecioEnvio;
    @FXML
    private TableColumn columnaTipoEnvio;
    @FXML
    private TableColumn columnaEstado;
    @FXML
    private TableColumn columnaFecha;
    @FXML
    private TableColumn columnaTotal;
    @FXML
    private TableView<Orden> tblOrdenDeCompra;
    private ObservableList<Orden> orden;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       //Agregar datos a tabla clientes individuales
        individual=FXCollections.observableArrayList();
        this.columIdI.setCellValueFactory(new PropertyValueFactory("id"));
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
        this.columIdE.setCellValueFactory(new PropertyValueFactory("id"));
        this.columCodigoProducto.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.columNombreProducto.setCellValueFactory(new PropertyValueFactory("nombreProducto"));
        this.columPrecioUnitario.setCellValueFactory(new PropertyValueFactory("precioUnitario"));
        this.columPrecioMayor.setCellValueFactory(new PropertyValueFactory("precioPorMayor"));
        this.ColumCantidadProducto.setCellValueFactory(new PropertyValueFactory("cantidad"));
      //Agregar datos a la tabla de Ordenes de compra  
        orden=FXCollections.observableArrayList();
        this.columnaId.setCellValueFactory(new PropertyValueFactory("id"));
        this.columnaClienteOrden.setCellValueFactory(new PropertyValueFactory("pCliente"));
        this.columnaProductoOrden.setCellValueFactory(new PropertyValueFactory("pIdProducto"));
        this.columnaDiasEnvio.setCellValueFactory(new PropertyValueFactory("diasEnvio"));
        this.columnaPrecioEnvio.setCellValueFactory(new PropertyValueFactory("precioEnvio"));
        this.columnaTipoEnvio.setCellValueFactory(new PropertyValueFactory("tipoEnvio"));
        this.columnaEstado.setCellValueFactory(new PropertyValueFactory("estado"));
        this.columnaFecha.setCellValueFactory(new PropertyValueFactory("fechaOrden"));
        this.columnaTotal.setCellValueFactory(new PropertyValueFactory("precioEnvio"));
    }    
    //agregar datos a la tabla de clientes individuales
    @FXML
    private void agregarClientes(ActionEvent event) {
        Individual i=new Individual(this.txtNombre.getText(), this.txtApellido.getText(),
                this.txtDireccion.getText(), this.txtDpi.getText());
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
            Individual aux=new Individual(this.txtNombre.getText(),this.txtApellido.getText(), 
                    this.txtDireccion.getText(), txtDpi.getText());
            
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
        Empresa e= new Empresa(this.txtNombreEm.getText(), this.txtApellidoEmp.getText(), this.txtDireccionEmp.getText(),
        this.txtContactoEmp.getText(), Integer.parseInt(this.txtDescuestoEmp.getText()));
        
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
            Empresa aux=new Empresa(this.txtNombreEm.getText(), this.txtApellidoEmp.getText(), this.txtDireccionEmp.getText(),
            this.txtContactoEmp.getText(), Integer.parseInt(this.txtDescuestoEmp.getText()));
            
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
            Producto p=new Producto(Integer.parseInt(this.txtCodigoProducto.getText()), this.txtNombreProducto.getText(),
            Double.parseDouble(this.txtPrecioUnitario.getText()), Double.parseDouble(this.txtPrecioMayor.getText()),
            Integer.parseInt(this.txtCantidadProducto.getText()));
        
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
            Producto aux=new Producto(Integer.parseInt(this.txtCodigoProducto.getText()), this.txtNombreProducto.getText(),
            Double.parseDouble(this.txtPrecioUnitario.getText()), Double.parseDouble(this.txtPrecioMayor.getText()),
            Integer.parseInt(this.txtCantidadProducto.getText()));
            
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
    
     @FXML
    private void agregarOrdenDeCompra(ActionEvent event) {
      Orden o=new Orden(Integer.parseInt(this.txtClienteOrden.getText()), Integer.parseInt(this.txtProductoOrden.getText()),
      Integer.parseInt(this.txtDiasEnvio.getText()), Double.parseDouble(this.txtPrecioEnvio.getText()),
      this.txtTipoEnvio.getText(), this.txtEstado.getText());
      
        if(!this.orden.contains(o)){
            this.orden.add(o);
            this.tblOrdenDeCompra.setItems(orden);
        }
        this.txtClienteOrden.setText("");
        this.txtProductoOrden.setText("");
        this.txtDiasEnvio.setText("");
        this.txtPrecioEnvio.setText("");
        this.txtTipoEnvio.setText("");
        this.txtEstado.setText("");
    }
    @FXML
    private void seleccionarOrdenDeCompra(javafx.scene.input.MouseEvent event) {
         Orden o=this.tblOrdenDeCompra.getSelectionModel().getSelectedItem();
        if(o !=null){
            this.txtClienteOrden.setText(o.getCliente() +"");
            this.txtProductoOrden.setText(o.getpIdProducto() +"");
            this.txtDiasEnvio.setText(o.getDiasEnvio() +"");
            this.txtPrecioEnvio.setText(o.getPrecioEnvio() +"");
            this.txtTipoEnvio.setText(o.getTipoEnvio());
            this.txtEstado.setText(o.getEstado());
            
        }
    }

    @FXML
    private void modificarOrdenDeCompra(ActionEvent event) {
       Orden o=this.tblOrdenDeCompra.getSelectionModel().getSelectedItem();
        if(o ==null){
           Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor seleccionar un producto");
            alert.showAndWait(); 
        }else{
            Orden aux=new Orden(Integer.parseInt(this.txtClienteOrden.getText()), Integer.parseInt(this.txtProductoOrden.getText()),
      Integer.parseInt(this.txtDiasEnvio.getText()), Double.parseDouble(this.txtPrecioEnvio.getText()),
      this.txtTipoEnvio.getText(), this.txtEstado.getText());
            
            if(!this.orden.contains(aux)){
                o.setpCliente(aux.getpCliente());
                o.setpIdProducto(aux.getpIdProducto());
                o.setDiasEnvio(aux.getDiasEnvio());
                o.setPrecioEnvio(aux.getPrecioEnvio());
                o.setTipoEnvio(aux.getTipoEnvio());
                o.setEstado(aux.getEstado());
                   
                   this.tblOrdenDeCompra.refresh();
                   Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("Producto modificado");
                    alert.showAndWait();
                
            }
        }
        this.txtClienteOrden.setText("");
        this.txtProductoOrden.setText("");
        this.txtDiasEnvio.setText("");
        this.txtPrecioEnvio.setText("");
        this.txtTipoEnvio.setText("");
        this.txtEstado.setText("");
         
    }

    @FXML
    private void eliminarOrdenDeCompra(ActionEvent event) {
         Orden o=this.tblOrdenDeCompra.getSelectionModel().getSelectedItem();
        if(o ==null){
           Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Por favor seleccionar un producto");
            alert.showAndWait(); 
        }else{
            this.orden.remove(o);
            this.tblOrdenDeCompra.refresh();
            
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Producto eliminado");
            alert.showAndWait();
        }  
    }
    
    /*
    Empieza el control para los botones superiores para hacer visibles los paneles que contienen los datos*/
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
