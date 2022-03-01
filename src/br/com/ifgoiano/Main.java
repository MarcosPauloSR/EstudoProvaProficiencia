package br.com.ifgoiano;

import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {

        ConexaoDB con = new ConexaoDB();
        String sql = "SELECT * FROM usuarios";

        ResultSet rs = con.buscaDados(sql);

        try {
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                System.out.println("Id: " + id + " | Nome: " + nome + " | Email: " + email);
                System.out.println("==================================");
            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
