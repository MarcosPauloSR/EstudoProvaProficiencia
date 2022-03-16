package br.com.ifgoiano;

import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        /*ConexaoDB con = new ConexaoDB();
        String sql = "SELECT id, nome, email FROM usuarios";

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
        }*/

        String caminho = "arquivo.txt";
        Pessoa p1 = new Pessoa ( 1, "Marcos", 20 );

        boolean isGravou = FileUtil.gravarObjeto ( p1, caminho );

        Object obj = FileUtil.recuperarObjeto ( caminho );

        System.out.println ( obj );


    }
}
