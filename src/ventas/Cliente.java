        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */
        package ventas;

        public class Cliente {
            private String nombre;
            private String apellido;
            private String noTelefono;
            private String direccion;
            private int id;
            private static int sigIdCliente=1;

            public Cliente() {
              this.id=sigIdCliente++;
            }

            public Cliente(String nombre, String apellido, String noTelefono, String direccion, int id) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.noTelefono = noTelefono;
                this.direccion = direccion;
                this.id=id;


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

            public String getNoTelefono() {
                return noTelefono;
            }

            public void setNoTelefono(String noTelefono) {
                this.noTelefono = noTelefono;
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

            public String toString(){
                return null;

            }

        }