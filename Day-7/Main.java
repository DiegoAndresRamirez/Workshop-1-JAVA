import Clases.Estudiante;
import Clases.Figuras.Circulo;
import Clases.Figuras.Figura;
import Clases.Figuras.Rectangulo;
import Clases.Figuras.Triangulo;
import Clases.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        //parte de ejercicio 1
//        System.out.println("Bienvenido a tu libreria");
//        boolean flag = true;
//        System.out.println("Ingresa el titulo de el libro:  ");
//        String nuevoTitulo = consola.nextLine();
//        System.out.println("Ingresa el autor de el libro:  ");
//        String nuevoAutor = consola.nextLine();
//        System.out.println("Ingresa el año de publicacion de el libro:  ");
//        String nuevoAñoPublicacion = consola.nextLine();
//        String estadoPorDefecto = "Disponible";
//        Libro nuevoLibro = new Libro(nuevoTitulo, nuevoAutor, nuevoAñoPublicacion, estadoPorDefecto);
//        System.out.println("El libro se agregó e libro correctamente");
//        do {
//            System.out.println("Ingresa la opcion que quieres:\n\n1: prestar libro\n2: devolver libro\n3: mostrar libro\n4: salir");
//            String decision = consola.nextLine();
//            switch (decision){
//                case "1":
//                    System.out.println("Ingresa el nombre de el libro que quieres prestar:  ");
//                    String buscarTitulo = consola.nextLine();
//                    nuevoLibro.prestarLibrito(buscarTitulo);
//                    break;
//                case "2":
//                    System.out.println("Ingresa el nombre de el nombre de el libro que quieres devolver:  ");
//                    String devolverTitulo = consola.nextLine();
//                    nuevoLibro.devolverLibrito(devolverTitulo);
//                    break;
//                case "3":
//                    System.out.println("Ingresa el nombre de el libro que quieres imprimir:  ");
//                    String buscarLibro = consola.nextLine();
//                    nuevoLibro.mostrarLibro(buscarLibro);
//                    break;
//                case "4":
//                    flag = false;
//                    System.out.println("saliendooo....");
//                    consola.close();
//                    break;
//                default:
//                    System.out.println("Ingresa una opcion valida...");
//            }
//        }while(flag);

        //parte ejercicio 2

//        System.out.println("Bienvenido a tu gestor de empleados");
//        boolean flag = true;
//        System.out.println("Ingresa el nombre de el empleado:  ");
//        String nombreEmpleado = consola.nextLine();
//        System.out.println("Ingresa la posicion de el empleado:  ");
//        String posicionEmpleado = consola.nextLine();
//        System.out.println("Ingresa el salario de el empleado:  ");
//        float salarioEmpleado  = Float.parseFloat(consola.nextLine());
//        Empleado nuevoEmpleado = new Empleado(nombreEmpleado, posicionEmpleado, salarioEmpleado);
//        System.out.println("El empleado se agrego correctamente");
//        do {
//            System.out.println("Ingresa la opcion que quieres:\n\n1: aumentar salario\n2: mostrar salario\n3: mostrar empleado\n4: salir");
//            String decision = consola.nextLine();
//            switch (decision){
//                case "1":
//                    System.out.println("Ingresa el nombre de el empleado:  ");
//                    String nombreEmpleadoBuscar = consola.nextLine();
//                    System.out.println("Ingrese el porcentaje para aumentar sueldo:  ");
//                    Float porcentaje = Float.parseFloat(consola.nextLine());
//                    nuevoEmpleado.aumentarSalario(nombreEmpleadoBuscar, porcentaje);
//                    break;
//                case "2":
//                    System.out.println("Ingresa el nombre de el nombre de el empleado:  ");
//                    String nombreMostrarSalario = consola.nextLine();
//                    nuevoEmpleado.mostrarSalario(nombreMostrarSalario);
//                    break;
//                case "3":
//                    System.out.println("Ingresa el nombre de el empleado:  ");
//                    String nombreBuscarEmpleado = consola.nextLine();
//                    nuevoEmpleado.mostrarEmpleado(nombreBuscarEmpleado);
//                    break;
//                case "4":
//                    flag = false;
//                    System.out.println("saliendooo....");
//                    consola.close();
//                    break;
//                default:
//                    System.out.println("Ingresa una opcion valida...");
//            }
//        }while(flag);


