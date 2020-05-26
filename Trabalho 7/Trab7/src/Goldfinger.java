public class Goldfinger extends Terrorista implements Personificacao{

    Heroi heroi;

    @Override
    public void saltar(float z) {
        super.saltar(z);
        System.out.println("Goldfinger esta saltando");
    }


    @Override
    public void personificar(Heroi h) {
        this.heroi = h;
        System.out.println("Goldfinger esta personificando");

    }

    @Override
    public void camuflar(int cor) {
        this.cor = cor;
        System.out.println("Goldfinger camuflado");
    }
}
