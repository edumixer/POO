import java.time.LocalTime;

public class Teste {
    public static void main(String[] args) {
        try {
            Banco Santander = new Banco("Santander");

            Santander.criar_conta(4060, "brigadeiro", 600);
            Santander.criar_conta(1260, "chule", 999);
            Santander.criar_conta(1714, "cobertor", 750);
            Santander.criar_conta(1993, "caxumba", 677);
            Santander.criar_conta(7580, "goiaba", 891);


            Santander.sacar(4060, 250, "brigadeiro");

            Santander.sacar(4060,300,"brigadeiro");

            //Santander.sacar(4060,50,"teste"); //Senha Errada

            Santander.sacar(4060,50,"brigadeiro");

            //Santander.sacar(4060,1,"brigadeiro"); //Saldo Insuficiente

            //Santander.sacar(1234,12,"xesque"); // Conta Invalida

            Santander.sacar(7580,91,"goiaba");

            Santander.sacar(1714,150,"cobertor");

            Santander.sacar(1260,99,"chule");

            Santander.sacar(1993,77,"caxumba");

            //System.out.println(LocalTime.parse("07:59:59").isBefore(LocalTime.parse("08:00:00")));
            //System.out.println(LocalTime.parse("21:00:01").isAfter(LocalTime.parse("21:00:00")));
        }

        catch(ExecaoContaInvalida e) {
            System.out.println("Conta Invalida");
        }

        catch(ExecaoHorarioInvalido e){
            System.out.println("Trabalhamos entre 08:00:00 e as 21:00:00");
        }

        catch(ExecaoSaldoInsuficiente e){
            System.out.println("Saldo insuficiente");
        }

        catch(ExecaoSenhaInvalida e){
            System.out.println("Senha Invalida");
        }

        finally {
            System.out.println("\n -[Fim da Execução]-");
        }

    }
}
