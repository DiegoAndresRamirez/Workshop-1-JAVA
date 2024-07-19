import Exercise1.Inventario;
import Exercise1.Producto;
import Exercise1.ProductoEspecifico;
import Exercise2.Empleado;
import Exercise2.EmpleadoPermanente;
import Exercise2.GestionEmpleados;
import Exercise3.Curso;
import Exercise3.Estudiante;
import Exercise3.GestionCurso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner consola = new Scanner(System.in);

//        Ejercicio 1: Sistema de Control de Inventarios
//        Objetivo: Crear un sistema para manejar el inventario de un almacén, aplicando
//        encapsulamiento y herencia, y utilizando ArrayList para almacenar los productos.
//
//        Principios de POO aplicados: Encapsulamiento, Herencia.
//
//            Requisitos:
//
//        Clase Producto: Base para todos los productos, con propiedades como id, nombre, y
//        precio. Implementa getters y setters para aplicar el encapsulamiento.
//        Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
//        categoria o marca.
//            Clase Inventario: Utiliza un ArrayList de objetos Producto para gestionar el inventario.
//        Implementa métodos para añadir, eliminar, y listar productos, además de buscar productos
//        por nombre o categoría.


//        System.out.println("Bienvenido usuario");
//        System.out.println("Ingresa el nombre de el producto:  ");
//        String nombreProducto = consola.nextLine();
//        System.out.println("Ingresa el precio de el producto:  ");
//        Float precioProducto = Float.parseFloat(consola.nextLine());
//        System.out.println("Ingresa la categoria de el producto:  ");
//        String categoriaProducto = consola.nextLine();
//        System.out.println("Ingresa la marca de el producto:  ");
//        String marcaProducto = consola.nextLine();
//        ProductoEspecifico nuevoProducto = new ProductoEspecifico(nombreProducto, precioProducto, categoriaProducto, marcaProducto);
//        ArrayList<ProductoEspecifico> productos = new ArrayList<>();
//        Inventario inventario = new Inventario(productos);
//        inventario.añadirProductos(nuevoProducto);
//        System.out.println("El producton se agrego a la lista correctamente");
//        boolean flag = true;
//        do {
//            System.out.println("Ingresa la opcion que quieras: \n\n1: añadir productos\n2: eliminar producto\n3: mostrar un producto\n4: mostrar todos los productos\n5: salir");
//            String decision = consola.nextLine();
//            switch (decision){
//                case "1":
//                    System.out.println("Ingresa el nombre de el producto:  ");
//                    nombreProducto = consola.nextLine();
//                    System.out.println("Ingresa el precio de el producto:  ");
//                    precioProducto = Float.parseFloat(consola.nextLine());
//                    System.out.println("Ingresa la categoria de el producto:  ");
//                    categoriaProducto = consola.nextLine();
//                    System.out.println("Ingresa la marca de el producto:  ");
//                    marcaProducto = consola.nextLine();
//                    ProductoEspecifico Producto = new ProductoEspecifico(nombreProducto, precioProducto, categoriaProducto, marcaProducto);
//                    inventario.añadirProductos(Producto);
//                    System.out.println("El producto ha sido agregado correctamente");
//                    break;
//                case "2":
//                    System.out.println("Ingresa el nombre de el producto:  ");
//                    nombreProducto = consola.nextLine();
//                    inventario.eliminarProducto(nombreProducto);
//                    System.out.println("Se elimino el producto correctamente");
//                    break;
//                case "3":
//                    System.out.println("Ingresa el nombre de el producto:  ");
//                    nombreProducto = consola.nextLine();
//                    inventario.mostrarProducto(nombreProducto);
//                    System.out.println("Se encontro el producto correctamente");
//                    break;
//                case "4":
//                    inventario.mostrarTodosProductos();
//                    break;
//                case "5":
//                    flag = false;
//                    System.out.println("Saliendooo...");
//                    consola.close();
//                    break;
//                default:
//                    System.out.println("Ingresa una opcion valida...");
//            }
//        }while(flag);

