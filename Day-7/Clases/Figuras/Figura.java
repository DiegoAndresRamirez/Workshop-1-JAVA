package Clases.Figuras;

public abstract class Figura {
    private Float lado1;
    private Float lado2;

    public Figura(Float lado1, Float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Figura(){

    }

    public Float getLado1() {
        return lado1;
    }

    public void setLado1(Float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2(){
        return lado2;
    }
    public void setLado2(float lado2){
        this.lado2 = lado2;
    }

    public abstract void calcularArea();
}
