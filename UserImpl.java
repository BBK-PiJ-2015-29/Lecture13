/**
 * Implementation of the User interface.
 * @author ocouls01
 */
public class UserImpl implements User {
	
	private String name;
	private int libId = -1;
	private Library registeredLibrary;
	
	public UserImpl(String name){
		this.name = name;
	}
	
	/**
	 * Accessor method for the name field
	 * @return the user's name as a string
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Accessor method for the libId field
	 * @return the user's Library ID# as an int
	 */
	public int getLibId() {
		return this.libId;
	}
	
	/**
	 * Allows user to register and therefore get an ID number.
	 */
	public int register(Library library) {
		this.registeredLibrary = library;
		this.libId = library.getLibId();
		return libId;
	}
	
	/**
	 * Returns the Lib that the user is registered to.
	 */
	public Library getLibrary() {
		return this.registeredLibrary;
	}
	 
}