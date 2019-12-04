package main.java.ua.nure.ITKN179.MykytaMaslovskyi.usermanagement.db;

import java.util.Collection;
public interface UserDao {


    public interface Dao<T> {
        <DatabaseException extends Throwable> T create(T entity) throws DatabaseException;

        void update(T entity) throws DatabaseException;

        void delete(T entity) throws DatabaseException;

        T find(long id) throws DatabaseException;

        Collection<T> findAll() throws DatabaseException;

        void setConnectionFactory(ConnectionFactory connectionFactory);
    }
}