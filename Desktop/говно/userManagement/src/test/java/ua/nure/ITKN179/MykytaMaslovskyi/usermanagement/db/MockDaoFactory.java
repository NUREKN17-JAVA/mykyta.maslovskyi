package test.java.ua.nure.ITKN179.MykytaMaslovskyi.usermanagement.db;

import main.java.ua.nure.ITKN179.MykytaMaslovskyi.usermanagement.db.DaoFactory;
import main.java.ua.nure.ITKN179.MykytaMaslovskyi.usermanagement.db.UserDao;
import com.mockobjects.dynamic.Mock;
public class MockDaoFactory extends DaoFactory {

    private Mock mockUserDao;

    public MockDaoFactory() {
        mockUserDao = new Mock(UserDao.class);
    }

    @Override
    public UserDao getUserDao() {
        return (UserDao) mockUserDao.proxy();
    }

    public Mock getMockUserDao() {
        return mockUserDao;
    }
}
