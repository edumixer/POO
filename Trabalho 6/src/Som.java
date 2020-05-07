public class Som extends Arquivo{
    public Som(String nome) {
        super(nome);
    }

    public void Abrir(){
        System.out.println("Abrindo " + super.getNome() + " com Windows Media Player");
    }
}
