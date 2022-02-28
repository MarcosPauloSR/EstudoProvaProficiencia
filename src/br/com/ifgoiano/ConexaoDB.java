package br.com.ifgoiano;

import java.sql.Connection;
import java.sql.DriverManager;

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

}
