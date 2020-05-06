public class Jogador {
    private String nome;
    protected int score;

    public Jogador(String Nome, int Score){
        this.nome = Nome;
        this.score =  Score;
    }

    public void Imprimir(){
        System.out.println(nome);
        System.out.println(score);
    }
}
