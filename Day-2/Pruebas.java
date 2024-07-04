import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
//        Ejercicio 1: Calculadora Básica
//        Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar,
//        multiplicar y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y
//        los resultados.

//        Scanner consola = new Scanner(System.in);
//        System.out.println("Bienvenido a tu calculadora usuario\n\nIngresa dos numeros a continuacion para hacer las operaciones matematicas");
//        int num1 = Integer.parseInt(consola.nextLine());
//        int num2 = Integer.parseInt(consola.nextLine());
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 / num2);
//        System.out.println(num1 * num2);

//        Ejercicio 2: Verificador de Edad
//        Crea un programa que solicite la edad del usuario y determine si es mayor de edad (18 años o más).
//        El programa debe imprimir un mensaje indicando si el usuario es mayor de edad o no.

//        System.out.println("Ingresa tu edad usuario:  ");
//        Scanner consola = new Scanner(System.in);
//        int age = Integer.parseInt(consola.nextLine());
//        if(age > 18){
//            System.out.println("Eres mayor de edad");
//        }else{
//            System.out.println("No eres mayor de edad");
//        }

//        Ejercicio 3: Conversor de Unidades
//        Desarrolla un programa que convierta kilómetros a millas. El programa debe solicitar al usuario que
//        introduzca una distancia en kilómetros y luego debe mostrar la distancia equivalente en millas.
//        Utiliza el hecho de que una milla es igual a 1.60934 kilómetros.

//        double milla = 1.60934;
//        System.out.println("Bienvenido a tu convertor de medidas, ingresa los kilometros que deseas convertir:  ");
//        Scanner consola = new Scanner(System.in);
//        Double kilometroUsuario = Double.parseDouble(consola.nextLine());
//        System.out.println(kilometroUsuario*milla + " millas");

//        Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC)
//                Escribe un programa que calcule el índice de masa corporal (IMC) de una persona. El programa
//        debe pedir al usuario su peso en kilogramos y su altura en metros, calcular el IMC y mostrar un
//        mensaje con el resultado. La fórmula para calcular el IMC es peso / (altura * altura).

//        System.out.println("Bienvenido a tu medidor de indice de masa corporal: ingresaa tu peso en kilogramos: ");
//        Scanner consola = new Scanner(System.in);
//        float pesoUsuario = Float.parseFloat(consola.nextLine());
//        System.out.println("Ahora ingresa tu altura enn metros:  ");
//        float alturaUsuario = Float.parseFloat(consola.nextLine());
//        System.out.println("Tu indice de masa corporal es de : " + pesoUsuario/(alturaUsuario*alturaUsuario));

//        Ejercicio 5: Clasificador de Números
//        Crea un programa que solicite al usuario un número y muestre un mensaje indicando si el número
//        es positivo, negativo o cero. Además, indica si el número es par o impar.

//        System.out.println("Bienvenido a tu cclasificador de numeros,, Ingresa cualquier numero:  ");
//        Scanner consola = new Scanner(System.in);
//        int numeroUsuario = Integer.parseInt(consola.nextLine());
//        if(numeroUsuario > 0){
//            System.out.println("El numero " + numeroUsuario + " es positivo");
//        } else if (numeroUsuario < 0) {
//            System.out.println("El numero " + numeroUsuario + " es negativo");
//        } else {
//            System.out.println("El numero " + numeroUsuario + " es cero :/");
//        }


//        Ejercicio 6: Calculadora de Días del Mes
//        Desarrolla un programa que pida al usuario el número de un mes (1-12) y muestre el número de días
//        de ese mes. Asume que febrero tiene 28 días. Utiliza una estructura switch para resolverlo.

//        System.out.println("Bienvenido usuario a tu calculadora de das del mes, Ingresa el numero de un mes (1-12):  ");
//        Scanner consola = new Scanner(System.in);
//        int numeroMes = Integer.parseInt(consola.nextLine());
//        switch (numeroMes){
//            case 1:
//                System.out.println("El mes " + numeroMes + " tiene 31 dias");
//                break;
//            case 2:
//                System.out.println("El mes " + numeroMes + " tiene 28/29 dias");
//                break;
//            case 3:
//                System.out.println("El mes " + numeroMes + " tiene 31 dias");
//                break;
//            case 4:
//                System.out.println("El mes " + numeroMes + " tiene 30 dias");
//                break;
//            case 5:
//                System.out.println("El mes " + numeroMes + " tiene 31 dias");
//                break;
//            case 6:
//                System.out.println("El mes " + numeroMes + " tiene 30 dias");
//                break;
//            case 7:
//                System.out.println("El mes " + numeroMes + " tiene 31 dias");
//                break;
//            case 8:
//                System.out.println("El mes " + numeroMes + " tiene 31 dias");
//                break;
//            case 9:
//                System.out.println("El mes " + numeroMes + " tiene 30 dias");
//                break;
//            case 10:
//                System.out.println("El mes " + numeroMes + " tiene 31 dias");
//                break;
//            case 11:
//                System.out.println("El mes " + numeroMes + " tiene 30 dias");
//                break;
//            case 12:
//                System.out.println("El mes " + numeroMes + " tiene 31 dias");
//                break;
//            default:
//                System.out.println("Ingresa un numero de mes valido...");
//                break;
//        }


