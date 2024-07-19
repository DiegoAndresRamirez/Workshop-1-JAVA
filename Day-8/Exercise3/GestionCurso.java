package Exercise3;

import java.util.ArrayList;

public class GestionCurso {
    private ArrayList<Curso> gestionCursos = new ArrayList<>();

    public GestionCurso(ArrayList<Curso> gestionCursos){
        this.gestionCursos = gestionCursos;
    }

    public ArrayList<Curso> getGestionCursos() {
        return gestionCursos;
    }

    public void setGestionCursos(ArrayList<Curso> gestionCursos) {
        this.gestionCursos = gestionCursos;
    }

    public void agregarCursos(Curso curso){
        gestionCursos.add(curso);
        System.out.println("Se ha agregado el curso correctamente");
    }
    public void inscribirEstudiante(Estudiante estudiante, String nombreCurso){
        for (Curso cur : gestionCursos){
            if(cur.getNombre().equalsIgnoreCase(nombreCurso)){
                cur.agregarEstudiantes(estudiante);
                System.out.println("Se agrego al estudiante en el curso correctamente");
            }else{
                System.out.println("no se encontro el curso");
            }
        }
    }

    public void eliminarEstudiante(String nombreCurso, String nombreEstudiante){
        boolean encontrado = false;
        for (int i = 0; i < gestionCursos.size(); i++) {
            Curso cur = gestionCursos.get(i);
            if(cur.getNombre().equalsIgnoreCase(nombreCurso)){
                for (int j = 0; j < cur.getListaEsudiantes().size(); j++) {
                    Estudiante estu = cur.getListaEsudiantes().get(j);
                    if(estu.getNombre().equalsIgnoreCase(nombreEstudiante)){
                        cur.getListaEsudiantes().remove(j);
                        System.out.println("Se elimino el estudiante correctamente");
                        break;
                    }
                }
            }
        }
        if(!encontrado){
            System.out.println("No se encontro el estudiante");
        }
    }

    public void mostrarEstudiantes(String nombreCurso){
        for (Curso cur : gestionCursos){
            if(cur.getNombre().equalsIgnoreCase(nombreCurso)){
                for (Estudiante est : cur.getListaEsudiantes()){
                    System.out.println("Id: " +  est.getId());
                    System.out.println("Nombre: " + est.getNombre());
                    System.out.println("Email: " + est.getEmail());
                }
            }
        }
    }
}
