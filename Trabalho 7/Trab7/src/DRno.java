public class DRno extends Terrorista{


    @Override
    public void saltar(float z) {
        super.saltar(z);
        System.out.println("DRno esta saltado");
    }

    @Override
    public void atirar() {
        super.atirar();
        System.out.println("DRno esta atindo");
    }

    @Override
    public void correr(float x,float y) {
        super.correr(x,y);
        System.out.println("DRno esta correndo");
    }


}
