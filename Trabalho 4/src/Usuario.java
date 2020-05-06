public class Usuario {
    private String nome;
    private Conversa usuario1;
    private Conversa usuario2;

    public Usuario(String nome){
        this.nome = nome;
    }
    public String Nome(){
        return nome;
    }
    public void conv(){
        usuario1.cont();
    }
    public void iniciar_conversa(Usuario nome_contato){
        for(int i = 0; i < Inicio.nomes().size(); i++) {
            if(Inicio.nomes().get(i).Nome() == nome){
                usuario1 = new Conversa(Inicio.nomes().get(i));
            }
        }
        usuario2 = new Conversa(nome_contato);
    }
    public void enviar_msg(Usuario nome_dest, String msg){
        usuario1.enviar(nome_dest,msg);
    }
    public void receber_msg(Usuario nome_reme, String msg){
        usuario1.receber(nome_reme,msg);
    }
    public void imprimir(String contato){
        usuario1.imprimir(contato);
    }
}
