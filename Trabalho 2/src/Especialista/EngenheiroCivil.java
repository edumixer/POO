package Especialista;

import Matematica.Retangulo;

public class EngenheiroCivil {
    private static String Nome = "João";
    private static int idade = 21;
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.definirLado((float) 4.7, (float) 8.2);
        System.out.print("Area: ");
        System.out.println(retangulo.area());
        System.out.print("Perimetro: ");
        System.out.println(retangulo.perimetro());
        exibir_dados_pessoais();
    }
    public static void exibir_dados_pessoais(){
        System.out.print("Nome: ");
        System.out.println(Nome);
        System.out.print("Idade: ");
        System.out.println(idade);
    }
}
