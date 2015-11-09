/**
 * JUnit test class for the User interface.
 * @author ocouls01
 */
import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {
	private User user1;
	private Library mockLib;
	
	@Before
	public void SetUp() {
		user1 = new UserImpl("Davy Jones");
		mockLib = new LibraryImpl("Test Library");
	}
	
	@Test
	public void testGetNameDoesntReturnNull() {
		String output = user1.getName();
		
		assertFalse(output == null);
	}
	
	@Test
	public void testCreate() {
		assertNotNull(user1);
		assertEquals("Davy Jones", user1.getName());
		assertEquals(-1, user1.getLibId());
	}
	
	@Test
	public void testGetName() {
		String output = user1.getName();
		
		assertEquals("Davy Jones", output);
	}
	
	@Test
	public void testGetLibId() {
		int output = user1.getLibId();
		
		assertEquals(-1, output);
	}
	
	@Test
	public void testRegisterMethod() {
		int output = user1.register(mockLib);
		assertEquals(1000, output);
		assertEquals(1000, user1.getLibId());
	
	}
	
	@Test
	public void testGetLibraryMethodForUnregisteredUser() {
		assertNull(user1.getLibrary());
			
	}
	
	@Test
	public void testGetLibraryMethodForRegisteredUser() {
		user1.register(mockLib);
		assertEquals(user1.getLibrary(), mockLib);
	}
}