package lab4p2_rolandoordoñez;

public class proyectos {

    private String nombre;
    private String empresa;
    private String descripcion;
    private int duracion;
    private String estado;
    private int directores;
    private int desarrolladores;
    private int consultores;

    public proyectos() {
    }

    public proyectos(String nombre, String empresa, String descripcion, int duracion, String estado, int directores, int desarrolladores, int consultores) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.estado = estado;
        this.directores = directores;
        this.desarrolladores = desarrolladores;
        this.consultores = consultores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDirectores() {
        return directores;
    }

    public void setDirectores(int directores)throws miException {
        if (directores<=2&&desarrolladores>0)
        {
            this.directores = directores;
        }
        else
        {
            throw new miException("Maximo 2 directores por proyecto");
        }
    }

    public int getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(int desarrolladores)throws miException {
        if (desarrolladores<=5&&desarrolladores>0)
        {
            this.desarrolladores = desarrolladores;
        }
        else
        {
            throw new miException("Maximo 5 desarrolladores por proyecto");
        }
    }

    public int getConsultores() {
        return consultores;
    }

    public void setConsultores(int consultores)throws miException {
        if (consultores<=3&&consultores>0)
        {
            this.consultores = consultores;
        }
        else
        {
            throw new miException("Maximo 3 consultores por proyecto");
        }
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", empresa=" + empresa + ", descripcion=" + descripcion + ", duracion=" + duracion + ", estado=" + estado + ", directores=" + directores + ", desarrolladores=" + desarrolladores + ", consultores=" + consultores + " ";
    }

}
