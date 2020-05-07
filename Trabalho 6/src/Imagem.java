public class Imagem extends Arquivo{
    public Imagem(String nome) {
        super(nome);
    }

    public void Abrir(){
        System.out.println("Abrindo " + super.getNome() + " com Paint");
    }
}
