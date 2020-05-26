public class ExecaoSaldoInsuficiente extends Exception{

    public ExecaoSaldoInsuficiente(String mensagem){
        super(mensagem);
    }

    public ExecaoSaldoInsuficiente(){
        super();
    }
}
