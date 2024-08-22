import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<String> notas = new ArrayList<>();
    static ArrayList<String> titulo = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        menu();
    }

    private static void menu() {
        System.out.println("----------BEM VINDO AO MENU----------");
        System.out.println("Selecione qual ação deseja fazer: \n1.Salvar nota \n2.Remover nota \n3.Listar nota \n4.Sair");
        int n = entrada.nextInt();

        switch (n) {
            case 1:
                salvar();
                break;
            case 2:
                remover();
                break;
            case 3:
                listar();
                break;
            case 4:
                break;
        }

    }

    private static void remover() {
        
        System.out.println(" ");
        System.out.println("----------REMOVER NOTAS----------");
        System.out.println("Informe o número da nota para remover:");
        titulo.remove(entrada.nextInt());
        System.out.println("Informe o mesmo número novamente:");
        notas.remove(entrada.nextInt());

        System.out.println(" ");
        System.out.println("Ação concluida! \nDigite: \n1.Para retornar ao menu \n2.Para sair");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                menu();
                break;
            case 2:
                break;
        }
        
    }

    private static void listar() {
        
        System.out.println(" ");
        System.out.println("----------LISTA DE NOTAS----------");

        for(int c = 0; c < titulo.size(); c++){
            System.out.println(c + ". " + titulo.get(c));
            System.out.println(notas.get(c));
            System.out.println(" ");
            System.out.println("--------------------");
        }

        System.out.println(" ");
        System.out.println("Ação concluida! \nDigite: \n1.Para retornar ao menu \n2.Para sair");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                menu();
                break;
            case 2:
                break;
        }

    }

    private static void salvar() {

        System.out.println(" ");
        System.out.println("----------SALVAR NOTAS----------");
        System.out.println("Digite: \n1.Para iniciar \n2.Para cancelar");
        int n = entrada.nextInt();
        while (n == 1) {
            System.out.println("--------------------");
            System.out.println("Informe um título para a nota: *Em maiúsculo*");
            entrada.nextLine();
            titulo.add(entrada.nextLine());
            System.out.println("Digite a nota: ");
            notas.add(entrada.nextLine());

            System.out.println("--------------------");
            System.out.println("Digite: \n1.Para continuar \n2.Para finalizar");
            n = entrada.nextInt();
        }

        System.out.println(" ");
        System.out.println("Ação concluida! \nDigite: \n1.Para retornar ao menu \n2.Para sair");
        n = entrada.nextInt();
        switch (n) {
            case 1:
                menu();
                break;
            case 2:
                break;
        }

    }
}
