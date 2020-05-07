public class Apresentacao extends Arquivo{
    public Apresentacao(String nome) {
        super(nome);
    }

    public void Abrir(){
        System.out.println("Abrindo " + super.getNome() + " com PowerPoint");
    }
}