//        3. Cuenta Bancaria: Implementa una clase CuentaBancaria con los atributos
//        titular y balance. Añade métodos para depositar dinero, retirar dinero (no
//                permitas que el balance se vuelva negativo) y mostrar el balance actual.

//        System.out.println("Bienvenido usuario");
//        boolean banderaCreacion = true;
//        String nombreTitular = "";
//        double balanceInicial = 0;
//        while(banderaCreacion){
//            System.out.println("Ingresa el nombre de el titular de la cuenta bancaria:  ");
//            nombreTitular = consola.nextLine();
//            System.out.println("Ingresa el balance inicial de la cuenta:  ");
//            balanceInicial = Double.parseDouble(consola.nextLine());
//            if(balanceInicial <= 0){
//                System.out.println("Ingresa un monto mayor");
//            }else{
//                banderaCreacion = false;
//            }
//        }
//        CuentaBancaria nuevaCuenta = new CuentaBancaria(nombreTitular, balanceInicial);
//        System.out.println("Cuenta creada correctamente");
//
//        boolean flag = true;
//        do {
//            System.out.println("Ingresa la opcion que desees:  \n\n1: depositar dinero\n2: retirar dinero\n3: mostrar balance actual\n4: salir");
//            String decisionUsuario = consola.nextLine();
//            switch (decisionUsuario){
//                case "1":
//                    System.out.println("Ingresa el nombre de el titular de la cuenta:  ");
//                    String nombreTitularDepositar = consola.nextLine();
//                    System.out.println("Ingresa el monto que deseas depositar a la cuenta:  ");
//                    Double nuevoBalance = Double.parseDouble(consola.nextLine());
//                    nuevaCuenta.depositarDinero(nombreTitularDepositar, nuevoBalance);
//                    break;
//                case "2":
//                    System.out.println("Ingresa el nombre de el titular de la cuenta:  ");
//                    String nombreTitularRetirar = consola.nextLine();
//                    System.out.println("Ingresa el monto que deseas depositar a la cuenta:  ");
//                    Double restaBalance = Double.parseDouble(consola.nextLine());
//                    nuevaCuenta.retirarDinero(nombreTitularRetirar, restaBalance);
//                    break;
//                case "3":
//                    System.out.println("Ingresa el nombre de el titular de la cuenta:  ");
//                    String nombreTitularMostrar = consola.nextLine();
//                    nuevaCuenta.mostrarBalance(nombreTitularMostrar);
//                    break;
//                case "4":
//                    flag = false;
//                    System.out.println("Saliendooo....");
//                    consola.close();
//                    break;
//                default:
//                    System.out.println("Ingresa una opcion valida...");
//            }
//        }while(flag);


//        4. Figuras Geométricas: Crea una clase abstracta Figura con un método
//        abstracto calcularArea(). Luego, extiende esta clase con algunas figuras
//        específicas como Circulo, Rectangulo, y Cuadrado, implementando el
//        cálculo del área en cada una. Utiliza el concepto de herencia y polimorfismo.

//        System.out.println("Ingresa el radio dde el circulo:  ");
//        Float radio = Float.parseFloat(consola.nextLine());
//        Circulo nuevoCirculo = new Circulo(radio);
//        nuevoCirculo.calcularArea(radio);
//
//
//        System.out.println("ingresa la base del rectangulo: ");
//        float lado1 = Float.parseFloat(consola.nextLine());
//        System.out.println("Ingresa la altura del rectangulo: ");
//        float lado2 = Float.parseFloat(consola.nextLine());
//        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
//        rectangulo.calcularArea(lado1,lado2);

//        System.out.println("Ingresa la base de el triangulo: ");
//        float base = Float.parseFloat(consola.nextLine());
//        System.out.println("Ingresa la altura de el triangulo: ");
//        float altura = Float.parseFloat(consola.nextLine());
//        Triangulo triangulo = new Triangulo(base, altura);
//        triangulo.calcularArea();

