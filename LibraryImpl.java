/**
 * A class LibraryImpl which implements Library
 * @author ocouls01
 */
public class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser = 5;
	private int numberOfRegisteredUsers = 0;
	
	public LibraryImpl(String name) {
		this.name = name;
	}
	/**
	 * An accessor method for the name of the Library
	 * @return the name as a string.
	 */
	public String getName() {
		return "";
	}
	
	/**
	 * An accessor method for the ID number of a new user
	 * @return the new user's ID as an int.
	 */
	public int getLibId() {
		return 0;
	}
	
	/**
	 * An accessor method for the maximum number of books
	 * which can be borrowed per user at once.
	 * @return the maximum number of books as an int.
	 */
	public int getMaxBooksPerUser() {
		return 0;
	}
}