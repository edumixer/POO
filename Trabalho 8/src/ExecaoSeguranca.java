public class ExecaoSeguranca extends Exception{
    public ExecaoSeguranca(String mensagem){
        super(mensagem);
    }

    public ExecaoSeguranca(){
        super();
    }
}