//        Ejercicio 2: Sistema de Registro de Empleados
//        Objetivo: Desarrollar un sistema para manejar los empleados de una empresa, aplicando
//        encapsulamiento, herencia y polimorfismo, y utilizando ArrayList para almacenar los
//        empleados.
//
//                Principios de POO aplicados: Encapsulamiento, Herencia, Polimorfismo.
//
//            Requisitos:
//
//        Clase Persona: Con propiedades básicas como nombre y edad.
//            Clase Empleado: Hereda de Persona y añade propiedades como idEmpleado y salario. Usa
//        encapsulamiento adecuadamente.
//        Clase EmpleadoTemporal y Clase EmpleadoPermanente: Heredan de Empleado y
//        representan diferentes tipos de empleados.
//            Clase GestionEmpleados: Utiliza un ArrayList para gestionar objetos del tipo Empleado.
//            Implementa métodos para añadir, eliminar y mostrar empleados. Utiliza polimorfismo para
//        manejar diferentes tipos de empleados.

//        System.out.println("Bienvenido usuario");
//        System.out.println("Ingresa el nombre de el empleado:  ");
//        String nombreEmpleado = consola.nextLine();
//        System.out.println("Ingresa la edad de el empleado:  ");
//        Integer edadEmpleado = Integer.parseInt(consola.nextLine());
//        System.out.println("Ingresa el salario de el empleado:  ");
//        Float salarioEmpleado = Float.parseFloat(consola.nextLine());
//        EmpleadoPermanente nuevoEmpleado = new EmpleadoPermanente(nombreEmpleado, edadEmpleado, salarioEmpleado);
//        ArrayList<Empleado> lista = new ArrayList<>();
//        GestionEmpleados empleados = new GestionEmpleados(lista);
//        empleados.añadirEmpleado(nuevoEmpleado);
//        System.out.println("El empleado se agrego correctamente");
//        boolean flag = true;
//        do {
//            System.out.println("Ingresa la opcion que quieras: \n\n1: añadir empleado\n2: eliminar empleado\n3: mostrar un empleado\n4: mostrar todos los empleados\n5: salir");
//            String decision = consola.nextLine();
//            switch (decision){
//                case "1":
//                    System.out.println("Ingresa el nombre de el empleado:  ");
//                    nombreEmpleado = consola.nextLine();
//                    System.out.println("Ingresa la edad de el empleado:  ");
//                    edadEmpleado = Integer.parseInt(consola.nextLine());
//                    System.out.println("Ingresa el salario de el empleado:  ");
//                    salarioEmpleado = Float.parseFloat(consola.nextLine());
//                    EmpleadoPermanente empleado = new EmpleadoPermanente(nombreEmpleado, edadEmpleado, salarioEmpleado);
//                    empleados.añadirEmpleado(empleado);
//                    System.out.println("El empleado ha sido agregado correctamente");
//                    break;
//                case "2":
//                    System.out.println("Ingresa el nombre de el empleado:  ");
//                    nombreEmpleado = consola.nextLine();
//                    empleados.eliminarEmpleado(nombreEmpleado);
//                    System.out.println("Se elimino el producto correctamente");
//                    break;
//                case "3":
//                    System.out.println("Ingresa el nombre de el empleado:  ");
//                    nombreEmpleado = consola.nextLine();
//                    empleados.mostrarEmpleado(nombreEmpleado);
//                    System.out.println("Se encontro el producto correctamente");
//                    break;
//                case "4":
//                    empleados.mostrarTodosEmpleados();
//                    break;
//                case "5":
//                    flag = false;
//                    System.out.println("Saliendooo...");
//                    consola.close();
//                    break;
//                default:
//                    System.out.println("Ingresa una opcion valida...");
//            }
//        }while(flag);

