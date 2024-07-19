package Exercise1;

public class Producto {
    private static Integer contador = 1;
    private Integer Id;
    private String nombre;
    private Float precio;

    public Producto(String nombre, Float precio){
        this.Id = contador++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }


}
