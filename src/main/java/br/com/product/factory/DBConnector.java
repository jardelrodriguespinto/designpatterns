package br.com.product.factory;

public interface DBConnector
{
    void connect();
    void query();
    void disconnect();
}
