
package ventas;

/**
 *
 * @author Alvarado Montes
 */
public class Individual extends Cliente {
    private String dpi;

    public Individual(String nombre, String apellido, String noTelefono, String direccion, String dpi) {
        super(nombre, apellido, noTelefono, direccion);
        this.dpi = dpi;
    }
    
    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return super.toString().concat("DPI=" + dpi); 
    }
    
    
    
}
