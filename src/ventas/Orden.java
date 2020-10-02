
package ventas;

import java.util.Date;

/**
 *
 * @author Alvarado Montes
 */
public class Orden {
       private int id;
       private Cliente cliente;
       private ItemOrden item1;
       private ItemOrden item2;
       private Date fechaOrden;
       private double precioEnvio;
       private double total;
       private String tipoEnvio;
       private String estado;
       private static int sigIdOrden=1;
       private int diasEnvio;

    public Orden() {
        this.id=sigIdOrden++;
        this.total=0.0;
        this.fechaOrden=new Date();
    }

    public Orden(Date pFecha) {
        this.id=sigIdOrden++;
        this.total=0.0;
        this.fechaOrden=pFecha;
    }
    
    public Orden(int pCliente, Date pFecha){
        
    }
    public void getTotalOrden(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemOrden getItem1() {
        return item1;
    }

    public void setItem1(ItemOrden item1) {
        this.item1 = item1;
    }

    public ItemOrden getItem2() {
        return item2;
    }

    public void setItem2(ItemOrden item2) {
        this.item2 = item2;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getSigIdOrden() {
        return sigIdOrden;
    }

    public static void setSigIdOrden(int sigIdOrden) {
        Orden.sigIdOrden = sigIdOrden;
    }

    public int getDiasEnvio() {
        return diasEnvio;
    }

    public void setDiasEnvio(int diasEnvio) {
        this.diasEnvio = diasEnvio;
    }
    
    
       
}
