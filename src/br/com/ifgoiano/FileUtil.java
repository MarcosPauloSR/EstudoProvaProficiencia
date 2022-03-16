package br.com.ifgoiano;

import java.io.*;

public class FileUtil {


    public static boolean gravarObjeto(Object obj, String caminho) {
        File arquivo = new File ( caminho );
        try {
            if (!arquivo.exists ( )) {
                arquivo.createNewFile ( );
            }
        } catch (Exception e) {
            e.printStackTrace ( );
            return false;
        }

        //Escrita de arquivos
        try {
            FileOutputStream fileOutput = new FileOutputStream ( arquivo );
            ObjectOutputStream objOutput = new ObjectOutputStream ( fileOutput );
            //Grava os dados na memória
            objOutput.writeObject ( obj );

            //Confirma a operação de escrita
            objOutput.flush ( );
            fileOutput.flush ( );

            //Fecha os canais de comunicação
            objOutput.close ( );
            fileOutput.close ( );

            return true;
        } catch (Exception e) {
            e.printStackTrace ( );
            return false;
        }
    }

    public static Object recuperarObjeto(String caminho) {
        File arquivo = new File ( caminho );

        try{
            FileInputStream fileInput = new FileInputStream ( arquivo );
            ObjectInputStream objInput = new ObjectInputStream ( fileInput );

            Object retorno = objInput.readObject ();

            objInput.close ();
            fileInput.close ();

            return retorno;
        }catch (Exception e){
            e.printStackTrace ();
            return null;
        }
    }

}
