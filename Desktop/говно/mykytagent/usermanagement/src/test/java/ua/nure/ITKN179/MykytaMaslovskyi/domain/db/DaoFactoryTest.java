package ua.nure.ITKN179.MykytaMaslovskyi.domain.db;

import junit.framework.TestCase;
import ua.nure.ITKN179.MykytaMaslovskyi.domain.db.DaoFactory;
import ua.nure.ITKN179.MykytaMaslovskyi.domain.db.UserDao;

public class DaoFactoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGetUserDao() {
		try {
			DaoFactory daoFactory = DaoFactory.getInstance();
			assertNotNull("DaoFactory instance is null", daoFactory);
			UserDao userDao = daoFactory.getUserDao();
			assertNotNull("UserDao instance is null", userDao);
		} catch (RuntimeException e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}
}