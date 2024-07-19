package Exercise1;

public class ProductoEspecifico extends Producto{
    private String categoria;
    private String marca;

    public ProductoEspecifico(String nombre, Float precio, String categoria, String marca){
        super(nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
