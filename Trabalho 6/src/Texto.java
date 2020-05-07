public class Texto extends Arquivo{
    public Texto(String nome) {
        super(nome);
    }

    public void Abrir(){
        System.out.println("Abrindo " + super.getNome() + " com Notepad");
    }
}
