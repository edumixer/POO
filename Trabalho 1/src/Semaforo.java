public class Semaforo {
    private static int cor = 2;
    public static void mudaProximaCor() {
        if (cor == 2){
            cor = 0;
        }
        else cor++;
    }
    public static void mudaCorFixa(int x){
        cor = x;
    }
    public static int mostraCor(){
        return cor;
    }
}
