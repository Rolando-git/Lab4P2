package lab4p2_rolandoordoñez;

import java.util.ArrayList;

public class director extends empleados {

    private int puesto;
    private int contrato;
    private ArrayList<String> desarrolladores;
    private ArrayList<String> consultores;
    private int proyectos;
    private int realizados;

    public director() {
        super();
    }

    public director(int puesto, int contrato, ArrayList<String> desarrolladores, ArrayList<String> consultores, int proyectos, int realizados, String nombre, String apellido, int id, String nacionalidad) {
        super(nombre, apellido, id, nacionalidad);
        this.puesto = puesto;
        this.contrato = contrato;
        this.desarrolladores = desarrolladores;
        this.consultores = consultores;
        this.proyectos = proyectos;
        this.realizados = realizados;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public ArrayList<String> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(ArrayList<String> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList<String> getConsultores() {
        return consultores;
    }

    public void setConsultores(ArrayList<String> consultores) {
        this.consultores = consultores;
    }

    public int getRealizados() {
        return realizados;
    }

    public void setRealizados(int realizados) {
        this.realizados = realizados;
    }

    @Override
    public String toString() {
        return super.toString() + "puesto=" + puesto + ", contrato=" + contrato + ", desarrolladores=" + desarrolladores + ", consultores=" + consultores + ", proyectos=" + proyectos + ", realizados=" + realizados;
    }

    @Override
    public double sueldo() {
        return (realizados*proyectos*consultores.size()*desarrolladores.size()*5.23)/(proyectos*contrato*2.28);
    }

}
