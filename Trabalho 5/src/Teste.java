public class Teste {
    public static void main(String args[]){
        Principiante Murilo = new Principiante("Murilo",100,20);
        Profissional Felipe = new Profissional("Felipe",100,500);
        Senior Joao = new Senior("João",100,500,4000);

        Murilo.Ganhar(5);
        Murilo.Perder(2);
        Murilo.Imprimir();

            Felipe.Ganhar(5);
            Felipe.Perder(2);
            Felipe.Imprimir();

                Joao.Ganhar(5);
                Joao.Perder(2);
                Joao.Imprimir();
    }
}
