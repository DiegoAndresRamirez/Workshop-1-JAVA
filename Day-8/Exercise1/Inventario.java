package Exercise1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<ProductoEspecifico> inventario = new ArrayList<>();

    public Inventario(ArrayList<ProductoEspecifico> inventario){
        this.inventario = inventario;
    }

    public ArrayList<ProductoEspecifico> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<ProductoEspecifico> inventario) {
        this.inventario = inventario;
    }

    public void añadirProductos(ProductoEspecifico producto){
        inventario.add(producto);
        System.out.println("Producto agregado correctamente");
    }

    public void eliminarProducto(String nombre){
        boolean encontrado = false;
        for (int i = 0; i < inventario.size() ; i++) {
            ProductoEspecifico product = inventario.get(i);
            if(product.getNombre().equalsIgnoreCase(nombre)){
                inventario.remove(i);
                System.out.println("El producto fue eliminado correctamente");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro el producto");
        }
    }

    public void mostrarProducto(String nombre){
        for (ProductoEspecifico product : inventario){
            if (product.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("nombre: " +  product.getNombre());
                System.out.println("precio: " +  product.getPrecio());
                System.out.println("categoria: " +  product.getCategoria());
                System.out.println("marca: " +  product.getMarca());
            }
        }
    }

    public void mostrarTodosProductos(){
        for (ProductoEspecifico product : inventario){
            System.out.println(product.getNombre());
            System.out.println(product.getPrecio());
            System.out.println(product.getCategoria());
            System.out.println(product.getMarca());
        }
    }
}
