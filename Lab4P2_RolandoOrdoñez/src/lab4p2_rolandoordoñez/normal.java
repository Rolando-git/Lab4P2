package lab4p2_rolandoordoñez;

public class normal extends empleados {

    private int contrato;

    public normal() {
        super();
    }

    public normal(int contrato, String nombre, String apellido, int id, String nacionalidad) {
        super(nombre, apellido, id, nacionalidad);
        this.contrato = contrato;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return super.toString() + "contrato=" + contrato;
    }

    @Override
    public double sueldo() {
        return (12000*8)/2*contrato;
    }

}
