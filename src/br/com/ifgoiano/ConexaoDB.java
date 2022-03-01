package br.com.ifgoiano;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB {

    private String url;
    private String user;
    private String senha;
    private Connection conector;

    ConexaoDB(){
        url = "jdbc:postgresql://localhost:5432/banco_teste";
        user = "postgres";
        senha = "postgresql";

        try {
            Class.forName("org.postgresql.Driver");
            conector = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão bem sucedida!");

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //Método para fazer INSERT, UPDATE OU DELETE
    public int executaSql(String sql){
        try{
            Statement stm = conector.createStatement();
            int res = stm.executeUpdate(sql);
            conector.close();
            return res;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
    //Método para fazer select no banco
    public ResultSet buscaDados(String sql){
        try {
            Statement stm = conector.createStatement();
            ResultSet res = stm.executeQuery(sql);
            conector.close();
            return res;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
