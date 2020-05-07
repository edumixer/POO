public class Planilha extends Arquivo{
    public Planilha(String nome) {
        super(nome);
    }

    public void Abrir(){
        System.out.println("Abrindo " + super.getNome() + " com Excel");
    }
}
