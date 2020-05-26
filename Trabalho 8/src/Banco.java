import java.util.ArrayList;
import java.time.LocalTime;

public class Banco {

    private String Nome;
    private ArrayList<ContaCorrente> contas = new ArrayList();

    public Banco(String Nome){
        this.Nome = Nome;
    }

    public void criar_conta(int Numero, String Senha, double Saldo){

        contas.add(new ContaCorrente(Numero, Senha, Saldo));
    }

    public void sacar(int Numero, double Valor, String Senha) throws ExecaoContaInvalida, ExecaoSenhaInvalida, ExecaoHorarioInvalido, ExecaoSaldoInsuficiente{
        int checker = -1;
        for(ContaCorrente i: contas){
            if(i.checkNumero(Numero)){
                checker = contas.indexOf(i);
            }
        }

        if(checker == -1) throw new ExecaoContaInvalida();

        if(!contas.get(checker).checkSenha(Senha)) throw new ExecaoSenhaInvalida();

        if(LocalTime.now().isBefore(LocalTime.parse("08:00:00")) || LocalTime.now().isAfter(LocalTime.parse("22:00:00"))) throw new ExecaoHorarioInvalido();

        if(contas.get(checker).checkTransacao(Valor));

        contas.get(checker).retirar(Valor,Senha);
    }
}
