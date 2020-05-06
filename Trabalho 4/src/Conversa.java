import java.util.ArrayList;

public class Conversa {

    private String nome;
    private ArrayList<ArrayList<Mensagem>> contatos;
    private ArrayList<Mensagem> msg;
    private ArrayList<String> nomes;
    private Mensagem mensagem;

    public Conversa (Usuario nome_contato){
        nome = nome_contato.Nome();
        msg = new ArrayList<Mensagem>();
        nomes = new ArrayList<String>();
        contatos = new ArrayList<ArrayList<Mensagem>>();
    }
    public void cont(){
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
    public void enviar(Usuario contato, String msg){
        if(contatos.contains(contato.Nome()) == true){
            contatos.get(nomes.indexOf(contato.Nome())).add(new Mensagem("Para " + contato.Nome() + ": " + msg + " - Enviada."));
        }
        else{
            this.msg.add(new Mensagem("Para " + contato.Nome() + ": " + msg + " - Enviada."));
            contatos.add(this.msg);
            nomes.add(contato.Nome());
        }
    }
    public void receber(Usuario contato, String msg){
        if(contatos.contains(contato.Nome()) == true){
            contatos.get(nomes.indexOf(contato.Nome())).add(new Mensagem("De " + contato.Nome() + ": " + msg + " - Recebida."));
        }
        else{
            this.msg.add(new Mensagem("De " + contato.Nome() + ": " + msg + " - Recebida."));
            contatos.add(this.msg);
            nomes.add(contato.Nome());
        }

    }
    public void imprimir(String contato){
        for (int i = 0; i < contatos.get(nomes.indexOf(contato)).size(); i++){
            contatos.get(nomes.indexOf(contato)).get(i).textos();
        }
    }
}
