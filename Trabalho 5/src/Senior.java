public class Senior extends Profissional{
    private double premio;

    public Senior(String Nome, int Score, double Capital, double Premio){
        super(Nome,Score,Capital);
        this.premio = Premio;
    }

    public void Ganhar(int p){
        this.premio *= 2;
        super.Ganhar(p);
    }

    public void Perder(int p){
        this.premio /= 2;
        super.Perder(p);
    }

    public void Imprimir(){
        super.Imprimir();
        System.out.println(this.premio);
    }
}
