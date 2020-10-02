       
    package ventas;
   /**
    *
    * @author Alvarado Montes
    */

         public class Cliente {
            private String nombre;
            private String apellido;
            private String direccion;
            private int id;
            private static int sigIdCliente=1;

            public Cliente() {
              this.id=sigIdCliente++;
            }

            public Cliente(String nombre, String apellido, String direccion) {
                this.id=sigIdCliente++;
                this.nombre = nombre;
                this.apellido = apellido;
                this.direccion = direccion;
               
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getApellido() {
                return apellido;
            }

            public void setApellido(String apellido) {
                this.apellido = apellido;
            }

            public String getDireccion() {
                return direccion;
            }

            public void setDireccion(String direccion) {
                this.direccion = direccion;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

        @Override
        public String toString() {
        return "[Cliente]" +
                "Id=" + id +
                ", Nombre=" + nombre +
                ", Apellido=" + apellido +
                ", Direccion=" + direccion;
    }

 }
