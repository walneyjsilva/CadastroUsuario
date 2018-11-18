package backup_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author walney
 */
public class Conexao {

    static Connection con=null;

 public static Connection conectar(){
    try {

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojava","root","walney");
    }
    catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return con;
    }

}
