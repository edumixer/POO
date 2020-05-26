abstract class Personagem {
    private boolean vivo = true;
    protected float posicao_x;
    protected float posicao_y;
    protected float posicao_z;
    protected int cor;


    public void correr(float x,float y ){
        this.posicao_x = x;
        this.posicao_y = y;
    }
    public void saltar(float z){
            this.posicao_z = z;
    }
    public void atirar(){}

    public void morrer(){
        this.vivo = false;
        System.out.println("Morto");
    }

}
