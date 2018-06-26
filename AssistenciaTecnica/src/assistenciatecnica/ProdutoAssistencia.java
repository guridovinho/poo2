
 
package assistenciatecnica;

import java.util.Scanner;


class ProdutoAssistencia {
    private static Scanner teclado = new Scanner(System.in);
    
    
    public static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite o nome");
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;
        }
    }
    
    private static void inserir() {
        Cliente c = new Cliente();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Placa: ");
        c.setMarca(teclado.nextLine());
        System.out.println("Selecione um dos compradores abaixo");
        List<Cliente> clienteList = ClienteAssistencia.listar();
        c.setCliente(clienteList.get(Integer.parseInt(teclado.nextLine())));
        dao.save(c);
    
    
}
