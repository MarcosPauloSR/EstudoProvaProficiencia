package br.com.ifgoiano.reflection;

public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;
    private int idade;

    public Pessoa(String nome, String cpf, String rg, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }
}
