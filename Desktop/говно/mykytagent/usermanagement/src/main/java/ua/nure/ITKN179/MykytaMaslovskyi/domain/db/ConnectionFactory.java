package ua.nure.ITKN179.MykytaMaslovskyi.domain.db;

import java.sql.Connection;

public interface ConnectionFactory {

    Connection createConnection() throws DatabaseException;
}
