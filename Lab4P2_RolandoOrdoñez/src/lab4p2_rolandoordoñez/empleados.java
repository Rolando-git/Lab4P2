package lab4p2_rolandoordoñez;

public abstract class empleados {

    private String nombre;
    private String apellido;
    private int id;
    private String nacionalidad;

    public empleados() {
    }

    public empleados(String nombre, String apellido, int id, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nacionalidad=" + nacionalidad + " ";
    }

    public abstract double sueldo();
}
