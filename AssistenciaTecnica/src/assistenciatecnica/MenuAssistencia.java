
package assistenciatecnica;

import java.util.Scanner;


public class MenuAssistencia {
    private static Scanner teclado = new Scanner(System.in);
    
     public static void main(String[] args) {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if (op == 0) {
                System.out.println("Saindo do sistema");
                break;
            }
            if(op == 1){
                menuCliente();
                op = Integer.parseInt(teclado.nextLine());
                ClienteAssistencia.executar(op);
            }
            if(op == 2){
                menuProduto();
                op = Integer.parseInt(teclado.nextLine());
                ProdutoAssistencia.executar(op);
            }
        }
    }
    
    
     private static void menu(){
        System.out.println("Selecione uma opção:");
        System.out.println("1. Cliente");
        System.out.println("2. Produto");
        System.out.println("0. Sair");
    }

    private static void menuCliente() {
        System.out.println("Digite a opção para começar");
        System.out.println("1. Inserir Cliente");
        System.out.println("2. Atualizar Cliente");
        System.out.println("3. Listar todos os Clientes");
        System.out.println("4. Cliente por nome");
        System.out.println("5. Deletar");
        System.out.println("9. Voltar");
    }
    private static void menuProduto() {
        System.out.println("Digite a opção para começar");
        System.out.println("1. Inserir produto");
        System.out.println("2. Atualizar produto");
        System.out.println("3. Listar todos os produtos");
        System.out.println("4. Buscar produto por nome");
        System.out.println("5. Deletar");
        System.out.println("9. Voltar");
    }
    
    
    
}
