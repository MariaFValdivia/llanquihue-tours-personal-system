package App.cl.llanquihuetours.model;

public class PerfilCliente extends InfoPersona {

private int IdCliente;

    public PerfilCliente(String nombrePersona,String rutPersona, String correoElectronico, String telefono, ContactoPersona contactoPersona, int IdCliente) {
        super(nombrePersona,rutPersona,correoElectronico,telefono,contactoPersona);
        this.IdCliente = IdCliente;
    }

    public int getIdCliente() {
        return IdCliente;
    }
    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
    @Override
    public String toString() {
        return super.toString()+ "\n==PERFIL CLIENTE== \n" + "ID Cliente" + IdCliente;
    }
}