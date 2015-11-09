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
		return name;
	}
	
	/**
	 * An accessor method for the ID number of a new user
	 * This implementation assumes that libraries will have
	 * no more than 1000 registered users. 
	 * @return the new user's ID as an int.
	 */
	public int getLibId() {
		int newId = 1000+numberOfRegisteredUsers;
		numberOfRegisteredUsers++;
		
		return newId;
	}
	
	/**
	 * An accessor method for the maximum number of books
	 * which can be borrowed per user at once.
	 * @return the maximum number of books as an int.
	 */
	public int getMaxBooksPerUser() {
		return maxBooksPerUser;
	}
	
	/**
	 * A mutator method for the maximum number of books
	 * which can be borrowed per user at once.
	 * @param the new maximum number of books as an int.
	 */
	public void setMaxBooksPerUser(int newMax) {
		this.maxBooksPerUser = newMax;
	}

}