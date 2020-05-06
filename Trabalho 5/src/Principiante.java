public class Principiante extends Jogador{
    private double bonus;

    public Principiante(String Nome, int Score, double bonus){
        super(Nome,Score);
        this.bonus = bonus;
    }

    public void Ganhar(int p){
        this.score += p;
        this.bonus += 10/100 * p;
    }

    public void Perder(int p){
        Ganhar(p * -1);
    }

    public void Imprimir(){
        super.Imprimir();
        System.out.println(this.bonus);
    }
}
