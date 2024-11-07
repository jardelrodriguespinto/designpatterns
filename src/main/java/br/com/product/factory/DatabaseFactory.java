package br.com.product.factory;

import br.com.product.enums.Database;

public class DatabaseFactory
{
    public static DBConnector createInstance(Database database)
    {
        if (database == Database.MONGO_DB)
            return new MongoDBConnector();
        else if (database == Database.MYSQL)
            return new MySQLConnector();

        return new PostgreSQLConnector();
    }
}
