/**
 * JUnit test class for Book interface
 * @author ocouls01
 */

import org.junit.*;
import static org.junit.Assert.*;

public class TestBook{
	private Book myBook;
	
	@Before
	public void SetUp() {
		String author = "Neil Gaiman";
		String title = "American Gods";
		myBook = new BookImpl(author, title);
	}
	
	@Test
	public void TestGetAuthorDoesntReturnNull() {
		String output = myBook.getAuthor();
			
		assertFalse(output == null);
	}
	
	@Test
	public void TestGetTitleDoesntReturnNull() {
		String output = myBook.getTitle();
	
		assertFalse(output == null);
	}

	@Test
	public void TestGetAuthor() {
		String output = myBook.getAuthor();
		String expected = "Neil Gaiman";
		
		assertEquals(expected, output);
	}
	
	@Test
	public void TestGetTitle() {
		String output = myBook.getTitle();
		String expected = "American Gods";
		
		assertEquals(expected, output);
	}
}