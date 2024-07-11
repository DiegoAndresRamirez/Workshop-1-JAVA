public class Day4 {
    public static void main(String[] args) {


//        1. Calculadora de Promedios: Escribe un programa que utilice un array de tipo
//        double para almacenar las calificaciones finales de 10 estudiantes en un curso. El
//        programa debe calcular y mostrar el promedio de estas calificaciones.

//        Scanner consola = new Scanner(System.in);
//        double[] dobles = new double[10];
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println("Please user, enter your last grades of your course:  ");
//            double gradeUser = Double.parseDouble(consola.nextLine());
//            dobles[i] = gradeUser;
//        }
//        double result = 0;
//        for (double nota : dobles){
//            result += nota;
//        }
//        double promedy = result/10;
//        System.out.println(promedy);
//
//        2. Buscador de Número Mayor y Menor: Utiliza un array de int para almacenar 5
//        números enteros ingresados por el usuario (puedes usar la clase Scanner para la
//        entrada de datos). El programa debe encontrar y mostrar el número mayor y el
//        menor de la lista.

//        Scanner consola = new Scanner(System.in);
//        int[] numeros = new int[5];
//        for (int i = 0; i <= 4; i++) {
//            System.out.println("Pleaase enter a number:  ");
//            int number = Integer.parseInt(consola.nextLine());
//            numeros[i] = number;
//        }
//        Arrays.sort(numeros);
//        System.out.println("numero mayor " + numeros[numeros.length-1] + "  numero menor " + numeros[0]);

//        3. Sistema de Reservas: Desarrolla un programa para un teatro para gestionar las
//        reservas de asientos. El teatro tiene 5 filas con 10 asientos cada una. Utiliza un
//        arreglo bidimensional de boolean donde true representa un asiento ocupado y false
//        uno disponible. El sistema debe permitir:

//         Reservar y cancelar asientos.
//         Mostrar los asientos disponibles.
//         Contabilizar el total de asientos ocupados y disponibles.

//        Scanner consola = new Scanner(System.in);
//        boolean [][] asientos = new boolean[5][10];
//        System.out.println("Bienvenido usuario a tu cine, imprimire todos los asientos disponibles");
//        for (int i = 0; i < asientos.length; i++) {
//            for (int j = 0; j < asientos[i].length; j++) {
//                System.out.print(asientos[i][j] + " ");
//            }
//            System.out.println();
//        }
//        boolean flag = true;
//        while (flag){
//            System.out.println("Bienvenido usuario\n\n1: ocupar asiento\n2: cancelar asiento\n3: imprimir todos los asientos\n4: salir");
//            String respuesta = consola.nextLine();
//            switch (respuesta){
//                case "1":
//                    System.out.println("Que fila quieres? (0-4):  ");
//                    int numeroFila = Integer.parseInt(consola.nextLine());
//                    System.out.println("que numero de asiento quieres (0-9): ");
//                    int numeroAsiento = Integer.parseInt(consola.nextLine());
//                    if(!asientos[numeroFila][numeroAsiento]){
//                        System.out.println("Assiento agregado");
//                        asientos[numeroFila][numeroAsiento] = true;
//                        for (int i = 0; i < asientos.length; i++) {
//                            for (int j = 0; j < asientos[i].length; j++) {
//                                System.out.print(asientos[i][j] + " ");
//                            }
//                            System.out.println();
//                        }
//
//                    }else {
//                        System.out.println("\nEl asiento esta ocupado");
//                    }
//                    break;
//                case "2":
//                    System.out.println("Que fila quieres? (0-4):  ");
//                    numeroFila = Integer.parseInt(consola.nextLine());
//                    System.out.println("que numero de asiento quieres (0-9): ");
//                    numeroAsiento = Integer.parseInt(consola.nextLine());
//                    if (asientos[numeroFila][numeroAsiento]){
//                        asientos[numeroFila][numeroAsiento] = false;
//                        for (int i = 0; i < asientos.length; i++) {
//                            for (int j = 0; j < asientos[i].length; j++) {
//                                System.out.print(asientos[i][j] + " ");
//                            }
//                            System.out.println();
//                        }
//                    }else {
//                        System.out.println("\nEl asiento esta disponible");
//                    }
//                    break;
//                case "3":
//                    for (int i = 0; i < asientos.length; i++) {
//                        for (int j = 0; j < asientos[i].length; j++) {
//                            System.out.print(asientos[i][j] + " ");
//                        }
//                        System.out.println();
//                    }
//                    int ocupados = 0;
//                    int disponibles = 0;
//                    for (int i = 0; i < asientos.length; i++) {
//                        for (int j = 0; j < asientos[i].length; j++) {
//                            if (asientos[i][j]) {
//                                ocupados++;
//                            } else {
//                                disponibles++;
//                            }
//                        }
//                    }
//                    System.out.println("Asientos disponibles: " + disponibles);
//                    System.out.println("Asientos ocupados: " + ocupados);
//                    break;
//                case "4":
//                    System.out.println("Hasta luego usuario");
//                    flag = false;
//                    break;
//            }
//        }

//        4. Planificador de Viajes: Escribe un programa para ayudar a planificar viajes por
//        carretera. Los usuarios pueden ingresar varias ciudades que planean visitar en
//        orden. Utiliza un arreglo de String para almacenar las ciudades. El programa debe
//        ser capaz de:
//         Añadir y remover ciudades del itinerario.
//         Mostrar la lista completa de ciudades a visitar.
//         (Opcional) Calcular la distancia total del viaje asumiendo distancias ficticias entre
//        ciudades consecutivas.

//        Scanner consola = new Scanner(System.in);
//        String[] viajes = new String[10];
//        System.out.println("Bienvenido a tu planificador de viajes");
//        boolean flag = true;
//        while(flag){
//            System.out.println("1: añadir ciudad\n2: eliminar ciudad\n3: salir");
//            int eleccionUsuario = Integer.parseInt(consola.nextLine());
//            switch (eleccionUsuario){
//                case 1:
//                    boolean seguirAñadiendo = true;
//                    int contador = 0;
//
//                    while (seguirAñadiendo && contador < viajes.length) {
//                        System.out.println("Ingresa una ciudad: ");
//                        String nuevaCiudad = consola.nextLine();
//                        viajes[contador] = nuevaCiudad;
//                        contador++;
//
//                        if (contador < viajes.length) {
//                            System.out.println("Quieres agregar otra ciudad? (si/no): ");
//                            String decision = consola.nextLine();
//                            if (decision.equalsIgnoreCase("no")) {
//                                seguirAñadiendo = false;
//                            }
//                        } else {
//                            System.out.println("Has alcanzado el máximo de ciudades que puedes agregar.");
//                            seguirAñadiendo = false;
//                        }
//                    }
//                    break;
//                case 2:
//                    System.out.println("Lista de ciudades planificadas:");
//                    int conteo = 0;
//                    for (String ciudad : viajes) {
//                        conteo++;
//                        if (ciudad != null) {
//                            System.out.println(conteo+ " " + ciudad);
//                        }
//                    }
//                    System.out.println();
//                    System.out.println("Ingresa la ciudad que quieres eliminar:  ");
//                    int indiceEliminar = Integer.parseInt(consola.nextLine())-1;
//                    if (indiceEliminar >= 0 && indiceEliminar < viajes.length && viajes[indiceEliminar] != null) {
//                        // Eliminar la ciudad y desplazar los elementos a la izquierda
//                        for (int i = indiceEliminar; i < viajes.length - 1; i++) {
//                            viajes[i] = viajes[i + 1];
//                        }
//                        viajes[viajes.length - 1] = null; // Último elemento a null
//                        System.out.println("Ciudad eliminada correctamente.");
//                    } else {
//                        System.out.println("Índice inválido.");
//                    }
//                    break;
//
//                case 3:
//                    flag = false;
//                    System.out.println("Saliendo del planificador de viajes...");
//                    break;
//
//                default:
//                    System.out.println("Opción no invalida");
//
//            }
//
//        }

//        5. Lista de Reproducción Musical: Imagina que estás creando una aplicación para
//        gestionar listas de reproducción musicales. Cada canción es representada
//        simplemente por su nombre. El programa debe permitir:
//         Añadir y remover canciones de la lista de reproducción.
//         Mostrar la canción actual y las siguientes en la lista.
//         Saltar a la siguiente canción.

//        List<String> canciones = new ArrayList<>();
//        Scanner consola = new Scanner(System.in);
//        System.out.println("Bienvenido usuario");
//        boolean flag = true;
//        while(flag){
//            System.out.println("Ingrese su opcion: \n\n1: agregar cancion\n2: remover cancion\n3: mostrat cancion actual y siguiente\n4: saltar a la siguiente cancion\n5: salir");
//            int eleccionUsuario = Integer.parseInt(consola.nextLine());
//            switch (eleccionUsuario){
//                case 1:
//                    System.out.println("Ingrese el nombre de la cancion: ");
//                    String nuevaCancion = consola.nextLine();
//                    canciones.add(nuevaCancion);
//                    System.out.println("La cancion se agregoo correctamente");
//                    break;
//                case 2:
//                    int contador = 0;
//                    for (String cancion : canciones){
//                        System.out.println(contador + "  " + cancion);
//                        contador++;
//                    }
//                    System.out.println("Ingresa el numero de la cancion que deseas remover:  ");
//                    int indiceCancion = Integer.parseInt(consola.nextLine());
//                    canciones.remove(indiceCancion);
//                    System.out.println("Se elimino la cancion correctamente");
//                    break;
//                case 3:
//                    if (!canciones.isEmpty() && canciones.size() > 1) {
//                        String primeraCancion = canciones.get(0);
//                        String segundaCancion = canciones.get(1);
//                        System.out.println("Canción actual: " + primeraCancion + ", siguiente canción: " + segundaCancion);
//                    } else if (!canciones.isEmpty()) {
//                        System.out.println("Canción actual: " + canciones.get(0) + ", no hay más canciones en la lista.");
//                    } else {
//                        System.out.println("No tienes canciones en tu playlist");
//                    }
//                    break;
//
//                case 4:
//                    if (canciones.size() > 1) {
//                        String primeraCancion = canciones.get(0);
//                        String segundaCancion = canciones.get(1);
//                        canciones.set(0, segundaCancion);
//                        canciones.set(1, primeraCancion);
//                        System.out.println("Se cambio la cancion");
//                    } else {
//                        System.out.println("No hay suficientes canciones para cambiar");
//                    }
//                    break;
//                case 5:
//                    System.out.println("saliendo....");
//                    flag = false;
//                    break;
//            }
//        }

    }
}