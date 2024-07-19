package Clases;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private ArrayList<Float> calificaciones = new ArrayList<>();

    public Estudiante(String nombre, ArrayList<Float> calificaciones){
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void calcularPromedio(ArrayList<Float> calificaciones){
        Float sumador = 0.0f;
        Integer contador = 0;
        for (float calificacion : calificaciones){
            sumador+= calificacion;
            contador++;
        }
        Float operacion = sumador/contador;
        System.out.println("Promedio : " + operacion +  "\nnumero de calificaciones: " +  contador);
    }

    public void añadirCalificacion(Float calificacion, ArrayList<Float> calificaciones){
        if(calificacion>=0 && calificacion<= 10){
            calificaciones.add(calificacion);
            System.out.println("La calificacion se ha agregado");
        }else {
            System.out.println("Ingresa una nota entre 0 y 10");
        }
    }
}
