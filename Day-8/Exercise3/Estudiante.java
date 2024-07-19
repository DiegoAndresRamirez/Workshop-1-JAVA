package Exercise3;

public class Estudiante {
    private static Integer contador = 1;
    private Integer Id;
    private String nombre;
    private String email;

    public Estudiante(String nombre, String email){
        this.Id = contador++;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
