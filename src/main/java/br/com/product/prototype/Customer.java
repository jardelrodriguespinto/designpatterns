package br.com.product.prototype;

public class Customer implements Prototype
{
    private String nome;
    private String sobrenome;
    private int idade;

    public Customer(Customer customer)
    {
        this.nome = customer.getNome();
        this.sobrenome = customer.getSobrenome();
        this.idade = customer.getIdade();
    }

    public Customer(){}

    @Override
    public Customer clone()
    {
        return new Customer(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
