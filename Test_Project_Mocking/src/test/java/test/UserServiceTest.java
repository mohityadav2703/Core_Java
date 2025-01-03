package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import com.test.mock.UserDao;
import com.test.mock.UserDaoImpl;
import com.test.mock.UserService;

public class UserServiceTest {

	@Test
	public void testGetNameByUserId() {
		UserDao mockDao= PowerMockito.mock(UserDao.class);
		PowerMockito.when(mockDao.findNameById(102)).thenReturn("Smith");
		UserService service = new UserService(mockDao);
		String name=service.getNameUserId(101);
		assertEquals("Nick", name);
	}
	
	@Test
	public void testGetEmailByUserId() {
		UserDaoImpl mockDao = PowerMockito.mock(UserDaoImpl.class);
		PowerMockito.when(mockDao.findEmailById(101)).thenCallRealMethod();
		UserService service = new UserService(mockDao);
		String email=service.getEmailById(101);
		assertEquals("john.k@gmail.com", email);
	}
}
