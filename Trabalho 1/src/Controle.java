public class Controle {
    public static void main(String[] args) {
        //Semaforo semaforo = new Semaforo();
        System.out.print("Cor Inicial: ");
        System.out.println(Semaforo.mostraCor());
        for (int i = 0; i < 10; i++){
            Semaforo.mudaProximaCor();
            System.out.print("Cor mudou para: ");
            System.out.println(Semaforo.mostraCor());
        }
        Semaforo.mudaCorFixa(1);
        System.out.print("Cor mudou para amarelo: ");
        System.out.println(Semaforo.mostraCor());
    }
}
