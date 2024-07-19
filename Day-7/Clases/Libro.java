package Clases;

public class Libro {
//    1. Clase básica de un Libro: Crea una clase Libro que tenga los atributos
//    título, autor, año de publicación y si está o no prestado. Incluye métodos
//    para modificar y obtener el estado de los atributos. Por último, implementa
//    un método para prestar y devolver el libro, cambiando el estado de prestado
//    acorde.

    private String title;
    private String autor;
    private String añoPublication;
    private String status;

    public Libro(String title, String autor, String añoPublication, String status){
        this.title = title;
        this.autor = autor;
        this.añoPublication = añoPublication;
        this.status = status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAñoPublication(String añoPublication) {
        this.añoPublication = añoPublication;
    }

    public String getAñoPublication() {
        return añoPublication;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void prestarLibrito(String searchTitle){
        if(this.title.equalsIgnoreCase(searchTitle)){
            if(this.status.equalsIgnoreCase("disponible")){
                setStatus("ocupado");
                System.out.println("se presto el libro");
            }
        }else{
            System.out.println("no se encontro el libro...");
        }
    }

    public void devolverLibrito(String searchTitle){
        if(this.title.equalsIgnoreCase(searchTitle)){
            if(this.status.equalsIgnoreCase("ocupado")){
                setStatus("disponible");
                System.out.println("se devolvio el libro");
            }
        }else{
            System.out.println("no se encontro el libro...");
        }
    }

    public void mostrarLibro(String searchTitle){
        if(this.title.equalsIgnoreCase(searchTitle)){
            System.out.println("titulo: " + this.title);
            System.out.println("autor: " + this.autor);
            System.out.println("año publicacion: " + this.añoPublication);
            System.out.println("estado: " + this.status);
        }else{
            System.out.println("no se encontro el libro...");
        }
    }
}
