package br.com.ifgoiano.reflection;

import java.lang.reflect.*;
public class RefletirPessoa {

    public void listaNomesMetodos(){
        try {
            Class cl = Class.forName ( "br.com.ifgoiano.reflection.Pessoa" );
            Method[] metodos = cl.getDeclaredMethods ();

            for (Method met: metodos) {
                System.out.println ( met.toString () );
            }
        }catch (Throwable e){
            e.printStackTrace ();
        }
    }

    public void atributos(){
        try {
            Class cl = Class.forName ( "br.com.ifgoiano.reflection.Pessoa" );
            Method[] methods = cl.getDeclaredMethods ();

            for (Method met: methods) {
                System.out.println ( " " + met.getName () + " " );
                System.out.println ( met.getReturnType () );
                System.out.println ( met.getModifiers () );
                System.out.println ( met.getParameters () );
            }
        }catch (Throwable e){
            e.printStackTrace ();
        }
    }

    public void invocaMetodos(){
        Pessoa p = new Pessoa("Marcos", "1165565", "16532", 20);

        try {
            Class cl = Class.forName( "br.com.ifgoiano.reflection.Pessoa" );
            Field[] campos = cl.getDeclaredFields ();

            Method[] methods = cl.getDeclaredMethods ();

            for(int i = 0; i < methods.length; i++){
                System.out.println ( campos[i].getName () + methods[i].invoke ( p ) );
            }

        }catch (Throwable e){
            e.printStackTrace ();
        }
    }

}