//        Ejercicio 7: Menú Interactivo
//        Implementa un programa que muestre un menú con opciones para realizar diferentes operaciones
//        matemáticas (por ejemplo, sumar, restar, multiplicar, dividir). El usuario debe poder seleccionar una
//        opción ingresando un número, y luego el programa debe pedir los números necesarios para realizar
//        la operación elegida y mostrar el resultado. Utiliza una estructura switch para manejar las opciones
//        del menú.

//        System.out.println("Bienvvenido a tu calculadora avanzada\n\n1: sumar\n\n2: restar\n\n3: multiplicar\n\n4: dividir\n\n5: salir....");
//        Scanner consola = new Scanner(System.in);
//        int numeroOpcion = Integer.parseInt(consola.nextLine());
//        int num1;
//        int num2;
//        switch (numeroOpcion){
//            case 1:
//                System.out.println("Elegiste la opcion de SUMAR: ingresa dos numeros a continuacion:  ");
//                num1 = Integer.parseInt(consola.nextLine());
//                num2 = Integer.parseInt(consola.nextLine());
//                System.out.println("La suma de " + num1 + " y " + num2 + " es: " + num1+num2);
//                break;
//            case 2:
//                System.out.println("Elegiste la opcion de RESTAR: ingresa dos numeros a continuacion:  ");
//                num1 = Integer.parseInt(consola.nextLine());
//                num2 = Integer.parseInt(consola.nextLine());
//                System.out.println("La resta de " + num1 + " y " + num2 + " es: " + num1+num2);
//                break;
//            case 3:
//                System.out.println("Elegiste la opcion de MULTIPLICAR: ingresa dos numeros a continuacion:  ");
//                num1 = Integer.parseInt(consola.nextLine());
//                num2 = Integer.parseInt(consola.nextLine());
//                System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + num1+num2);
//                break;
//            case 4:
//                System.out.println("Elegiste la opcion de DIVIDIR: ingresa dos numeros a continuacion:  ");
//                num1 = Integer.parseInt(consola.nextLine());
//                num2 = Integer.parseInt(consola.nextLine());
//                System.out.println("La division de " + num1 + " y " + num2 + " es: " + num1+num2);
//                break;
//            case 5:
//                System.out.println("saliendooo....");
//                break;
//        }


//        Ejercicio 8: Cálculo de Promedio
//        Escribe un programa que solicite al usuario ingresar tres calificaciones, calcule el promedio y
//        muestre un mensaje indicando si el alumno aprueba o no (considera que se aprueba con un
//        promedio de 6 o más).

//        System.out.println("Bienvenido usuario a tu calculo de promedio, ingresa a continuacion tus ultimas 3 notas academicas:  ");
//        Scanner consola = new Scanner(System.in);
//        float calificacion1 = Float.parseFloat(consola.nextLine());
//        float calificacion2 = Float.parseFloat(consola.nextLine());
//        float calificacion3 = Float.parseFloat(consola.nextLine());
//        float promedio =  (calificacion1+calificacion2+calificacion3)/3;
//        if(promedio > 6){
//            System.out.println("Aprobaste muchacho, tu promedio fue de: " + promedio);
//        }else{
//            System.out.println("No aprobaste esa mondá, tu promedio fue de: " + promedio);
//        }


//        Ejercicio 9: Calculadora de Año Bisiesto
//        Escribe un programa que le pida al usuario que ingrese un año y determine si es un año bisiesto o
//        no. Recuerda que un año es bisiesto si es divisible entre 4, excepto aquellos que son divisibles entre
//        100, a menos que también sean divisibles entre 400.

//        System.out.println("Bienvenido a tu calculadora de año bisiesto, ingresa un año:  ");
//        Scanner consola = new Scanner(System.in);
//        int yearUser = Integer.parseInt(consola.nextLine());
//        if(yearUser%4 == 0 || yearUser%100 == 0 && yearUser%400 == 0){
//            System.out.println("El año " + yearUser + " es bisiesto");
//        }else{
//            System.out.println("El año " + yearUser + " no es bisiesto");
//        }


