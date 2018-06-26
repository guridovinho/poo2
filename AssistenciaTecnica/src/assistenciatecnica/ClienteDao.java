
package assistenciatecnica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ClienteDao {
     public static void save(Cliente cliente) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ( ?, ?)";

        try (Connection con = ConexaoAssistencia.getConnection();
             PreparedStatement ps = ConexaoAssistencia.prepareStatement(sql)) {
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
        }
    }
     
     
     
     
     
}
