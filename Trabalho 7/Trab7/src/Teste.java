public class Teste {
    public static void main(String[] args) {
            Batman b = new Batman();
            b.atirar();
            b.camuflar(2);
            b.morrer();
            System.out.println("------------------------------------");
            JamesBound j = new JamesBound();
            j.atirar();
            j.saltar(200);
            System.out.println("------------------------------------");
            Coringa c = new Coringa();
            c.atirar();
            System.out.println("------------------------------------");
            Pinguin p = new Pinguin();
            p.atirar();
            p.correr(200,300);
            System.out.println("------------------------------------");
            Goldfinger g = new Goldfinger();
            g.camuflar(2);
            g.saltar(300);
            g.personificar(b);
            System.out.println("------------------------------------");
            DRno d = new DRno();
            d.atirar();
            d.correr(200,300);
            d.saltar(600);


    }
}
