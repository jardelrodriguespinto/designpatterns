package br.com.product;

import br.com.product.prototype.Customer;

public class Main
{
    public static void main(String[] args)
    {
        Customer customer = new Customer();
        customer.setNome("Jardel");
        customer.setSobrenome("Rodrigues");
        customer.setIdade(26);

        Customer customerClone = customer.clone();

        System.out.println(customerClone);
    }
}