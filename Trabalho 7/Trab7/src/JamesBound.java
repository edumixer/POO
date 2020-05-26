public class JamesBound extends Heroi {

    @Override
    public void atirar() {
        super.atirar();
        System.out.println("JamesBound esta atirando");
    }

    @Override
    public void saltar(float z) {
        super.saltar(z);
        System.out.println("JamesBound esta saltando");
    }

}
