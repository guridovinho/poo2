package assistenciatecnica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoAssistencia {
    
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/assistencia";
        String USER = "root";
        String PASS = "";
        try {
           Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
           System.out.println("Conectado com sucesso!");

                
        } catch (SQLException ex) {
           System.out.println("Erro de conexão!");

        }
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

