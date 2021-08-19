package br.com.loja.dal;
import java.sql.*;
public class ConnectionString {
    public static Connection conector(){
        java.sql.Connection conexao = null;

        String driver = "com.mysql.jdbc.Driver";
        String connectionString = "jdbc:mysql://localhost:3306/bdlojaetec";
        String usuario = "root";
        String senha = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(connectionString, usuario, senha);
            return conexao;
        }catch (Exception e){
            return null;
        }
    }
}
