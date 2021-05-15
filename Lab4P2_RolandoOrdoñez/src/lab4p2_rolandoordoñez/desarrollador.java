package lab4p2_rolandoordoñez;

public class desarrollador extends empleados {

    private int proyectos;
    private int realizados;
    private int experiencia;
    private int contrato;
    private String lenguaje;
    private int horas;

    public desarrollador() {
        super();
    }

    public desarrollador(int proyectos, int realizados, int experiencia, int contrato, String lenguaje, int horas, String nombre, String apellido, int id, String nacionalidad) {
        super(nombre, apellido, id, nacionalidad);
        this.proyectos = proyectos;
        this.realizados = realizados;
        this.experiencia = experiencia;
        this.contrato = contrato;
        this.lenguaje = lenguaje;
        this.horas = horas;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public int getRealizados() {
        return realizados;
    }

    public void setRealizados(int realizados) {
        this.realizados = realizados;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return super.toString() + "proyectos=" + proyectos + ", realizados=" + realizados + ", experiencia=" + experiencia + ", contrato=" + contrato + ", lenguaje=" + lenguaje + ", horas=" + horas;
    }

    @Override
    public double sueldo() {
        return (realizados * 115000 * 2) / proyectos + contrato;
    }

}
