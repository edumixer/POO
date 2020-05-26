public class Pinguin extends Ladrao {


    @Override
    public void atirar() {
        super.atirar();
        System.out.println("Pinguin esta atirando");
    }

    @Override
    public void correr(float x,float y) {
        super.correr(x,y);
        System.out.println("Pinguin esta correndo");
    }
}