//        Ejercicio 10: Calculadora de Propina
//        Desarrolla un programa que calcule cuánto dejar de propina en un restaurante. El usuario debe
//        ingresar el total de la cuenta y el porcentaje de propina que desea dejar. El programa debe mostrar
//        cuánto dinero en propina debe dejar.

//        System.out.println("Bienvenido a tu calculadora de propina, ingresa el total de tu cuenta:  ");
//        Scanner consola = new Scanner(System.in);
//        double totalCuenta = Double.parseDouble(consola.nextLine());
//        System.out.println("Ahora ingresa el porcentaje que deseas dejar en propina:  ");
//        double porcentajePropina = Double.parseDouble(consola.nextLine());
//        double totalPropina = (porcentajePropina/100)*totalCuenta;
//        System.out.println("su propina es de " + totalPropina + " $");


//        Ejercicio 11: Ordenando Tres Números
//
//        Crea un programa que solicite al usuario ingresar tres números enteros y luego los muestre
//        ordenados de menor a mayor. Intenta resolverlo primero con if y else, y luego intenta crear una
//        solución usando el operador ternario para práctica adicional.


//        System.out.println("Ingresa 3 numeros a continuacion: ");
//        Scanner consola = new Scanner(System.in);
//        int num1 = Integer.parseInt(consola.nextLine());
//        int num2 = Integer.parseInt(consola.nextLine());
//        int num3 = Integer.parseInt(consola.nextLine());
//
//        int numMayor = 0, numMedio = 0, numMenor = 0;
//
//        if (num1 >= num2 && num1 >= num3) {
//            numMayor = num1;
//            if (num2 >= num3) {
//                numMedio = num2;
//                numMenor = num3;
//            } else {
//                numMedio = num3;
//                numMenor = num2;
//            }
//        } else if (num2 >= num1 && num2 >= num3) {
//            numMayor = num2;
//            if (num1 >= num3) {
//                numMedio = num1;
//                numMenor = num3;
//            } else {
//                numMedio = num3;
//                numMenor = num1;
//            }
//        } else if (num3 >= num1 && num3 >= num2) {
//            numMayor = num3;
//            if (num1 >= num2) {
//                numMedio = num1;
//                numMenor = num2;
//            } else {
//                numMedio = num2;
//                numMenor = num1;
//            }
//        }
//        System.out.println("Numeros ordenados de menor a mayor: " + numMenor + ", " + numMedio + ", " + numMayor);

        // con ternarios

//        int numMenor = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2 : num3;
//
//        int numMayor = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;
//
//        int numMedio = (num1 != numMenor && num1 != numMayor) ? num1 : (num2 != numMenor && num2 != numMayor) ? num2 : num3;
//
//        System.out.println("Numeros ordenados de menor a mayor: " + numMenor + ", " + numMedio + ", " + numMayor);


//        Ejercicio 12: Generador de Horóscopo
//        Implementa un programa que le pida al usuario su mes y día de nacimiento. Luego, basado en esa
//        información, muestra su signo del zodíaco. Utiliza una estructura switch para manejar los meses y if
//        para los días.

//        System.out.println("Bienvenido a tu generador de horoscopos, a continuacion ingresa tu mes de cumpleaños:  ");
//        Scanner consola = new Scanner(System.in);
//        var mesUsuario = consola.nextLine();
//        System.out.println("Ingresa tu dia de cumpleaños:  ");
//        int diaUsuario = Integer.parseInt(consola.nextLine());
//        switch (mesUsuario){
//            case "enero":
//                if(diaUsuario >= 20 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Acuario");
//                }else {
//                    System.out.println("Tu horoscopo es Capricornio");
//                }
//                break;
//            case "febrero":
//                if(diaUsuario >= 19 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Piscis");
//                }else{
//                    System.out.println("Tu horoscopo es Acuario");
//                }
//                break;
//            case "marzo":
//                if(diaUsuario >= 21 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Aries");
//                }else{
//                    System.out.println("Tu horoscopo es Piscis");
//                }
//                break;
//            case "abril":
//                if(diaUsuario >= 20 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Tauro");
//                }else{
//                    System.out.println("Tu horoscopo es Aries");
//                }
//                break;
//            case "mayo":
//                if(diaUsuario >= 21 && diaUsuario <= 31 ){
//                    System.out.println("Tu horoscopo es Geminis");
//                }else{
//                    System.out.println("Tu horoscopo es Tauro");
//                }
//                break;
//            case "junio":
//                if(diaUsuario >= 21 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Cancer");
//                }else{
//                    System.out.println("Tu horoscopo es Geminis");
//                }
//                break;
//            case "julio":
//                if(diaUsuario >= 23 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Leo");
//                }else{
//                    System.out.println("Tu horoscopo es Cancer");
//                }
//                break;
//            case "agosto":
//                if(diaUsuario >= 23 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Virgo");
//                }else{
//                    System.out.println("Tu horoscopo es Leo");
//                }
//                break;
//            case "septiembre":
//                if(diaUsuario >= 23 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Libra");
//                }else{
//                    System.out.println("Tu horoscopo es Virgo");
//                }
//                break;
//            case "octubre":
//                if(diaUsuario >= 23 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Escorpio");
//                }else{
//                    System.out.println("Tu horoscopo es Libra");
//                }
//                break;
//            case "noviembre":
//                if(diaUsuario >= 22 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Sagitario");
//                }else{
//                    System.out.println("Tu horoscopo es Escorpio");
//                }
//                break;
//            case "diciembre":
//                if(diaUsuario >= 22 && diaUsuario <= 31){
//                    System.out.println("Tu horoscopo es Capricornio");
//                }else{
//                    System.out.println("Tu horoscopo es Sagitario");
//                }
//                break;
//            default:
//                System.out.println("Ingresa un valor valido");
//                break;
//        }


