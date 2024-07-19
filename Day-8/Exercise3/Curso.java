package Exercise3;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEsudiantes = new ArrayList<Estudiante>();

    public Curso(String codigo, String nombre, ArrayList<Estudiante> listaEstudiantes){
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEsudiantes = listaEstudiantes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEsudiantes() {
        return listaEsudiantes;
    }

    public void setListaEsudiantes(ArrayList<Estudiante> listaEsudiantes) {
        this.listaEsudiantes = listaEsudiantes;
    }

    public void agregarEstudiantes(Estudiante estudiante){
        listaEsudiantes.add(estudiante);
        System.out.println("Se ha agregado el estudiante al curso correctamente");
    }
}
