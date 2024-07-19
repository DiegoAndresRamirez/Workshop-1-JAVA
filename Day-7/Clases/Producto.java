package Clases;

public class Producto {
    private Integer Id;
    private static Integer contador = 1;
    private String nombre;
    private String Descripcion;
    private Integer Cantidad;

    public Producto(String nombre, String descripcion, Integer cantidad ){
        this.Id = contador++;
        this.nombre = nombre;
        this.Descripcion = descripcion;
        this.Cantidad = cantidad;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public void comprarProducto(String nombre, Integer cantidad){
        if(this.nombre.equalsIgnoreCase(nombre)){
            int operacion = this.Cantidad-cantidad;
            if (this.Cantidad>0 && cantidad> 0 && operacion>0){
                this.Cantidad -= cantidad;
                System.out.println("se compro el producto correctamente");
            }else{
                System.out.println("No hay suficientes productos en el stock");
            }
        }else{
            System.out.println("No se encontro el producto");
        }
    }

    public void añadirProducto(String nombre, Integer cantidad){
        if(this.nombre.equalsIgnoreCase(nombre)){
            if (cantidad>0){
                this.Cantidad += cantidad;
                System.out.println("Se agrego la cantidad correctamente");
            }else{
                System.out.println("La cantidad minima es 1");
            }
        }else{
            System.out.println("No se encontro el producto");
        }
    }

    public void mostrarCantidad(String nombre){
        if(this.nombre.equalsIgnoreCase(nombre)){
            System.out.println("nombre: " + this.nombre);
            System.out.println("descripcion: " + this.Descripcion);
            System.out.println("id: " + this.Id);
            System.out.println("cantidad: " + this.Cantidad);
        }
    }
}
