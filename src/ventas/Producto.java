
package ventas;

/**
 *
 * @author Alvarado Montes
 */
public class Producto {
    private int codigo;
    private String nombreProducto;
    private double precioUnitario;
    private double precioPorMayor;
    private int cantidad;
    private int id;
    private static int sigIdProducto=2000;

    public Producto() {
        this.id=sigIdProducto++;
    }
   
    public Producto(int codigo, String nombreProducto, double precioUnitario, double precioPorMayor, int cantidad) {
        this.id=sigIdProducto++;
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.precioPorMayor = precioPorMayor;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioPorMayor() {
        return precioPorMayor;
    }

    public void setPrecioPorMayor(double precioPorMayor) {
        this.precioPorMayor = precioPorMayor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[Producto]" +
                " id=" + id +
                ", codigo=" + codigo + 
                ", nombreProducto=" + nombreProducto + 
                ", precioUnitario=" + precioUnitario + 
                ", precioPorMayor=" + precioPorMayor + 
                ", cantidad=" + cantidad ;
    }
       
}
