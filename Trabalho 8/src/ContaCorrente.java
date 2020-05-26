public class ContaCorrente{

    private int Numero;
    private String Senha;
    private double Saldo;

    public ContaCorrente(int Numero, String Senha, double Saldo){
        this.Numero = Numero;
        this.Senha = Senha;
        this.Saldo = Saldo;
    }

    public void retirar(double Valor, String Senha) throws ExecaoSenhaInvalida, ExecaoSaldoInsuficiente{

            if(!(Senha.equals(this.Senha))) throw new ExecaoSenhaInvalida();

            if(this.Saldo < Valor) throw new ExecaoSaldoInsuficiente();

        System.out.println(String.format("-=== CC: %d ===- \n Saldo Pré-Saque: %.2f \n Saque: %.2f \n Saldo Pós-Saque: %.2f \n -#-#-#-#-",this.Numero,this.Saldo,Valor, (this.Saldo - Valor)));

            this.Saldo -= Valor;
    }

    public boolean checkNumero(int Numero) {
        return this.Numero == Numero;
    }

    public boolean checkSenha(String Senha){
        return this.Senha == Senha;
    }

    public boolean checkTransacao(double Valor){
        return this.Saldo < Valor;
    }
}
