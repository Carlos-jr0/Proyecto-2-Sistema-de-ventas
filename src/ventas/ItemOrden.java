
package ventas;

/**
 *
 * @author Alvarado Montes
 */
public class ItemOrden {
    private int noLinea;
    private int cantidad;
    private Producto producto;

    public ItemOrden(int pNoLinea, int pCantidad, Producto pIdProducto) {
        this.noLinea = pNoLinea;
        this.cantidad = pCantidad;
        this.producto=pIdProducto;
        
    }

    public int getNoLinea() {
        return noLinea;
    }

    public void setNoLinea(int noLinea) {
        this.noLinea = noLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "[ItemOrden]" + "noLinea=" + noLinea + ", cantidad=" + cantidad + ", producto=" + producto + '}';
    }
   
    
    public double getTotalItem(){
        return (producto.getPrecioUnitario())*cantidad;
        
    }
    
    
}
