package App.cl.llanquihuetours.model;

public class ContactoPersona {
    private String calle;
    private int numero;
    private String ciudad;
    private String region;

    public ContactoPersona(String calle, int numero, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "==CONTACTO== \n"+"Dirección :"+calle+numero+
                "\nCiudad:"+ciudad+
                "\nRegion:"+region;
    }
}
