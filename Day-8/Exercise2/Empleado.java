package Exercise2;

public class Empleado extends Persona{
    private static Integer contador = 1;
    private Integer IdEmpleado;
    private Float salario;

    public Empleado(String nombre, Integer edad, Float salario){
        super(nombre, edad);
        this.IdEmpleado = contador++;
        this.salario = salario;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

}
