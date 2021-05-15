package lab4p2_rolandoordoñez;

public class consultor extends empleados {

    private int proyectos;
    private int asignados;
    private int contrato;
    private String experiencia;
    private int consultoria;

    public consultor() {
        super();
    }

    public consultor(int proyectos, int asignados, int contrato, String experiencia, int consultoria, String nombre, String apellido, int id, String nacionalidad) {
        super(nombre, apellido, id, nacionalidad);
        this.proyectos = proyectos;
        this.asignados = asignados;
        this.contrato = contrato;
        this.experiencia = experiencia;
        this.consultoria = consultoria;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public int getAsignados() {
        return asignados;
    }

    public void setAsignados(int asignados) {
        this.asignados = asignados;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getConsultoria() {
        return consultoria;
    }

    public void setConsultoria(int consultoria) {
        this.consultoria = consultoria;
    }

    @Override
    public String toString() {
        return super.toString() + "proyectos=" + proyectos + ", asignados=" + asignados + ", contrato=" + contrato + ", experiencia=" + experiencia + ", consultoria=" + consultoria;
    }

    @Override
    public double sueldo() {
        return (proyectos * 13280 * 4.13) / (asignados + contrato);
    }

}