//        Ejercicio 3: Sistema de Gestión de Cursos
//        Objetivo: Implementar un sistema para gestionar cursos y estudiantes, aplicando
//        abstracción y polimorfismo, y utilizando ArrayList para manejar las inscripciones.
//
//        Principios de POO aplicados: Abstracción, Polimorfismo.
//
//            Requisitos:
//
//        Clase Curso: Con propiedades como codigo, nombre, y listaEstudiantes, donde
//        listaEstudiantes es un ArrayList de objetos Estudiante.
//            Clase Estudiante: Con propiedades como id, nombre, y email.
//
//            Clase GestionCursos: Encargada de administrar los cursos, incluyendo métodos para
//        agregar cursos, inscribir estudiantes en cursos y listar estudiantes inscritos en un curso
//        específico.


//        System.out.println("Bienvenido usuario");
//        System.out.println("Ingresa el nombre de el curso:  ");
//        String nombreCurso = consola.nextLine();
//        System.out.println("Ingresa el codigo de el curso (ej. 764828282):  ");
//        String codigoCurso = consola.nextLine();
//        ArrayList<Estudiante> listaEsudiantes = new ArrayList<Estudiante>();
//        Curso nuevoCurso = new Curso(codigoCurso, nombreCurso, listaEsudiantes);
//        ArrayList<Curso> gestionCursos = new ArrayList<>();
//        GestionCurso listaCursos = new GestionCurso(gestionCursos);
//        listaCursos.agregarCursos(nuevoCurso);
//        System.out.println("El curso se agrego correctamente");
//        boolean flag = true;
//        do {
//            System.out.println("Ingresa la opcion que quieras: \n\n1: añadir curso\n2: inscribir estudiante\n3: eliminar estudiante\n4: mostrar estudiantes\n5: salir");
//            String decision = consola.nextLine();
//            switch (decision){
//                case "1":
//                    System.out.println("Ingresa el nombre de el curso:  ");
//                    nombreCurso = consola.nextLine();
//                    System.out.println("Ingresa el codigo de el curso (ej. 764828282):  ");
//                    codigoCurso = consola.nextLine();
//                    ArrayList<Estudiante> listaPropia = new ArrayList<Estudiante>();
//                    Curso curso = new Curso(codigoCurso, nombreCurso, listaPropia);
//                    listaCursos.agregarCursos(curso);
//                    System.out.println("El curso ha sido agregado correctamente");
//                    break;
//                case "2":
//                    System.out.println("Ingresa el nombre de el estudiante:  ");
//                    String nombreEstudiante = consola.nextLine();
//                    System.out.println("Ingresa el email de el estudiante:  ");
//                    String emailEstudiante = consola.nextLine();
//                    Estudiante estudiante = new Estudiante(nombreEstudiante, emailEstudiante);
//                    System.out.println("Ingrese el nombre de el curso:  ");
//                    String nombreDeCurso = consola.nextLine();
//                    listaCursos.inscribirEstudiante(estudiante, nombreDeCurso);
//                    System.out.println("Estudiante inscrito correctamente");
//                    break;
//                case "3":
//                    System.out.println("Ingresa el nombre de el curso:  ");
//                    String nombreCursoEliminar = consola.nextLine();
//                    System.out.println("Ingresa el nombre de el estudiante:  ");
//                    String nombreDeEstudiante = consola.nextLine();
//                    listaCursos.eliminarEstudiante(nombreCursoEliminar, nombreDeEstudiante);
//                    System.out.println("El estudiante se ha eliminado correctamente");
//                    break;
//                case "4":
//                    System.out.println("Ingresa el nombre de el curso:  ");
//                    String nombreCursoMostrar = consola.nextLine();
//                    listaCursos.mostrarEstudiantes(nombreCursoMostrar);
//                    break;
//                case "5":
//                    flag = false;
//                    System.out.println("Saliendooo...");
//                    consola.close();
//                    break;
//                default:
//                    System.out.println("Ingresa una opcion valida...");
//            }
//        }while(flag);


    }
}