package Exercise2;

public class EmpleadoPermanente extends Empleado{
    private Integer IdEmpleado;
    private Integer contador = 1;

    public EmpleadoPermanente(String nombre, Integer edad, Float salario){
        super(nombre, edad, salario);
        this.IdEmpleado = contador++;
    }
}
