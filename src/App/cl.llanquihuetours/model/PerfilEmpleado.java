package App.cl.llanquihuetours.model;

public class PerfilEmpleado extends InfoPersona {

    private String cargoEmpleado;
    private String tipoDeContrato;
    private int añoDeIngreso;
    private String locacion;

    public PerfilEmpleado(String nombrePersona,String rutPersona, String correoElectronico, String telefono, ContactoPersona contactoPersona, String cargoEmpleado, String tipoDeContrato, int añoDeIngreso, String locacion) {
        super(nombrePersona,rutPersona,correoElectronico,telefono,contactoPersona);
        this.cargoEmpleado = cargoEmpleado;
        this.tipoDeContrato = tipoDeContrato;
        this.añoDeIngreso = añoDeIngreso;
        this.locacion = locacion;
    }

    //Getters
    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public String getLocacion() {
        return locacion;
    }

    //Setters
    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\n== PERFIL EMPLEADO ==\n"+
                "Cargo: "+cargoEmpleado+
                "\n Tipo de contrato: "+tipoDeContrato+
                "\n Año de ingreso: "+añoDeIngreso+
                "\n Locacion: "+locacion;
    }

}