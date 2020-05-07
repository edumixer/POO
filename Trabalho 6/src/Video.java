public class Video extends Arquivo{
    public Video(String nome) {
        super(nome);
    }

    public void Abrir(){
        System.out.println("Abrindo " + super.getNome() + " com YouTube");
    }
}