//        Ejercicio 13: Calculadora de Tarifa de Taxi
//        Desarrolla un programa que calcule el costo de un viaje en taxi basándose en la distancia del viaje
//        (en kilómetros) y la tarifa base. Puedes añadir una tarifa adicional por kilómetro recorrido. El
//        usuario debe ingresar la distancia del viaje.

//        System.out.println("Bienvenido a tu taxi de confianza, a continuacion ingresa la distancia del viaje en kilometros:  ");
//        Scanner consola = new Scanner(System.in);
//        float distancia = Float.parseFloat(consola.nextLine());
//        //supongamos que la tarifa por kilometro es de 1500 pesos
//        float tarifa = 1500;
//        float totalCarrera = distancia*tarifa;
//        System.out.println("tu tarifa total es de " + totalCarrera);


//        Ejercicio 14: Convertidor de Temperatura
//        Crea un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe
//        poder elegir si quiere convertir de Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
//        Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a
//        Fahrenheit.

//        System.out.println("Bienvenido usuario a tu convertidor de temperaturas, elige la temperatura que deseas convertir\n\n1: de celsius a fahrenheit\n2: de fahrenheit a celsius:  ");
//        Scanner consola = new Scanner(System.in);
//        int desicionNumero = Integer.parseInt(consola.nextLine());
//        switch (desicionNumero){
//            case 1:
//                System.out.println("Has elegido de celsius a fahrenheit, ingresa los grados celsius:  ");
//                float gradosCelsius = Float.parseFloat(consola.nextLine());
//                float resultadoFahrenheit = gradosCelsius * 9/5 +32;
//                System.out.println("Tus grados celsius a grados fahrenheit son: " + resultadoFahrenheit + " grados fahrenheit");
//                break;
//            case 2:
//                System.out.println("Has elegido de fahrenheit a celsius, ingresa los grados fahrenheit:  ");
//                float gradosFahrenheit = Float.parseFloat(consola.nextLine());
//                float resultadoCelsius = (gradosFahrenheit-32)*5/9;
//                System.out.println("Tus grados fahrenheit a grados celsius son: " + resultadoCelsius + " grados celsius");
//                break;
//            default:
//                System.out.println("Ingresa un valor valido...");
//                break;
//        }


//        Ejercicio 15: Sistema de Calificaciones
//        Implementa un programa que le pida al usuario la calificación de un examen (0-100). Basado en la
//        calificación, el programa debe mostrar una letra (A, B, C, D, F), donde A es 90-100, B es 80-89,
//                etc. Considera utilizar if o switch.

//        System.out.println("Bienvenido usuario a tu sistema de calificaciones, a continuacion ingresa la calificacion de tu examen (0-100):  ");
//        Scanner consola = new Scanner(System.in);
//        int calificacionUsuario = Integer.parseInt(consola.nextLine());
//        if(calificacionUsuario >= 90 && calificacionUsuario <= 100){
//            System.out.println("A, felicidades!");
//        } else if (calificacionUsuario >= 80 && calificacionUsuario <= 89) {
//            System.out.println("B, Estudia!");
//        } else if (calificacionUsuario >= 60 && calificacionUsuario <= 79) {
//            System.out.println("C, Muy bien");
//        } else if (calificacionUsuario >= 40 && calificacionUsuario <= 59) {
//            System.out.println("D, Debes mejorar");
//        } else if (calificacionUsuario >= 0 && calificacionUsuario <= 39) {
//            System.out.println("F, Raspado! :/");
//        }else{
//            System.out.println("numero no valido");
//        }
    }
}

//thanks...