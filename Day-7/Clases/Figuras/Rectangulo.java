package Clases.Figuras;

public class Rectangulo extends Figura{
    private float lado1;
    private float lado2;

    public Rectangulo(float lado1, float lado2){
        super(lado1, lado2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getlado1 (){
        return lado1;
    }

    public void setlado1(float lado1){
        this.lado1 = lado1;
    }

    public float getlado2(){
        return lado2;
    }

    public void setlado2(float lado2){
        this.lado2 = lado2;
    }
    @Override
    public void calcularArea() {
        double area = lado1 * lado2;
        System.out.println("El area del rectangulo es de: "+area);
    }
}
