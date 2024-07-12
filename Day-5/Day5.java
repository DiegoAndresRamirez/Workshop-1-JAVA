import javax.management.InstanceNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Day5{
    public static void main(String[] args) {
//        Ejercicio 1: Menú interactivo.
//        Este ejercicio propone la creación de un programa que presente al
//        usuario un menú interactivo para realizar operaciones matemáticas
//        básicas como suma, resta, multiplicación y división.
        Scanner consola = new Scanner(System.in);

        //calculadora
//        System.out.println("Bienvenido usuario");
//        boolean flag = true;
//        while (flag){
//            System.out.println("Ingresa tu opcion:  \n\n1: sumar\n2: restar\n3: multiplicar\n4: dividir\n5: salir");
//            int chooseUser = Integer.parseInt(consola.nextLine());
//            float numero1 = 0;
//            float numero2 = 0;
//            float operacion = 0;
//            switch (chooseUser){
//                case 1:
//                    System.out.println("Elegiste suma, ingresa un numero: ");
//                    numero1 = Float.parseFloat(consola.nextLine());
//                    System.out.println("Ingresa el siguiente numero: ");
//                    numero2 = Float.parseFloat(consola.nextLine());
//                    operacion = numero1+numero2;
//                    System.out.println("El resultado es: " + operacion);
//                    break;
//                case 2:
//                    System.out.println("Elegiste resta, ingresa un numero: ");
//                    numero1 = Float.parseFloat(consola.nextLine());
//                    System.out.println("Ingresa el siguiente numero: ");
//                    numero2 = Float.parseFloat(consola.nextLine());
//                    operacion = numero1-numero2;
//                    System.out.println("El resultado es: " + operacion);
//                    break;
//                case 3:
//                    System.out.println("Elegiste multiplicacion, ingresa un numero: ");
//                    numero1 = Float.parseFloat(consola.nextLine());
//                    System.out.println("Ingresa el siguiente numero: ");
//                    numero2 = Float.parseFloat(consola.nextLine());
//                    operacion = numero1*numero2;
//                    System.out.println("El resultado es: " + operacion);
//                    break;
//                case 4:
//                    System.out.println("Elegiste division, ingresa un numero: ");
//                    numero1 = Float.parseFloat(consola.nextLine());
//                    System.out.println("Ingresa el siguiente numero: ");
//                    numero2 = Float.parseFloat(consola.nextLine());
//                    operacion = numero1/numero2;
//                    System.out.println("El resultado es: " + operacion);
//                    break;
//                case 5:
//                    System.out.println("Saliendoooo....");
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Opcion invalida");
//            }
//            consola.close();
//        }

//        Ejercicio 2: Facturación de una tienda.
//        Un cliente realiza una compra en una tienda. El programa proporciona
//        un array de productos y un array de precios. Se requiere pedir al
//        usuario la cantidad de cada producto que desea comprar, para
//        posteriormente imprimir el valor total de la factura.

//        String[] products = {"camisa", "pantalon", "zapatos", "reloj", "gorra"};
//        int[] prices = {100, 150, 80, 500, 20};
//
//        System.out.println("Bienvenido usuario\n\nA continuacion ingresa el numero del producto que desea agragar al carrito: ");
//        int counter = 0;
//        for (String pro : products){
//            System.out.println(counter + "  " + pro);
//            counter++;
//        }
//        int chooseUser = Integer.parseInt(consola.nextLine());
//        switch (chooseUser){
//            case 0:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                int quantityProduct = Integer.parseInt(consola.nextLine());
//                int priceProduct = prices[chooseUser];
//                int operacion = priceProduct*quantityProduct;
//                System.out.println("El total de su factura es: " + operacion);
//                break;
//            case 1:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                quantityProduct = Integer.parseInt(consola.nextLine());
//                priceProduct = prices[chooseUser];
//                operacion = priceProduct*quantityProduct;
//                System.out.println("El total de su factura es: " + operacion);
//                break;
//            case 2:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                quantityProduct = Integer.parseInt(consola.nextLine());
//                priceProduct = prices[chooseUser];
//                operacion = priceProduct*quantityProduct;
//                System.out.println("El total de su factura es: " + operacion);
//                break;
//            case 3:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                quantityProduct = Integer.parseInt(consola.nextLine());
//                priceProduct = prices[chooseUser];
//                operacion = priceProduct*quantityProduct;
//                System.out.println("El total de su factura es: " + operacion);
//                break;
//            case 4:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                quantityProduct = Integer.parseInt(consola.nextLine());
//                priceProduct = prices[chooseUser];
//                operacion = priceProduct*quantityProduct;
//                System.out.println("El total de su factura es: " + operacion);
//                break;
//            default:
//                System.out.println("Opcion invalida...");
//        }
//        consola.close();

//        Ejercicio 3: Notas de un curso.
//        Crea un programa que calcula la calificación promedio que se necesita
//        obtener en las notas faltantes de un curso para aprobarlo,
//        considerando la cantidad de calificaciones totales, las calificaciones ya
//        obtenidas, el puntaje mínimo requerido para aprobar y la cantidad de
//        notas faltantes. Importante: el total de notas del curso será de 8 notas,
//                la calificación será de 0 a 100 y el promedio mínimo para aprobar el
//        curso es de 76

        //notas

//        List<Float> grades = new ArrayList<>();
//        System.out.println("Bienvneido usuario. a continuacion ingresa tus notas: ");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Ingresa tu siuiente nota: ");
//            float notaUsuario = Float.parseFloat(consola.nextLine());
//            grades.add(notaUsuario);
//        }
//        float totalNotas = 0;
//        for (Float cur : grades) {
//            totalNotas += cur;
//        }
//
//        float promedioActual = totalNotas / 5;
//        System.out.println("Tu promedio actual es: " + promedioActual);
//
//        if (promedioActual >= 76.0) {
//            System.out.println("Tus notas son buenas, ya tienes el curso pasado con un promedio de: " + promedioActual);
//        } else {
//            System.out.println("Necesitas mejorar tu promedio.");
//        }
//        float sumaTotalNecesaria = 100 * 8;
//        float sumaNotasRestantes = sumaTotalNecesaria - totalNotas;
//        float promedioNotasRestantes = sumaNotasRestantes / 3;
//
//        System.out.println("Para obtener un promedio de 100, necesitas sacar un promedio de " + promedioNotasRestantes + " en las tres pruebas restantes.");
//        consola.close();

//        Ejercicio 4: Calculadora de descuentos.
//                Crea un programa que calcule los descuentos por compras(Ejercicio 2)
//        en una tienda, donde se aplica un porcentaje de descuento en función
//        del monto total de la compra, con rangos de precios personalizados.
//        ________________________________________________
//                | Rango de compra | Porcentaje de descuento |
//                |------------------------------------|-----------------------------------------|
//                | Mayor o igual a $1000   |        25% |
//                | Mayor o igual a $500    |          20% |
//                | Mayor o igual a $300     |           15% |
//                | Mayor o igual a $200        |           10% |
//                | Menor a $200 | No se aplica descuento |
//
//                ________________________________________________


        //utilizo el mismo ejercicio y lo adapto a los requerimientos
//        String[] products = {"camisa", "pantalon", "zapatos", "reloj", "gorra"};
//        int[] prices = {1000, 550, 320, 220, 20};
//
//        System.out.println("Bienvenido usuario\n\nA continuacion ingresa el numero del producto que desea agragar al carrito: ");
//        int counter = 0;
//        for (String pro : products){
//            System.out.println(counter + "  " + pro);
//            counter++;
//        }
//        int chooseUser = Integer.parseInt(consola.nextLine());
//        switch (chooseUser) {
//            case 0:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                int quantityProduct = Integer.parseInt(consola.nextLine());
//                int priceProduct = prices[chooseUser];
//                if(priceProduct >= 1000) {
//                    double operacion = priceProduct * quantityProduct;
//                    System.out.println("El total de su factura es : " + operacion);
//                    double operacionDescuento = operacion * 0.25;
//                    operacion -= operacionDescuento;
//                    System.out.println("Hoy es tu dia de suerte,tenemos el 25% de descuento en este producto, tu factura final es : " + operacion);
//                }
//                break;
//            case 1:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                quantityProduct = Integer.parseInt(consola.nextLine());
//                priceProduct = prices[chooseUser];
//                if(priceProduct >= 500) {
//                    double operacion = priceProduct * quantityProduct;
//                    System.out.println("El total de su factura es : " + operacion);
//                    double operacionDescuento = operacion * 0.20;
//                    operacion -= operacionDescuento;
//                    System.out.println("Hoy es tu dia de suerte,tenemos el 20% de descuento en este producto, tu factura final es : " + operacion);
//                }
//                break;
//            case 2:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                quantityProduct = Integer.parseInt(consola.nextLine());
//                priceProduct = prices[chooseUser];
//                if(priceProduct >= 300) {
//                    double operacion = priceProduct * quantityProduct;
//                    System.out.println("El total de su factura es : " + operacion);
//                    double operacionDescuento = operacion * 0.15;
//                    operacion -= operacionDescuento;
//                    System.out.println("Hoy es tu dia de suerte,tenemos el 15% de descuento en este producto, tu factura final es : " + operacion);
//                }
//                break;
//            case 3:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                quantityProduct = Integer.parseInt(consola.nextLine());
//                priceProduct = prices[chooseUser];
//                if(priceProduct >= 200) {
//                    double operacion = priceProduct * quantityProduct;
//                    System.out.println("El total de su factura es : " + operacion);
//                    double operacionDescuento = operacion * 0.10;
//                    operacion -= operacionDescuento;
//                    System.out.println("Hoy es tu dia de suerte,tenemos el 10% de descuento en este producto, tu factura final es : " + operacion);
//                }
//                break;
//            case 4:
//                System.out.println("Ingresa la cantidad que quieres llevar de este producto:  ");
//                quantityProduct = Integer.parseInt(consola.nextLine());
//                priceProduct = prices[chooseUser];
//                int operacion = priceProduct * quantityProduct;
//                System.out.println("El total de su factura es: " + operacion);
//                break;
//            default:
//                System.out.println("Opcion invalida...");
//        }

//        Ejercicio 5: Busca palabras.
//        Un programa que permita al usuario ingresar un texto y luego le da la
//        opción de buscar una palabra específica, mostrando como resultado
//        el rango de posiciones donde se encontró la palabra exacta. (Sin darle
//        importancia a mayúsculas o minúsculas)

//        System.out.println("Bienvenido usuario, ingresa un texto:  ");
//        String text = consola.nextLine();
//        String[] textoUsuario = text.split(" ");
//        if (!text.isEmpty()){
//            System.out.println("escribe la palabra que deseas buscar:  ");
//            String palabraBuscar = consola.nextLine();
//            if(!palabraBuscar.isEmpty()){
//                boolean encontrado = false;
//                for (String palabra : textoUsuario){
//                    if(palabra.equalsIgnoreCase(palabraBuscar)){
//                        int indexStart = text.toLowerCase().indexOf(palabraBuscar.toLowerCase());
//                        System.out.println("Se encontro la palabra, empieza en la posicion: " + indexStart + ", y termina en la posicion: " + (indexStart + palabraBuscar.length()-1));
//                        encontrado = true;
//                        break;
//                    }
//                }
//                if(!encontrado){
//                    System.out.println("no se encontro la palabra");
//                }
//            }
//        }

//        Ejercicio 6: Búsqueda por coincidencia en arrays
//        Crea un array de Strings (por ejemplo, nombres) y pide al usuario que
//        ingrese un nombre. Busca ese nombre en el array que imprima si se
//        encuentra la posición y si no un mensaje que no se encuentra.}

//        System.out.println("Bienvenido usuario");
//        String[] nombres = new String[5];
//        for (int i = 0; i <= 4; i++) {
//            System.out.println("Ingresa un nombre: ");
//            nombres[i] = consola.nextLine();
//        }
//        System.out.println("A continuacion ingresa un nombre que quieres buscar: ");
//        String nombreBuscar = consola.nextLine();
//        boolean flag = false;
//        for (String name : nombres){
//            if(name.equalsIgnoreCase(nombreBuscar)){
//                System.out.println("El nombre ha sido encontrado");
//                flag = true;
//                break;
//            }
//        }
//        if(!flag){
//            System.out.println("El nombre no existe dentro de la lista");
//        }

//        Ejercicio 7: Transposición de una Matriz
//        Crea un programa en Java que calcule la transpuesta de una matriz
//        (intercambiar filas por columnas).

//        int[][] matriz = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j <matriz[i].length ; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//        //transpuesta
//
//        int filas = matriz.length;
//        int columnas = matriz[0].length;
//        int [][] transpuesta = new int[filas][columnas];
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas; j++) {
//                transpuesta[j][i] = matriz[i][j];
//            }
//
//        }
//        System.out.println();
//        for (int i = 0; i < transpuesta.length; i++) {
//            for (int j = 0; j <transpuesta[i].length ; j++) {
//                System.out.print(transpuesta[i][j] + " ");
//            }
//            System.out.println();
//
//        }

//        Ejercicio 8: Verificar Matriz Simétrica
//        Crea un programa en Java que verifique si una matriz cuadrada es
//        simétrica (igual a su transpuesta, Ejercicio 7).

//                int[][] matriz = {
//                {1, 2, 3},
//                {2, 4, 5},
//                {3, 5, 6}
//        };
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j <matriz[i].length ; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//        //transpuesta
//
//        int filas = matriz.length;
//        int columnas = matriz[0].length;
//        int [][] transpuesta = new int[filas][columnas];
//        for (int i = 0; i < filas; i++) {
//            for (int j = 0; j < columnas; j++) {
//                transpuesta[j][i] = matriz[i][j];
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < transpuesta.length; i++) {
//            for (int j = 0; j <transpuesta[i].length ; j++) {
//                System.out.print(transpuesta[i][j] + " ");
//            }
//            System.out.println();
//        }
//        boolean isSimetric = true;
//        if(filas != columnas){
//            isSimetric = false;
//            System.out.println("No es simetrica");
//        }
//        for (int i = 0; i < transpuesta.length; i++) {
//            for (int j = 0; j <transpuesta[i].length ; j++) {
//                if (transpuesta[i][j] != transpuesta[j][i]){
//                    isSimetric = false;
//                    System.out.println("No es simetrico");
//                }
//            }
//        }
//        if (isSimetric){
//            System.out.println("Es simetrico");
//        }

//        Ejercicio 9: Contar coincidencias en un Array:
//        Crea un programa que mire dentro de un array, si hay elementos
//        repetidos y los cuente e imprima en pantalla en orden del elemento
//        que más se repite al que menos.

//        int[] numeros = new int[10];
//        System.out.println("Bienvenido usuario");
//        boolean flag = true;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ingresa un numero entre el (1-5)");
//            int numeroUser = Integer.parseInt(consola.nextLine());
//            numeros[i] = numeroUser;
//        }
//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//        int count4 = 0;
//        int count5 = 0;
//        for (int num : numeros){
//            switch (num){
//                case 1:
//                    count1++;
//                    break;
//                case 2:
//                    count2++;
//                    break;
//                case 3:
//                    count3++;
//                    break;
//                case 4:
//                    count4++;
//                    break;
//                case 5:
//                    count5++;
//                    break;
//                default:
//                    System.out.println("Caracter invalido");
//            }
//        }
//        System.out.println("numero de repeticiones numeros:\n\nnumero 1: " + count1 + "\nnumero 2: " + count2 + "\nnumero 3: " + count3 + "\nnumero 4: " + count4 + "\nnumero 5: " + count5);

//        Ejercicio 10: Invertir un Array
//        Escribe un programa en Java que invierta el orden de los elementos
//        en un array de números enteros.(Sin métodos)

//        int[] numeros = new int[5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ingresa un numero: ");
//            numeros[i] = Integer.parseInt(consola.nextLine());
//        }
//        System.out.println();
//        for (int num : numeros){
//            System.out.print(num);
//        }
//        int[] numerosInvertidos = new int[numeros.length];
//        for (int i = 0, j = numeros.length -1; i < numeros.length; i++, j--) {
//            numerosInvertidos[i] = numeros[j];
//        }
//        System.out.println();
//        for (int num : numerosInvertidos){
//            System.out.print(num);
//        }
    }
}