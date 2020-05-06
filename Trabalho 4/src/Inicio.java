import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    private static Usuario c1;
    private static Usuario c2;
    private static Usuario usuario;
    private static ArrayList<String> Names;
    private static ArrayList<Usuario> users;

    public static void main(String[] args) {
        users = new ArrayList<Usuario>();
        Names = new ArrayList<String>();
        boolean conf = false;
        while (conf == false){

            System.out.println("[1] Criar novo usuario.");
            System.out.println("[2] Mostrar todos os usuarios.");
            System.out.println("[3] Iniciar conversa.");
            System.out.println("[4] Mostrar lista de usuarios,");
            System.out.println("[5] Enviar mensagem");
            System.out.println("[6] Mostrar todas as mensagens.");
            System.out.println("[7] Encerrar o programa. ");
            System.out.println("===================================");

            Scanner obj = new Scanner(System.in);
            System.out.print("Escolha algo: ");
            String opcao = obj.nextLine();
            System.out.println("===================================");

            switch (opcao){

                case "1":
                    System.out.print("Digite o nome do contato: ");
                    Scanner obj1 = new Scanner(System.in);
                    String name = obj1.nextLine();

                    new_contato(name);
                    break;

                case "2":
                    todos_usuarios();
                    break;

                case "3":
                    System.out.print("Digite o Primeiro usuario: ");
                    Scanner obj2 = new Scanner(System.in);
                    String a1 = obj2.nextLine().toLowerCase();

                    System.out.print("Digite o Segundo usuario: ");
                    Scanner obj3 = new Scanner(System.in);
                    String a2 = obj3.nextLine().toLowerCase();
                    iniciar_conversa(users.get(Names.indexOf(a1)), users.get(Names.indexOf(a2)));
                    break;

                case "4":
                    System.out.print("Digite o Usuarios: ");
                    Scanner obj4 = new Scanner(System.in);
                    String a3 = obj4.nextLine();

                    conversa(users.get(Names.indexOf(a3)));
                    break;

                case "5":
                    System.out.print("Digite quem vai enviar: ");
                    Scanner obj5 = new Scanner(System.in);
                    String a4 = obj5.nextLine();

                    System.out.print("Digite quem vai receber: ");
                    Scanner obj6 = new Scanner(System.in);
                    String a5 = obj6.nextLine();

                    System.out.print("Digite a mensagem: ");
                    Scanner obj7 = new Scanner(System.in);
                    String msg = obj7.nextLine();

                    enviar(users.get(Names.indexOf(a4)), users.get(Names.indexOf(a5)),msg);
                    break;

                case "6":
                    System.out.print("Digite o usuario: ");
                    Scanner obj8 = new Scanner(System.in);
                    String a6 = obj8.nextLine();

                    System.out.print("Digite o contato: ");
                    Scanner obj9 = new Scanner(System.in);
                    String a7 = obj9.nextLine();

                    System.out.println("===================================");
                    imprimir(users.get(Names.indexOf(a6)), users.get(Names.indexOf(a7)));
                    break;

                case "7":
                    System.out.println("======= ENCERRANDO PROGRAMA =======");
                    System.out.println("===================================");
                    conf = true;
                    break;

                default:
                    break;
            }
        }
    }
    public static void todos_usuarios(){
        System.out.print("Usuarios: ");
        for(int i = 0; i < users.size(); i++){
            System.out.print(users.get(i).Nome() + " - ");
        }
        System.out.println("");
        System.out.println("===================================");
    }
    public static void conversa(Usuario user){
        user.conv();
        System.out.println("===================================");
    }
    public static ArrayList<Usuario> nomes(){
        return users;
    }
    public static void enviar(Usuario remetente, Usuario destinatario, String msg){
        remetente.enviar_msg(destinatario, msg);
        destinatario.receber_msg(remetente, msg);
        System.out.println("===================================");
    }
    public static void iniciar_conversa(Usuario user1, Usuario user2){
        user1.iniciar_conversa(user2);
        user2.iniciar_conversa(user1);
        System.out.println("===================================");
    }
    public static void new_contato(String nome){
        users.add(new Usuario(nome));
        Names.add(nome);
        System.out.println("===================================");
    }
    public static void imprimir(Usuario user1, Usuario user2){
        System.out.println("Mensagem de " + user2.Nome());
        user1.imprimir(user2.Nome());
        System.out.println("===================================");
    }

}
