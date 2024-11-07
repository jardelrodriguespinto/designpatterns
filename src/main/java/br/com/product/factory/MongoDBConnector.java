package br.com.product.factory;

import br.com.product.enums.Database;

public class MongoDBConnector implements DBConnector
{
    @Override
    public void connect() {
        System.out.println("Connectando ao " + Database.MONGO_DB.getDescricao());
    }

    @Override
    public void query() {
        System.out.println("Realizando query no " + Database.MONGO_DB.getDescricao());
    }

    @Override
    public void disconnect() {
        System.out.println("Desconnectando ao " + Database.MONGO_DB.getDescricao());
    }
}