package br.com.product.builder;

public class PessoaBuilder
{
    private String nome;
    private int idade;

    public PessoaBuilder nome(String nome)
    {
        this.nome = nome;
        return this;
    }
    public PessoaBuilder idade(int idade)
    {
        this.idade = idade;
        return this;
    }

    public Pessoa builder()
    {
        return new Pessoa(nome, idade);
    }
}
