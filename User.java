/**
 * Interface for the library users
 * Library users have a name and Library-ID, both of which 
 * must be unique in the library
 * @author ocouls01
 */
public interface User {
	
	/**
	 * Accessor method for the name field
	 * @return the user's name as a string
	 */
	String getName();
	
	/**
	 * Accessor method for the libId field
	 * @return the user's Library ID# as an int
	 */
	int getLibId();
	
	/**
	 * Allows user to register and therefore get an ID number.
	 */
	int register(Library library);
	
	/**
	 * Returns the Lib that the user is registered to.
	 */
	Library getLibrary();
	
	
}