/**
 * An interface for the Library class
 * @author ocouls01
 */
public interface Library {
	/**
	 * An accessor method for the name of the Library
	 * @return the name as a string.
	 */
	String getName();
	
	/**
	 * An method to generate and return the ID number of a new user
	 * @return the new user's ID as an int.
	 */
	int getLibId();
	
	/**
	 * A method to return the ID number of an existing user or to 
	 * generate and assign a new ID number for a new user.
	 * @return the library number
	 */
	int getLibId(String name);
	
	/**
	 * An accessor method for the maximum number of books
	 * which can be borrowed per user at once.
	 * @return the maximum number of books as an int.
	 */
	int getMaxBooksPerUser();
	
	/**
	 * A mutator method for the maximum number of books
	 * which can be borrowed per user at once.
	 * @param the new maximum number of books as an int.
	 */
	void setMaxBooksPerUser(int newMax);
	
	

}