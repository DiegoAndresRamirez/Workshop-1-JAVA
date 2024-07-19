import java.util.Scanner;

public class Day6 {


    private static String[][][] taller;
    private static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa el numero de trabajadores que quieres tener en tu taller: ");
        int numeroTrabajadores = Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa el numero de trabajos que tendra cada trabajador: ");
        int numeroTrabajos = Integer.parseInt(consola.nextLine());
        taller = new String[numeroTrabajadores][numeroTrabajos + 1][6];
        boolean desicionBandera = true;
        do {
            System.out.println("Ingresa la opcin que quieras: \n\n1: agregar trabajadores e informacion\n2: buscar vehiculos por marca y modelo\n3: buscar vehiculos por estado\n4: actualizar estado de un vehiculo\n5: Imprimir todos los vehiculos\n6: Salir");
            int desicionUsuario = Integer.parseInt(consola.nextLine());
            switch (desicionUsuario){
                case 1:
                    for (int i = 0; i < numeroTrabajadores; i++) {
                        agregarTrabajadores(i);
                        for (int j = 1; j <= numeroTrabajos; j++) {
                            agregarTrabajos(i, j);
                            agregarInformacion(i, j);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el modelo que quieres buscar: ");
                    String modeloBuscar = consola.nextLine();
                    System.out.println("Ingresa la marca que quieres buscar: ");
                    String marcaBuscar = consola.nextLine();
                    mostrarPorMarcaModelo(marcaBuscar, modeloBuscar);
                    break;
                case 3:
                    System.out.println("Ingresa el estado que quieres buscar: ");
                    String estadoBuscar = consola.nextLine();
                    mostrarPorEstado(estadoBuscar);
                    break;
                case 4:
                    System.out.println("Ingresa la marca que quieres buscar: ");
                    marcaBuscar = consola.nextLine();
                    System.out.println("Ingresa el modelo que quieres buscar: ");
                    modeloBuscar = consola.nextLine();
                    actualizarEstado(marcaBuscar, modeloBuscar);
                    break;
                case 5:
                    imprimirTaller();
                    break;
                case 6:
                    System.out.println("Saliendooo...");
                    desicionBandera = false;
                    consola.close();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida...");
            }
        }while(desicionBandera);

    }

    public static void agregarTrabajadores(int indice) {
        System.out.println("Ingresa el nombre para el trabajador numero " + (indice + 1) + ": ");
        String nombreTrabajador = consola.nextLine();
        taller[indice][0][0] = nombreTrabajador;
    }

    public static void agregarTrabajos(int indice, int indiceTrabajo) {
        System.out.println("Ingresa el tipo de vehiculo que va a arreglar el trabajador " + (indice + 1) + " en el trabajo " + indiceTrabajo + ":\n1: carro\n2: moto");
        String tipoVehiculo = consola.nextLine();
        if (tipoVehiculo.equals("1")) {
            taller[indice][indiceTrabajo][1] = "carro";
        } else if (tipoVehiculo.equals("2")) {
            taller[indice][indiceTrabajo][1] = "moto";
        } else {
            System.out.println("Ingresa un caracter valido...");
            agregarTrabajos(indice, indiceTrabajo);
        }
    }

    public static void agregarInformacion(int indice, int indiceTrabajo) {
        System.out.println("Ingresa la marca del vehiculo: ");
        String marcaVehiculo = consola.nextLine();
        taller[indice][indiceTrabajo][2] = marcaVehiculo;

        System.out.println("Ingresa el modelo del vehiculo: ");
        String modeloVehiculo = consola.nextLine();
        taller[indice][indiceTrabajo][3] = modeloVehiculo;

        System.out.println("Ingresa el año del vehiculo: ");
        String añoVehiculo = consola.nextLine();
        taller[indice][indiceTrabajo][4] = añoVehiculo;

        System.out.println("Ingresa el estado del vehiculo\n1: Pendiente\n2: En reparacion\n3: Reparado");
        String estadoVehiculo = consola.nextLine();
        switch (estadoVehiculo) {
            case "1":
                taller[indice][indiceTrabajo][5] = "pendiente";
                break;
            case "2":
                taller[indice][indiceTrabajo][5] = "en reparacion";
                break;
            case "3":
                taller[indice][indiceTrabajo][5] = "reparado";
                break;
            default:
                System.out.println("Ingresa un dato valido");
        }
    }

    public static void imprimirTaller() {
        for (int i = 0; i < taller.length; i++) {
            System.out.println("Trabajador " + (i + 1) + ": " + taller[i][0][0]);
            for (int j = 1; j < taller[i].length; j++) {
                if (taller[i][j][1] != null) {
                    System.out.println("  Trabajo " + j + ": " + taller[i][j][1]);
                    System.out.println("    Marca: " + taller[i][j][2]);
                    System.out.println("    Modelo: " + taller[i][j][3]);
                    System.out.println("    Año: " + taller[i][j][4]);
                    System.out.println("    Estado: " + taller[i][j][5]);
                }
            }
        }
    }

    public static void mostrarPorEstado(String estado){
        System.out.println("trabajos por estado " + estado + " : ");
        boolean flag = false;
        for (int i = 0; i < taller.length; i++) {
            for (int j = 1; j < taller[i].length; j++) {
                if(taller[i][j][5] != null && taller[i][j][5].equalsIgnoreCase(estado)){
                    flag = true;
                    System.out.println("trabajador :" + (i+1) + " : " + taller[i][0][0]);
                    System.out.println("  Trabajo " + j + ": " + taller[i][j][1]);
                    System.out.println("    Marca: " + taller[i][j][2]);
                    System.out.println("    Modelo: " + taller[i][j][3]);
                    System.out.println("    Año: " + taller[i][j][4]);
                    System.out.println("    Estado: " + taller[i][j][5]);
                }
            }
        }
        if(!flag){
            System.out.println("no se encontraron trabajos en el estado: " + estado);
        }
    }

    public static void mostrarPorMarcaModelo(String marca, String modelo){
        System.out.println("vehiculo por marca: " + marca + " , y modelo: " + modelo + " : ");
        boolean encontrado = false;
        for (int i = 0; i < taller.length; i++) {
            for (int j = 1; j < taller[i].length ; j++) {
                if(taller[i][j][2] != null && taller[i][j][2].equalsIgnoreCase(marca) && taller[i][j][3].equalsIgnoreCase(modelo)){
                    encontrado = true;
                    System.out.println("trabajador :" + (i+1) + " : " + taller[i][0][0]);
                    System.out.println("  Trabajo " + j + ": " + taller[i][j][1]);
                    System.out.println("    Marca: " + taller[i][j][2]);
                    System.out.println("    Modelo: " + taller[i][j][3]);
                    System.out.println("    Año: " + taller[i][j][4]);
                    System.out.println("    Estado: " + taller[i][j][5]);
                }
            }
        }
        if (!encontrado){
            System.out.println("No se encontro un vehiculo con esas caracteristicas");
        }
    }

    public static void actualizarEstado(String marca, String modelo){
        System.out.println("vehiculo por marca: " + marca + " , y modelo: " + modelo + " : ");
        boolean encontrado = false;
        for (int i = 0; i < taller.length; i++) {
            for (int j = 1; j < taller[i].length ; j++) {
                if(taller[i][j] != null && taller[i][j][2] != null && taller[i][j][2].equalsIgnoreCase(marca) && taller[i][j][3].equalsIgnoreCase(modelo)){
                    encontrado = true;
                    System.out.println("trabajador :" + (i+1) + " : " + taller[i][0][0]);
                    System.out.println("  Trabajo " + j + ": " + taller[i][j][1]);
                    System.out.println("    Marca: " + taller[i][j][2]);
                    System.out.println("    Modelo: " + taller[i][j][3]);
                    System.out.println("    Año: " + taller[i][j][4]);
                    System.out.println("    Estado: " + taller[i][j][5]);

                    System.out.println("\nIngresa el nuevo estado: ");
                    String newEstado = consola.nextLine();
                    taller[i][j][5] = newEstado;

                    System.out.println("Se actualizo el estado correctamente");
                    System.out.println("trabajador :" + (i+1) + " : " + taller[i][0][0]);
                    System.out.println("  Trabajo " + j + ": " + taller[i][j][1]);
                    System.out.println("    Marca: " + taller[i][j][2]);
                    System.out.println("    Modelo: " + taller[i][j][3]);
                    System.out.println("    Año: " + taller[i][j][4]);
                    System.out.println("    Estado: " + taller[i][j][5]);
                }
            }
        }
        if (!encontrado){
            System.out.println("No se encontro un vehiculo con esas caracteristicas");
        }
        String nombrecito = "diego";
        Clasesita clase = new Clasesita(nombrecito);
    }
    //omiti validaciones, no creo que sean necesarias en esta punto...


}
