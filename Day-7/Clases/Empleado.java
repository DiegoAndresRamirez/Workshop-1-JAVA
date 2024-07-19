package Clases;

public class Empleado {
    private static Integer contadorId = 1;
    private String nombre;
    private String posicion;
    private Float salario;
    private Integer Id;

    public Empleado(String nombre, String posicion, Float salario){
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.Id = contadorId++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public void aumentarSalario(String nombre, Float porcentaje){
        if(this.nombre.equalsIgnoreCase(nombre)){
            if(salario > 0 ){
                this.salario += this.salario*(porcentaje/100);
                System.out.println("se aumento el salario correctamente");
            }else{
                System.out.println("El salario es menor a 0");
            }
        }else{
            System.out.println("no se encontro a el empleado");
        }
    }

    public void mostrarSalario(String nombre){
        if(this.nombre.equalsIgnoreCase(nombre)){
            System.out.println("el salario de " + this.nombre + " es: " +  this.salario);
        }else{
            System.out.println("No se enecontro el empleado");
        }
    }

    public void mostrarEmpleado(String nombreBuscar){
        if(this.nombre.equalsIgnoreCase(nombreBuscar)){
            System.out.println("nombre: " + this.nombre);
            System.out.println("posicion: " + this.posicion);
            System.out.println("salario: " + this.salario);
            System.out.println("id: " + this.Id);
        }else{
            System.out.println("no se encontro el empleado...");
        }
    }


}
