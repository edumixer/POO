public class Banco {
    public static void main(String[] args) {
        Cliente jandira =  new Cliente("Jandira Silva",84037,2500);
        Cliente sandra = new Cliente("Sandra Rodigues", 70662, 1800);
        Cliente luciano = new Cliente("Luciano Texeira", 20718, 5000);

        jandira.imprimir();

        sandra.imprimir();

        luciano.imprimir();

        jandira.retirar(1000);
        jandira.imprimir();

        sandra.retirar(2000);
        sandra.depositar(500);
        sandra.imprimir();

        sandra.retirar(2000);
        sandra.imprimir();

        luciano.depositar(1000);
        luciano.imprimir();
    }

}