//        5. Control de Stock: Crea un sistema para gestionar el stock de productos en
//        un almacén. Deberás tener una clase Producto con atributos como id,
//                descripción, cantidad en stock. Añade métodos para agregar o quitar
//        productos del stock, y para verificar la cantidad actual de un producto.


//        System.out.println("Bienvenido usuario");
//        System.out.println("Ingresa el nombre de el producto: ");
//        String nombreProducto = consola.nextLine();
//        System.out.println("Ingresa la descripcion de el producto:  ");
//        String descripcionProducto = consola.nextLine();
//        System.out.println("Ingresa la cantidad inicial de el producto:  ");
//        Integer cantidadProducto = Integer.parseInt(consola.nextLine());
//        Producto nuevoProducto = new Producto(nombreProducto, descripcionProducto, cantidadProducto);
//        System.out.println("Producto creado");
//        boolean flag = true;
//        do {
//            System.out.println("Ingresa l opcion que desees:  \n\n1: comprar productos\n2: añadir productos\n3: mostrar producto\n4: salir");
//            String decision = consola.nextLine();
//            switch (decision) {
//                case "1":
//                    System.out.println("Ingresa el nombre de el producto:  ");
//                    String nombreBuscarComprar = consola.nextLine();
//                    System.out.println("Ingresa la cantidad que deseas comprar:  ");
//                    int cantidadComprar = Integer.parseInt(consola.nextLine());
//                    nuevoProducto.comprarProducto(nombreBuscarComprar, cantidadComprar);
//                    break;
//                case "2":
//                    System.out.println("Ingresa el nombre de el producto:  ");
//                    String nombreBuscarAñadir = consola.nextLine();
//                    System.out.println("Ingresa la cantidad que deseas comprar:  ");
//                    int cantidadAñadir = Integer.parseInt(consola.nextLine());
//                    nuevoProducto.añadirProducto(nombreBuscarAñadir, cantidadAñadir);
//                    break;
//                case "3":
//                    System.out.println("Ingresa el nombre de el producto:  ");
//                    String nombreBuscarMostrar = consola.nextLine();
//                    nuevoProducto.mostrarCantidad(nombreBuscarMostrar);
//                    break;
//                case "4":
//                    flag = false;
//                    System.out.println("Saliendooo...");
//                    consola.close();
//                    break;
//                default:
//                    System.out.println("Ingresa una opcion valida");
//            }
//        }while(flag);

//        6. Sistema de Calificaciones de Estudiantes: Diseña una clase Estudiante con
//        atributos para el nombre, una lista de calificaciones y un método para
//        calcular el promedio de dichas calificaciones. Añade un método para añadir
//        nuevas calificaciones a la lista

//        System.out.println("Bienvenido usuario");
//        System.out.println("Ingresa el nombre del estudiante:  ");
//        String nombreEstudiante = consola.nextLine();
//        ArrayList<Float> calificaciones = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ingresa una calificacion entre 0 y 10:  ");
//            Float calificacion = Float.parseFloat(consola.nextLine());
//            if(calificacion>=0 && calificacion<=10){
//                calificaciones.add(calificacion);
//                System.out.println("Nota agregada");
//            }else{
//                System.out.println("Ingresa una nota entre 0 y 10");
//                i--;
//            }
//        }
//        Estudiante nuevoEstudiante = new Estudiante(nombreEstudiante, calificaciones);
//        boolean flag = true;
//        do {
//            System.out.println("Ingresa la decision:  \n1: añadir calificaciones\n2: mostrar calificaciones\n3: salir");
//            String decision = consola.nextLine();
//            switch (decision){
//                case "1":
//                    System.out.println("Ingresa la nuev calificacion entre 1 y 10:  ");
//                    Float nuevaCalificacion = Float.parseFloat(consola.nextLine());
//                    nuevoEstudiante.añadirCalificacion(nuevaCalificacion, calificaciones);
//                    break;
//                case "2":
//                    nuevoEstudiante.calcularPromedio(calificaciones);
//                    break;
//                case "3":
//                    flag = false;
//                    System.out.println("Saliendooo...");
//                    consola.close();
//                    break;
//                default:
//                    System.out.println("Ingresa una opcion valida...");
//            }
//        }while (flag);

    }
}