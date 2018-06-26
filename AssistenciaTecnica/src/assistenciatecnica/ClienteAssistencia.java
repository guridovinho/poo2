
package assistenciatecnica;


import java.util.List;
import java.util.Scanner;


public class ClienteAssistencia {
    
    private static final Scanner teclado = new Scanner(System.in);

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
        System.out.println("Cpf: ");
        c.setCpf(teclado.nextLine());
        ClienteDao.save(c);
    
   }

    private static void atualizar() {
        System.out.println("Selecione um dos clientes abaixo");
        List<Cliente> clienteList = listar();
        Cliente c = clienteList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para manter o mesmo");
        String nome = teclado.nextLine();
        System.out.println("Novo cpf ou enter para manter o mesmo");
        String cpf = teclado.nextLine();
        if (!nome.isEmpty()) {
            c.setNome(nome);
        }
        if (!cpf.isEmpty()) {
            c.setCpf(cpf);
        }
        ClienteDao.update(c);
    }

    public static List<Cliente> listar() {
        List<Cliente> clienteList = clienteDao.selectAll();
        for (int i = 0; i < clienteList.size(); i++) {
            Cliente c = clienteList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + " " + c.getCpf());
        }
        return clienteList;
    }

    private static void buscarPorNome(String nome) {
        List<Cliente> clienteList = ClienteDao.searchByName(nome);
        for (int i = 0; i < clienteList.size(); i++) {
            Cliente c = clienteList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + " " + c.getCpf());
        }
    }

    public static void deletar() {
        System.out.println("Selecione um dos clientes abaixo para deletar");
        List<Cliente> clienteList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? S/N");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            ClienteDao.delete(clienteList.get(index));
        }
    }
}
    
    

    