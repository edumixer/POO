import java.lang.annotation.Documented;

public class Sistema {

    public static void main(String[] args) {
        Disco d = new Disco('C');

        Pasta escola = d.Criar_Pasta("Escola");
        Pasta pessoal = d.Criar_Pasta("Pessoal");

        d.Listar_Pastas(); // lista as pastas Escola e Pessoal
        Texto t = new Texto("Trabalho 10");
        escola.Inserir(t);
        Apresentacao a = new Apresentacao("Defesa Projeto 2");
        escola.Inserir(a);
        Planilha p = new Planilha("Calculo 2");
        escola.Inserir(p);
        escola.Listar();
        Video v = new Video("Aniversario");
        pessoal.Inserir(v);
        Imagem i = new Imagem("Foto RJ");
        pessoal.Inserir(i);
        Som s = new Som("Musica Chico");
        pessoal.Inserir(s);
        pessoal.Listar();
        t.Abrir();
        a.Abrir();
        p.Abrir();
        v.Abrir();
        i.Abrir();
        s.Abrir();
        escola.Remover("Trabalho 10");
        escola.Duplicar("Defesa Projeto 2");
        escola.Duplicar("Defesa Projeto 2"); //Olha o Nome do Arquivo Copiado!
        escola.Listar();
        d.Remover_Pasta("Pessoal");
        d.Listar_Pastas();
    }
}
