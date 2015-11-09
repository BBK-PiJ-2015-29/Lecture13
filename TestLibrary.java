/**
 * JUnit test class for the Library class
 * @author ocouls01
 */
import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary {
	private Library myLib;
	private User user1;
	
	@Before
	public void SetUp() {
		myLib = new LibraryImpl("Ollieton Library");
		user1 = new UserImpl("Santi Cazorla");
	}
	
	@Test
	public void testCreate() {
		assertNotNull(myLib);
		assertEquals("Ollieton Library", myLib.getName());
		assertEquals(5, myLib.getMaxBooksPerUser());
	}
	
	@Test
	public void testLibraryGetLibIdMethodForNoRegisteredUsers() {
		assertEquals(-1, myLib.getLibId());
	}
	
	@Test
	public void testLibraryGetLibIdMethodForOneRegisteredUser() {
		user1.register(myLib);
		assertEquals(1002, myLib.getLibId());
	}
	
	
}