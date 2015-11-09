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
		myLib = new LibraryImpl("Library1");
		user1 = new UserImpl("Santi Cazorla");
	}
	
	@Test
	public void testCreate() {
		assertNotNull(myLib);
		assertEquals("Library1", myLib.getName());
		assertEquals(5, myLib.getMaxBooksPerUser());
	}
	
	@Test
	public void testLibraryGetLibIdMethodForNoRegisteredUsers() {
		assertEquals(1000, myLib.getLibId());
	}
	
	@Test
	public void testLibraryGetLibIdMethodForOneRegisteredUser() {
		user1.register(myLib);
		assertEquals(1001, myLib.getLibId());
	}

	@Test
	public void testGetLibMethodWithParametersForNoRegUsers() {
		String name = "Santi Cazorla";
		assertEquals(-1, myLib.getLibId(name));
	
	}

	@Test
	public void testGetLibMethodWithParameters() {
		String name = "Santi Cazorla";
		int expected = HashUtilities.shortHash(name.hashCode());
		int output = myLib.getLibId(name);

		assertEquals(expected, output);

	
	}
	
	@Test
	public void testSetMaxBooksPerUser() {
		assertEquals(5, myLib.getMaxBooksPerUser());
		myLib.setMaxBooksPerUser(6);
		assertEquals(6, myLib.getMaxBooksPerUser());
	}

	
}