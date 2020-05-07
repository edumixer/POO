import java.util.ArrayList;

public class Pasta {
    private String nome;
    private ArrayList<Arquivo> arquivos;

    public String getNome(){
        return nome;
    }

    public Pasta(String nome){
        this.nome = nome;
        this.arquivos = new ArrayList<Arquivo>();
    }

    public void Inserir(String nome){
        arquivos.add(new Arquivo(nome));
    }

    public void Inserir(Arquivo nome){
        arquivos.add(nome);
    }

    public void Remover(String nome){
        Arquivo x = null;
        for(Arquivo i: arquivos){
            if(i.getNome().equals(nome)) x = i;
        }

        arquivos.remove(x);
    }

    public void Listar(){
        for(Arquivo i: arquivos){
            System.out.println(i.getNome());
        }
    }

    public void Duplicar(String nome){
        int counter = 0;
        for(Arquivo i: arquivos){
            if(i.getNome().equals(nome) || i.getNome().length() >= nome.length() && i.getNome().substring(0,nome.length()).equals(nome)) counter ++;
        }
        this.Inserir(nome + String.format(" - copia(%s)", counter));
    }

    public void ImprimirNome(){
        System.out.println(this.nome);
    }
}
