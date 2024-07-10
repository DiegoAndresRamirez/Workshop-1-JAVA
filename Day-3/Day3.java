import javax.swing.*;
import java.util.*;

public class Day3 {
    public static void main(String[] args) {

//        Ejercicio 1: Números primos
//        Crea un programa e imprima los primeros “n” números primos.

//        Scanner consola = new Scanner(System.in);
//        System.out.println("Bienvenido usuario, a continuación ingresa un número: ");
//        int numeroUsuario = consola.nextInt();
//        System.out.println("Números primos menores que " + numeroUsuario + ":");
//        for (int i = 2; i < numeroUsuario; i++) {
//            boolean esPrimo = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    esPrimo = false;
//                    break;
//                }
//            }
//            if (esPrimo) {
//                System.out.println(i);
//            }
//        }


//        Ejercicio 2: Tabla de multiplicación
//        Crea un programa que pida al usuario un número e imprima la tabla
//        de multiplicar del 1 al 10 del número ingresado.

//        Scanner consola = new Scanner(System.in);
//        System.out.println("Bienvenido usuario, a continuacion ingresa un numero:  ");
//        int numeroUsuario = consola.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(numeroUsuario + " x " + i + " : " + numeroUsuario*i);
//        }

//        Ejercicio 3: Número de Fibonacci:
//        Crea un programa e imprima los primeros “n” números de Fibonacci.

//        Scanner consola = new Scanner(System.in);
//        System.out.println("Bienvenido usuario, a continuacion ingresa un numero:  ");
//        int numeroUsuario = consola.nextInt();
//        int a = 0;
//        int b = 1;
//        for (int i = 0; i <= numeroUsuario; i++) {
//            int acum = a+b;
//            System.out.println("acum = " + acum);
//            a = b;
//            b = acum;
//        }

//        Ejercicio 4: Rombo:
//        Escribe un programa en Java que imprima un patrón de asteriscos en
//        forma de rombo.


//        String asterisco = "*";
//        String espacios = " ";
//        int contador = 10;
//        for (int i = 0; i <= 10; i++) {
//            System.out.println( espacios.repeat(contador) +asterisco.repeat(i*2));
//            contador--;
//        }
//        contador = 1;
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(espacios.repeat(contador) +asterisco.repeat(i*2));
//            contador++;
//        }
//        System.out.println("\n\nAlgo asi jaja");

//        Ejercicio 5: Factorial:
//        Escribe un programa en Java que calcule e imprima el factorial de un
//        número dado.

//        Scanner consola = new Scanner(System.in);
//        System.out.println("Bienvenido usuario, a continuacion ingrese un numero:  ");
//        int numeroUsuario = consola.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= numeroUsuario ; i++) {
//            factorial *= i;
//        }
//        System.out.println("factorial = " + factorial);

//        Ejercicio 6: Sucesión de Ulam:
//        Escribe un programa en Java que calcule e imprima los primeros 50
//        números de la sucesión de Ulam
//        int numeroUsuario = 50;
//        for (int i = 50; i >= 0 ; i--) {
//            if(i % 2 == 0){
//                System.out.println(i/2);
//            }else{
//                System.out.println((i*3)+1);
//            }
//        }

//        Ejercicio 7: Eliminación de duplicados
//        Crea un programa que pida al usuario una frase y borre las palabras
//        repetidas, sin importar las mayúsculas.

//        Scanner consola = new Scanner(System.in);
//        System.out.println("Bienvenido usuario, a continuacion ingresa cualquier frase:  ");
//        String phrase = consola.nextLine();
//        String[] words = phrase.split(" ");
//        Set<String> uniqueWords = new HashSet<>();
//        StringBuilder result = new StringBuilder();
//        for (String word : words) {
//            if (!uniqueWords.contains(word)) {
//                uniqueWords.add(word);
//                result.append(word).append(" ");
//            }
//        }
//        if (result.length() > 0) {
//            result.setLength(result.length() - 1);
//        }
//        System.out.println(result.toString());

//        Ejercicio 8: Repetidos:
//        Cree un programa que pida al usuario una frase e imprima la vocal
//        más repetida y la consonante más repetida.


//        Scanner consola = new Scanner(System.in);
//        System.out.println("Bienvenido usuario, a continuación ingresa una frase: ");
//        String phraseUser = consola.nextLine();
//        int a = 0;
//        int e = 0;
//        int i = 0;
//        int o = 0;
//        int u = 0;
//        phraseUser = phraseUser.toLowerCase();
//        for (char letter : phraseUser.toCharArray()) {
//            switch (letter) {
//                case 'a':
//                    a++;
//                    break;
//                case 'e':
//                    e++;
//                    break;
//                case 'i':
//                    i++;
//                    break;
//                case 'o':
//                    o++;
//                    break;
//                case 'u':
//                    u++;
//                    break;
//            }
//        }
//        System.out.println("Número de vocales: \n\n a= " + a + ", e= " + e + ", i= " + i + ", o= " + o + ", u= " + u);

//        Ejercicio 9: Compresión de letras:
//        Implementa un algoritmo de compresión de cadenas (ej. "aabbbcccc"
//                se convierte en "a2b3c4").

//        Scanner consola = new Scanner(System.in);
//        StringBuilder resultado = new StringBuilder();
//        System.out.println("Biienvenido usuario, a continuacion ingresa una cadena de texto:  ");
//        String cadena = consola.nextLine();
//        int contador = 1;
//        for (int i = 0; i <cadena.length() ; i++) {
//            if(i < cadena.length() - 1 && cadena.charAt(i) == cadena.charAt(i + 1)){
//                contador++;
//            }else{
//                resultado.append(cadena.charAt(i)).append(contador);
//                contador = 1;
//            }
//        }
//        System.out.println("resultado: " + resultado.toString());

        //Torre de hanoi
        //En este ejercicio, quise hacer algo interactivo con el usuario

//        Scanner consola = new Scanner(System.in);
//        List<String> stock1 = new ArrayList<>();
//        List<String> stock2 = new ArrayList<>();
//        List<String> stock3 = new ArrayList<>();
//        int flag = 0;
//        stock1.add("1");
//        stock1.add("22");
//        stock2.add("333");
//        stock2.add("4444");
//        stock3.add("55555");
//        stock3.add("666666");
//        int maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//        boolean bandera = true;
//        do {
//            System.out.println("Usuario, a continuacion jugaremos a la torre de hanoi, veras 3 filas, fila A, fila B y fila C  ");
//            System.out.println("A" + "    " + "B" + "    " + "C");
//            for (int i = 0; i < maxLength; i++) {
//                String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//            }
//            System.out.println("Ingresa la fila en la que vas a trabajar: \n\n");
//            String filaEleccion = consola.nextLine().toLowerCase();
//            switch (filaEleccion){
//                case "a":
//                    String numeroTomado = stock1.get(0);
//                    stock1.remove(0);
//                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                    System.out.println("numeroTomado  = " + numeroTomado );
//                    for (int i = 0; i < maxLength; i++) {
//                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                    }
//                    System.out.println("Ingresa la fila en donde quieres dejar el numero tomado: ");
//                    filaEleccion = consola.nextLine().toLowerCase();
//                    switch (filaEleccion){
//                        case "a":
//                            if(stock1.isEmpty()){
//                                stock1.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock1.get(0))) {
//                                    stock1.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock1.add(0, numeroTomado); // Devolvemos el número a la fila original
//                                }
//                            }
//                            break;
//                        case "b":
//                            if (stock2.isEmpty()){
//                                stock2.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock2.get(0))) {
//                                    stock2.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock1.add(0, numeroTomado); // Devolvemos el número a la fila original
//                                }
//                            }
//                            break;
//                        case "c":
//                            if (stock3.isEmpty()){
//                                stock3.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock3.get(0))) {
//                                    stock3.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock1.add(0, numeroTomado); // Devolvemos el número a la fila original
//                                }
//                            }
//                            break;
//                    }
//                    break;
//                case "b":
//                    numeroTomado = stock2.get(0);
//                    stock2.remove(0);
//                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                    System.out.println("numeroTomado  = " + numeroTomado );
//                    for (int i = 0; i < maxLength; i++) {
//                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                    }
//                    System.out.println("Ingresa la fila en donde quieres dejar el numero tomado: ");
//                    filaEleccion = consola.nextLine().toLowerCase();
//                    switch (filaEleccion){
//                        case "a":
//                            if (stock1.isEmpty()){
//                                stock1.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock1.get(0))) {
//                                    stock1.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock2.add(0, numeroTomado); // Devolvemos el número a la fila original
//                                }
//                            }
//                            break;
//                        case "b":
//                            if (stock2.isEmpty()){
//                                stock2.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock2.get(0))) {
//                                    stock2.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock2.add(0, numeroTomado); // Devolvemos el número a la fila original
//                                }
//                            }
//                            break;
//                        case "c":
//                            if (stock3.isEmpty()){
//                                stock3.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock3.get(0))) {
//                                    stock3.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock2.add(0, numeroTomado); // Devolvemos el número a la fila original
//                                }
//                            }
//                            break;
//                    }
//                    break;
//                case "c":
//                    numeroTomado = stock3.get(0);
//                    stock3.remove(0);
//                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                    System.out.println("numeroTomado  = " + numeroTomado );
//                    for (int i = 0; i < maxLength; i++) {
//                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                    }
//                    System.out.println("Ingresa la fila en donde quieres dejar el numero tomado: ");
//                    filaEleccion = consola.nextLine().toLowerCase();
//                    switch (filaEleccion){
//                        case "a":
//                            if (stock1.isEmpty()){
//                                stock1.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock1.get(0))) {
//                                    stock1.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock3.add(0, numeroTomado); // Devolvemos el número a la fila original
//                                }
//                            }
//                            break;
//                        case "b":
//                            if (stock2.isEmpty()){
//                                stock2.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock2.get(0))) {
//                                    stock2.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock3.add(0, numeroTomado); // Devolvemos el número a la fila original
//                                }
//                            }
//                            break;
//                        case "c":
//                            if (stock3.isEmpty()){
//                                stock3.add(numeroTomado);
//                            }else {
//                                if (Integer.parseInt(numeroTomado) < Integer.parseInt(stock3.get(0))) {
//                                    stock3.add(0, numeroTomado);
//                                    maxLength = Math.max(stock1.size(), Math.max(stock2.size(), stock3.size()));
//                                    for (int i = 0; i < maxLength; i++) {
//                                        String s1 = (i < stock1.size()) ? stock1.get(i) : "";
//                                        String s2 = (i < stock2.size()) ? stock2.get(i) : "";
//                                        String s3 = (i < stock3.size()) ? stock3.get(i) : "";
//                                        System.out.println(String.format("%-8s %-8s %-8s", s1, s2, s3));
//                                    }
//                                } else {
//                                    System.out.println("El número tomado es demasiado grande para la fila A. No se ha movido.");
//                                    stock3.add(0, numeroTomado); // Devolvemos el número a la fila original
//
//                                }
//                            }
//                            break;
//                    }
//                    break;
//            }
//        }while(bandera);

    }
}
