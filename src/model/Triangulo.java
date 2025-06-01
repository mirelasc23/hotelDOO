package model;

public class Triangulo {
    private float base, altura, area;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        //area = base * altura / 2;
    }

    @Override
    public String toString() {
        return "Base: " + getBase() + 
                " \nAltura: " + getAltura() + 
                " \nÁrea=" + getBase() + '}';
    }

    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea() {
        area = base * altura / 2;
    }
    
    public void setArea(float base, float altura) {
        this.area = base * altura / 2;
    }
}
