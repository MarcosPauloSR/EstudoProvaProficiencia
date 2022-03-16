package br.com.ifgoiano;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private int id;
    private String nome;
    /*transient serve para não gravar o valor*/
    private transient int idade;

    Pessoa(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format ( "%d\t%s\t%d", this.id, this.nome, this.idade );
    }
}
