public class Profissional extends Jogador{
    private double capital;

    public Profissional(String Nome,int Score, double Capital){
        super(Nome,Score);
        this.capital = Capital;
    }

    public void Ganhar(int p){
        score += p;
        capital += p * 4;
    }

    public void Perder(int p){
        score -= p;
        capital -= p * 4;
    }

    public void Imprimir(){
        super.Imprimir();
        System.out.println(capital);
    }
}
