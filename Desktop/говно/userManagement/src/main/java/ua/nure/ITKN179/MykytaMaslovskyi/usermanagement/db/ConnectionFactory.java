package main.java.ua.nure.ITKN179.MykytaMaslovskyi.usermanagement.db;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;
}
