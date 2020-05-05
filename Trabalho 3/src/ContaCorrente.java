public class ContaCorrente {
    private int numero;
    private double saldo;
    public ContaCorrente(int numero,double saldo){
        this.saldo = saldo;
        this.numero = numero;
    }

    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    public double retirar(double valor){
        if (saldo - valor <= 0){
            System.out.println("Não possui o saldo suficiente.");
            return 0.0;
        }
        else {
            saldo = saldo - valor;
            return valor;
        }
    }
    public void imprimir_dados(){
        System.out.print("Numero da conta: ");
        System.out.println(numero);
        System.out.print("Saldo da conta: ");
        System.out.println(saldo);
    }
}
