public class Cliente {
    private String nome;
    public ContaCorrente contaCorrente;
    public Cliente(String nome,int numero, double saldo){
        this.nome = nome;
        ligar(numero,saldo);
    }
    private void ligar(int numero,double saldo){

        ContaCorrente dados = new ContaCorrente(numero,saldo);
        contaCorrente = dados;
    }

    public void depositar(double deposito){
        contaCorrente.depositar(deposito);

    }
    public void retirar(double retira){
        contaCorrente.retirar(retira);
    }
    public void imprimir(){
        System.out.print("Nome: ");
        System.out.println(nome);
        contaCorrente.imprimir_dados();
        System.out.println("");
    }
}
