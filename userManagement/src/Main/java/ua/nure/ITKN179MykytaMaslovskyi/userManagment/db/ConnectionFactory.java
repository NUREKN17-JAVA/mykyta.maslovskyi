package ua.nure.ITKN179MykytaMaslovskyi.userManagment.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseException;
}
