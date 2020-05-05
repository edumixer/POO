package Matematica;

public class Retangulo {
    private float ladoH;
    private float ladoV;
    public void definirLado (float x, float y) {
        ladoH = x;
        ladoV = y;
    }
    public float area(){
        return ladoH * ladoV;
        }
    public float perimetro(){
        return (ladoV*2)+(ladoH*2);
    }
}
