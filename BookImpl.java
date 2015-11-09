/**
 * Implementation of the Book interface
 * @author ocouls01
 */
public class BookImpl implements Book{
	/**
	 * Books have 2 fields, one for author and one for 
	 * title. Both are Strings. There are no setter
	 * methods for these fields as they are set at construction
	 */
	private final String author;
	private final String title;
	
	public BookImpl(String author, String title) {
		this.author = author;
		this.title = title;
	}
	
	/**
	 * Accessor method for author field
	 * @return the title of the book.
	 */
	public String getAuthor() {
		return this.author;
	}
	
	/**
	* Accessor method for title field
	* @return the title of the book.
	*/
	public String getTitle() {
		return this.title;
	}
	
}