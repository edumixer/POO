public class Arquivo {
    private String nome;
    private byte[] bytes;

    public String getNome() {
        return this.nome;
    }

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public void Abrir() {
        System.out.println("Abrindo " + this.nome);
    }

    public Arquivo Copiar() {
        return new Arquivo(this.nome);
    }

    public void Imprimir(){
        System.out.println(this.nome);
    }
}
