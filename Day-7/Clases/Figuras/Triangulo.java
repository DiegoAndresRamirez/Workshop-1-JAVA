package Clases.Figuras;

public class Triangulo extends Figura {
    private Float base;
    private Float altura;

    public Triangulo(Float base, Float altura){
        super(base, altura);
        this.base = base;
        this.altura = altura;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        Float operacion = (base*altura)/2;
        System.out.println("el area del triangulo es " + operacion);
    }
}
