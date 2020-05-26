public class Batman extends Heroi implements Camuflagem{

    @Override
    public void atirar() {
        super.atirar();
        System.out.println("Batman esta atindo");
    }


    @Override
    public void camuflar(int cor) {
        this.cor = cor;
        System.out.println("Batman esta camuflado");
    }
}
