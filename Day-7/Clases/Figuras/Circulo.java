package Clases.Figuras;

public class Circulo extends Figura{
    private float Radio;

    public Circulo(float Radio){
        super(Radio, null);
        this.Radio = Radio;
    }

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float radio) {
        Radio = radio;
    }
    @Override
    public void calcularArea() {
        double area = Math.PI * (Radio*Radio);
        System.out.println("El area es " + area);
    }
}
