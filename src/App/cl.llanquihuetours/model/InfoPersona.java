package App.cl.llanquihuetours.model;

public class InfoPersona {

    private String nombrePersona;
    private String rutPersona;
    private String correoElectronico;
    private String telefono;
    private ContactoPersona contactoPersona;

    public InfoPersona (String nombrePersona,String rutPersona, String correoElectronico, String telefono, ContactoPersona contactoPersona) {
        this .nombrePersona = nombrePersona;
        this.rutPersona = rutPersona;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.contactoPersona = contactoPersona;
    }

    public boolean esEmpleado() {
        return this instanceof PerfilEmpleado;
    }

    public boolean esCliente() {
        return this instanceof PerfilCliente;
    }

     //Getters
        public String getNombrePersona() {
            return nombrePersona;
        }

        public String getRutPersona() {
            return rutPersona;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public String getTelefono() {
            return telefono;
        }

        public ContactoPersona getContactoPersona() {
        return contactoPersona;
        }

     // Setters
        public void setNombrePersona(String nombrePersona) {
            this.nombrePersona = nombrePersona;
        }

        public void setRutPersona(String rutPersona) {
            this.rutPersona = rutPersona;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public void setContactoPersona(ContactoPersona contactoPersona) {
        this.contactoPersona = contactoPersona;
        }

        @Override
        public String toString() {
            return "==INFORMACIÓN PERSONA ===\n" +
                    "Nombre Persona: " + nombrePersona + "\n" +
                    "Rut: " + rutPersona + "\n" +
                    "Correo Electronico: " + correoElectronico + "\n" +
                    "Telefono: " + telefono;
        }




    }

