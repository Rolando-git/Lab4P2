package lab4p2_rolandoordoñez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_RolandoOrdoñez {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<empleados> lista = new ArrayList();
    static ArrayList<proyectos> lista_proyectos = new ArrayList();

    public static void main(String[] args) throws miException {
        boolean finPrograma = false;
        while (finPrograma == false) {
            int opcion;
            System.out.println("1.admin");
            System.out.println("2.desarrollador");
            System.out.println("3.consultor");
            System.out.println("4.director");
            System.out.println("5.salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {
                    int contra;
                    System.out.println("Ingrese contraseña");
                    contra = entrada.nextInt();
                    if (contra == 1234) {
                        int op;
                        System.out.println("1.crear desarrollador");
                        System.out.println("2.modificar desarrollador");
                        System.out.println("3.eliminar desarollador");
                        System.out.println("4.crear director");
                        System.out.println("5.modificar director");
                        System.out.println("6.eliminar director");
                        System.out.println("7.crear consultor");
                        System.out.println("8.modificar consultor");
                        System.out.println("9.eliminar consultor");
                        System.out.println("10.crear empleado");
                        System.out.println("11.modificar empleado");
                        System.out.println("12.eliminar empleado");
                        System.out.println("13.crear proytecto");
                        System.out.println("14.eliminar proyecto");
                        op = entrada.nextInt();
                        switch (op) {
                            case 1: {
                                crearDesarrollador();
                            }
                            break;
                            case 2: {
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i) instanceof desarrollador) {
                                        System.out.println(i + "" + lista.get(i));
                                    }
                                }
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                modDesarrollador(p);
                            }
                            break;
                            case 3: {
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i) instanceof desarrollador) {
                                        System.out.println(i + "" + lista.get(i));
                                    }
                                }
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                if (lista.get(p) instanceof desarrollador) {
                                    lista.remove(p);
                                } else {
                                    System.out.println("no es un desarrollador");
                                }
                            }
                            break;
                            case 4: {
                                crearDirector();
                            }
                            break;
                            case 5: {
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i) instanceof director) {
                                        System.out.println(i + "" + lista.get(i));
                                    }
                                }
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                modDirector(p);
                            }
                            break;
                            case 6: {
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i) instanceof director) {
                                        System.out.println(i + "" + lista.get(i));
                                    }
                                }
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                if (lista.get(p) instanceof director) {
                                    lista.remove(p);
                                } else {
                                    System.out.println("no es un director");
                                }
                            }
                            break;
                            case 7: {
                                crearConsultor();
                            }
                            break;
                            case 8: {
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i) instanceof consultor) {
                                        System.out.println(i + "" + lista.get(i));
                                    }
                                }
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                modConsultor(p);
                            }
                            break;
                            case 9: {
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i) instanceof consultor) {
                                        System.out.println(i + "" + lista.get(i));
                                    }
                                }
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                if (lista.get(p) instanceof consultor) {
                                    lista.remove(p);
                                } else {
                                    System.out.println("no es un consultor");
                                }
                            }
                            break;
                            case 10: {
                                crearNormal();
                            }
                            break;
                            case 11: {
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i) instanceof normal) {
                                        System.out.println(i + "" + lista.get(i));
                                    }
                                }
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                modNormal(p);
                            }
                            break;
                            case 12: {
                                for (int i = 0; i < lista.size(); i++) {
                                    if (lista.get(i) instanceof normal) {
                                        System.out.println(i + "" + lista.get(i));
                                    }
                                }
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                if (lista.get(p) instanceof normal) {
                                    lista.remove(p);
                                } else {
                                    System.out.println("no es un empleado normal");
                                }
                            }
                            break;
                            case 13: {
                                crearProyecto();
                            }
                            break;
                            case 14: {
                                int p;
                                System.out.println("Ingrese posicion a eliminar");
                                p = entrada.nextInt();
                                lista_proyectos.remove(p);
                            }
                            break;
                            default:
                                System.out.println("Error");
                        }
                    } else {
                        System.out.println("contraseña incorrecta");
                    }
                }
                break;
                case 2: {
                    int p;
                    System.out.println("Ingrese su posicion");
                    p = entrada.nextInt();
                    if (lista.get(p) instanceof desarrollador) {
                        System.out.println(lista.get(p));
                    } else {
                        System.out.println("Esa posicion no es de desarrollador");
                    }
                    char s;
                    System.out.println("Eliminar esta posicion?[s/n]");
                    s = entrada.next().charAt(0);
                    if (s == 's' || s == 'S') {
                        lista.remove(p);
                    }
                }
                break;
                case 3: {
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) instanceof consultor) {
                            System.out.println(i + "" + lista.get(i));
                        }
                    }

                    int p;
                    System.out.println("Ingrese su posicion");
                    p = entrada.nextInt();
                    if (lista.get(p) instanceof consultor) {
                        int op;
                        System.out.println("1.ver su informacion");
                        System.out.println("2.modificar su informacion");
                        System.out.println("3.elminar cuenta");
                        op = entrada.nextInt();
                        switch (op) {
                            case 1: {
                                System.out.println(lista.get(p));
                                System.out.println(lista_proyectos);
                            }
                            break;
                            case 2: {
                                modConsultor(p);
                            }
                            break;
                            case 3: {
                                lista.remove(p);
                            }
                            break;
                            default:
                                System.out.println("opcion no valida");
                        }
                    } else {
                        System.out.println("no es consultor");
                    }
                }
                break;
                case 4: {
                    int op;
                    System.out.println("1.crear desarrollador");
                    System.out.println("2.modificar desarrollador");
                    System.out.println("3.eliminar desarrollador");
                    System.out.println("4.crear consultor");
                    System.out.println("5.modificar consultor");
                    System.out.println("6.eliminar consultor");
                    System.out.println("7.modificar estado de proyecto");
                    op = entrada.nextInt();
                    switch (op) {
                        case 1: {
                            crearDesarrollador();
                        }
                        break;
                        case 2: {
                            for (int i = 0; i < lista.size(); i++) {
                                if (lista.get(i) instanceof desarrollador) {
                                    System.out.println(i + "" + lista.get(i));
                                }
                            }
                            int p;
                            System.out.println("Ingrese posicion a eliminar");
                            p = entrada.nextInt();
                            modDesarrollador(p);
                        }
                        break;
                        case 3: {
                            int p;
                            System.out.println("Ingrese posicion a eliminar");
                            p = entrada.nextInt();
                            lista.remove(p);
                        }
                        break;
                        case 4: {
                            crearConsultor();
                        }
                        break;
                        case 5: {
                            int p;
                            System.out.println("Ingrese posicion a modificar");
                            p = entrada.nextInt();
                            modConsultor(p);
                        }
                        break;
                        case 6: {
                            int p;
                            System.out.println("Ingrese posicion a eliminar");
                            p = entrada.nextInt();
                            lista.remove(p);
                        }
                        break;
                        case 7: {
                            for (int i = 0; i < lista_proyectos.size(); i++) {
                                System.out.println(i + "" + lista_proyectos.get(i));
                            }
                            int p;
                            System.out.println("Ingrese posicion a editar");
                            p = entrada.nextInt();
                            modProyecto(p);
                        }
                        break;
                        default:
                            System.out.println("Error");
                    }
                }
                break;
                case 5: {
                    System.out.println("Fin del programa");
                    finPrograma = true;
                }
                break;
                default:
                    System.out.println("Error,opcion no valida");
            }
        }
    }

    public static void crearDesarrollador() {
        int proyectos;
        System.out.println("cantidad de proyectos asignados");
        proyectos = entrada.nextInt();
        int realizados;
        System.out.println("cantidad de proyectos realizados");
        realizados = entrada.nextInt();
        int experiencia;
        System.out.println("años de experiencia");
        experiencia = entrada.nextInt();
        int contrato;
        System.out.println("de cuantos años es el contrato");
        contrato = entrada.nextInt();
        String lenguaje;
        System.out.println("lenguaje de programacion favorito");
        lenguaje = entrada.next();
        int horas;
        System.out.println("horas diaras que trabaja");
        horas = entrada.nextInt();
        String nombre;
        System.out.println("su nombre");
        nombre = entrada.next();
        String apellido;
        System.out.println("su apellido");
        apellido = entrada.next();
        int id;
        System.out.println("su numero de ID");
        id = entrada.nextInt();
        String nacionalidad;
        System.out.println("su nacionalidad");
        nacionalidad = entrada.next();
        empleados E = new desarrollador(proyectos, realizados, experiencia, contrato, lenguaje, horas, nombre, apellido, id, nacionalidad);
        lista.add(E);
    }

    public static void modDesarrollador(int p) {
        int proyectos;
        System.out.println("cantidad de proyectos asignados");
        proyectos = entrada.nextInt();
        int realizados;
        System.out.println("cantidad de proyectos realizados");
        realizados = entrada.nextInt();
        int experiencia;
        System.out.println("años de experiencia");
        experiencia = entrada.nextInt();
        int contrato;
        System.out.println("de cuantos años es el contrato");
        contrato = entrada.nextInt();
        String lenguaje;
        System.out.println("lenguaje de programacion favorito");
        lenguaje = entrada.next();
        int horas;
        System.out.println("horas diaras que trabaja");
        horas = entrada.nextInt();
        String nombre;
        System.out.println("su nombre");
        nombre = entrada.next();
        String apellido;
        System.out.println("su apellido");
        apellido = entrada.next();
        int id;
        System.out.println("su numero de ID");
        id = entrada.nextInt();
        String nacionalidad;
        System.out.println("su nacionalidad");
        nacionalidad = entrada.next();
        ((desarrollador) lista.get(p)).setProyectos(proyectos);
        ((desarrollador) lista.get(p)).setRealizados(realizados);
        ((desarrollador) lista.get(p)).setExperiencia(experiencia);
        ((desarrollador) lista.get(p)).setContrato(contrato);
        ((desarrollador) lista.get(p)).setLenguaje(lenguaje);
        ((desarrollador) lista.get(p)).setHoras(horas);
        ((desarrollador) lista.get(p)).setNombre(nombre);
        ((desarrollador) lista.get(p)).setApellido(apellido);
        ((desarrollador) lista.get(p)).setId(id);
        ((desarrollador) lista.get(p)).setNacionalidad(nacionalidad);
    }

    public static void crearDirector() {
        int puesto;
        System.out.println("años durante su puesto");
        puesto = entrada.nextInt();
        int contrato;
        System.out.println("de cuantos años es su contrato");
        contrato = entrada.nextInt();
        ArrayList<String> desarrolladores = new ArrayList();
        char a = 's';
        while (a == 's' || a == 'S') {
            String n;
            System.out.println("Ingrese nombre de desarrolador a asignar");
            n = entrada.next();
            desarrolladores.add(n);
            System.out.println("Asignar otro?[s/n]");
            a = entrada.next().charAt(0);
        }
        ArrayList<String> consultores = new ArrayList();
        char b = 's';
        while (b == 's' || b == 'S') {
            String n;
            System.out.println("Ingrese nombre de consultor a asignar");
            n = entrada.next();
            consultores.add(n);
            System.out.println("Asignar otro?[s/n]");
            b = entrada.next().charAt(0);
        }
        int proyectos;
        System.out.println("cantidad de proyectos asignados");
        proyectos = entrada.nextInt();
        int realizados;
        System.out.println("cantidad de proyectos realizados");
        realizados = entrada.nextInt();
        String nombre;
        System.out.println("su nombre");
        nombre = entrada.next();
        String apellido;
        System.out.println("su apellido");
        apellido = entrada.next();
        int id;
        System.out.println("su numero de ID");
        id = entrada.nextInt();
        String nacionalidad;
        System.out.println("su nacionalidad");
        nacionalidad = entrada.next();
        empleados E = new director(puesto, contrato, desarrolladores, consultores, proyectos, realizados, nombre, apellido, id, nacionalidad);
        lista.add(E);
    }

    public static void modDirector(int p) {
        int puesto;
        System.out.println("años durante su puesto");
        puesto = entrada.nextInt();
        int contrato;
        System.out.println("de cuantos años es su contrato");
        contrato = entrada.nextInt();
        ArrayList<String> desarrolladores = new ArrayList();
        char a = 's';
        while (a == 's' || a == 'S') {
            String n;
            System.out.println("Ingrese nombre de desarrolador a asignar");
            n = entrada.next();
            desarrolladores.add(n);
            System.out.println("Asignar otro?[s/n]");
            a = entrada.next().charAt(0);
        }
        ArrayList<String> consultores = new ArrayList();
        char b = 's';
        while (b == 's' || b == 'S') {
            String n;
            System.out.println("Ingrese nombre de consultor a asignar");
            n = entrada.next();
            consultores.add(n);
            System.out.println("Asignar otro?[s/n]");
            b = entrada.next().charAt(0);
        }
        int proyectos;
        System.out.println("cantidad de proyectos asignados");
        proyectos = entrada.nextInt();
        int realizados;
        System.out.println("cantidad de proyectos realizados");
        realizados = entrada.nextInt();
        String nombre;
        System.out.println("su nombre");
        nombre = entrada.next();
        String apellido;
        System.out.println("su apellido");
        apellido = entrada.next();
        int id;
        System.out.println("su numero de ID");
        id = entrada.nextInt();
        String nacionalidad;
        System.out.println("su nacionalidad");
        nacionalidad = entrada.next();
        ((director) lista.get(p)).setPuesto(puesto);
        ((director) lista.get(p)).setContrato(contrato);
        ((director) lista.get(p)).setDesarrolladores(desarrolladores);
        ((director) lista.get(p)).setConsultores(consultores);
        ((director) lista.get(p)).setProyectos(proyectos);
        ((director) lista.get(p)).setRealizados(realizados);
        ((director) lista.get(p)).setNombre(nombre);
        ((director) lista.get(p)).setApellido(apellido);
        ((director) lista.get(p)).setId(id);
        ((director) lista.get(p)).setNacionalidad(nacionalidad);
    }

    public static void crearConsultor() {
        int proyectos;
        System.out.println("proyectos realizados");
        proyectos = entrada.nextInt();
        int asignados;
        System.out.println("proyectos asignados");
        asignados = entrada.nextInt();
        int contrato;
        System.out.println("de cuantos años es el contrato");
        contrato = entrada.nextInt();
        String experiencia;
        System.out.println("campo de experiencia");
        experiencia = entrada.next();
        int consultoria;
        System.out.println("duracion en horas de su consultoria");
        consultoria = entrada.nextInt();
        String nombre;
        System.out.println("su nombre");
        nombre = entrada.next();
        String apellido;
        System.out.println("su apellido");
        apellido = entrada.next();
        int id;
        System.out.println("su numero de ID");
        id = entrada.nextInt();
        String nacionalidad;
        System.out.println("su nacionalidad");
        nacionalidad = entrada.next();
        empleados E = new consultor(proyectos, asignados, contrato, experiencia, consultoria, nombre, apellido, id, nacionalidad);
        lista.add(E);
    }

    public static void modConsultor(int p) {
        int proyectos;
        System.out.println("proyectos realizados");
        proyectos = entrada.nextInt();
        int asignados;
        System.out.println("proyectos asignados");
        asignados = entrada.nextInt();
        int contrato;
        System.out.println("de cuantos años es el contrato");
        contrato = entrada.nextInt();
        String experiencia;
        System.out.println("campo de experiencia");
        experiencia = entrada.next();
        int consultoria;
        System.out.println("duracion en horas de su consultoria");
        consultoria = entrada.nextInt();
        String nombre;
        System.out.println("su nombre");
        nombre = entrada.next();
        String apellido;
        System.out.println("su apellido");
        apellido = entrada.next();
        int id;
        System.out.println("su numero de ID");
        id = entrada.nextInt();
        String nacionalidad;
        System.out.println("su nacionalidad");
        nacionalidad = entrada.next();
        ((consultor) lista.get(p)).setProyectos(proyectos);
        ((consultor) lista.get(p)).setAsignados(asignados);
        ((consultor) lista.get(p)).setContrato(contrato);
        ((consultor) lista.get(p)).setExperiencia(experiencia);
        ((consultor) lista.get(p)).setConsultoria(consultoria);
        ((consultor) lista.get(p)).setNombre(nombre);
        ((consultor) lista.get(p)).setApellido(apellido);
        ((consultor) lista.get(p)).setId(id);
        ((consultor) lista.get(p)).setNacionalidad(nacionalidad);
    }

    public static void crearNormal() {
        int contrato;
        System.out.println("de cuantos años es su contrato");
        contrato = entrada.nextInt();
        String nombre;
        System.out.println("su nombre");
        nombre = entrada.next();
        String apellido;
        System.out.println("su apellido");
        apellido = entrada.next();
        int id;
        System.out.println("su numero de ID");
        id = entrada.nextInt();
        String nacionalidad;
        System.out.println("su nacionalidad");
        nacionalidad = entrada.next();
        empleados E = new normal(contrato, nombre, apellido, id, nacionalidad);
        lista.add(E);
    }

    public static void modNormal(int p) {
        int contrato;
        System.out.println("de cuantos años es su contrato");
        contrato = entrada.nextInt();
        String nombre;
        System.out.println("su nombre");
        nombre = entrada.next();
        String apellido;
        System.out.println("su apellido");
        apellido = entrada.next();
        int id;
        System.out.println("su numero de ID");
        id = entrada.nextInt();
        String nacionalidad;
        System.out.println("su nacionalidad");
        nacionalidad = entrada.next();
        ((normal) lista.get(p)).setContrato(contrato);
        ((normal) lista.get(p)).setNombre(nombre);
        ((normal) lista.get(p)).setApellido(apellido);
        ((normal) lista.get(p)).setId(id);
        ((normal) lista.get(p)).setNacionalidad(nacionalidad);
    }

    public static void crearProyecto() throws miException {
        proyectos P = new proyectos();
        String nombre;
        System.out.println("nombre del proyecto");
        nombre = entrada.next();
        P.setNombre(nombre);
        String empresa;
        System.out.println("empresa que solicito el proyecto");
        empresa = entrada.next();
        P.setEmpresa(empresa);
        String descripcion;
        System.out.println("Descripcion del proyecto");
        descripcion = entrada.next();
        P.setDescripcion(descripcion);
        int duracion;
        System.out.println("años de duracion del proyecto");
        duracion = entrada.nextInt();
        P.setDuracion(duracion);
        String estado;
        System.out.println("Estado: iniciado/en desarrollo/terminado");
        estado = entrada.next();
        P.setEstado(estado);
        int directores;
        System.out.println("directores a cargo del proyecto");
        directores = entrada.nextInt();
        try {
            P.setDirectores(directores);
        } catch (miException e) {
            if (directores > 2) {
                P.setDirectores(2);
            } else {
                if (directores <= 0) {
                    P.setDirectores(1);
                }
            }
        }
        int desarrolladores;
        System.out.println("desarrolladores a cargo del proyecto");
        desarrolladores = entrada.nextInt();
        try {
            P.setDesarrolladores(desarrolladores);
        } catch (miException e) {
            if (desarrolladores > 5) {
                P.setDesarrolladores(5);
            } else {
                if (desarrolladores <= 0) {
                    P.setDesarrolladores(1);
                }
            }
        }
        int consultores;
        System.out.println("consultores a cargo del proyecto");
        consultores = entrada.nextInt();
        try {
            P.setConsultores(consultores);
        } catch (miException e) {
            if (consultores > 3) {
                P.setConsultores(3);
            } else {
                if (consultores <= 0) {
                    P.setConsultores(1);
                }
            }
        }
        lista_proyectos.add(P);
    }

    public static void modProyecto(int p) {
        String estado;
        System.out.println("Estado: iniciado/en desarrollo/terminado");
        estado = entrada.next();
        ((proyectos) lista_proyectos.get(p)).setEstado(estado);
    }
}
