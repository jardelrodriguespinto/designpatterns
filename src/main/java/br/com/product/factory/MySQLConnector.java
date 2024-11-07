package br.com.product.factory;

import br.com.product.enums.Database;

public class MySQLConnector implements DBConnector
{
    @Override
    public void connect() {
        System.out.println("Connectando ao " + Database.MYSQL.getDescricao());
    }

    @Override
    public void query() {
        System.out.println("Realizando query no " + Database.MYSQL.getDescricao());
    }

    @Override
    public void disconnect() {
        System.out.println("Desconnectando ao " + Database.MYSQL.getDescricao());
    }
}