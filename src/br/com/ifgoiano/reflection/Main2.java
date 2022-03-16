package br.com.ifgoiano.reflection;

public class Main2 {

    public static void main(String[] args) {

        RefletirPessoa refletirPessoa = new RefletirPessoa ();
        System.out.println ( "Lista de todos os métodos da classe:" );
        refletirPessoa.listaNomesMetodos ();
        System.out.println ( "Lista de atributos:" );
        refletirPessoa.atributos ();
        System.out.println ( "Invoca os métodos:" );
        refletirPessoa.invocaMetodos ();

    }

}
