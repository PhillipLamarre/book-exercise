/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    private void printAuthor(){ //2.84
    System.out.println(author);
}
    private void printTitle(){ //2.84
    System.out.println(title);
}
    private int getPages(){ //2.85
    return this.pages;
}
    private void printDetails(){
    System.out.println("Author: " + author + "Title: " + title + "Pages: " + pages);
    
}
}
