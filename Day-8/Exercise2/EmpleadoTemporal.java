package Exercise2;

public class EmpleadoTemporal extends Empleado{
    private Integer IdEmpleado;
    private Integer contador = 1;

    public EmpleadoTemporal(String nombre, Integer edad, Float salario){
        super(nombre, edad, salario);
        this.IdEmpleado = contador++;
    }

}
