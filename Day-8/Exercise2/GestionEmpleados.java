package Exercise2;

import java.util.ArrayList;

public class GestionEmpleados {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public GestionEmpleados(ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void añadirEmpleado(Empleado empleado){
        empleados.add(empleado);
        System.out.println("Empleado agregado correctamente");
    }

    public void eliminarEmpleado(String nombreEmpleado){
        boolean encontrado = false;
        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = empleados.get(i);
            if(emp.getNombre().equalsIgnoreCase(nombreEmpleado)){
                empleados.remove(i);
                System.out.println("El empleado se despidio correctamente");
            }
        }
        if(!encontrado){
            System.out.println("No se encontro el empleado");
        }
    }

    public void mostrarEmpleado(String nombreEmpleado){
        for (Empleado emp : empleados){
            if(emp.getNombre().equalsIgnoreCase(nombreEmpleado)){
                System.out.println("Nombre: " + emp.getNombre());
                System.out.println("Edad: " + emp.getEdad());
                System.out.println("Salario: " + emp.getSalario());
            }else{
                System.out.println("No se encontro el empleado");
            }
        }
    }

    public void mostrarTodosEmpleados(){
        for (Empleado emp : empleados){
            System.out.println("Nombre: " + emp.getNombre());
            System.out.println("Edad: " + emp.getEdad());
            System.out.println("Salario: " + emp.getSalario());
        }
    }
}
