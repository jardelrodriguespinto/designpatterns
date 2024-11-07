package br.com.product.enums;

public enum Database
{
    MYSQL("MySQL"),
    MONGO_DB("MongoDB"),
    POSTGRESQL("PostgreSQL");

    private String descricao;

    Database(String descricao)
    {
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

}
