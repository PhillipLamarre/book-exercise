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
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, int borrowed, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }

    // Add the methods here ...
    private void printAuthor(){ //2.84
    System.out.println(author);
}
    private void printTitle(){ //2.84
    System.out.println(title);
}
    private int getPages(){ //2.85
    return pages;
}
    private void printDetails(){ //2.87
    System.out.println("Author: " + author + "Title: " + title + "Pages: " + pages);
    if(refNumber == ""){
        System.out.println("ZZZ");
    }
        else{System.out.println(refNumber);
        }
    
}
    public void setRefNumber(String ref){ //2.88 & 2.90
    if (ref.length() < 3){
        System.out.println("Reference format incorrect.");
    }
    else{
    refNumber = ref;
}
}
    public void borrow(){//2.91
     borrowed = borrowed++;
}
    public int getBorrowed(){//2.91
        return borrowed;
}
    public String getRefNumber(){ //2.88
    return refNumber;
}
    public boolean isCourseText(){//2.92
    return courseText;
}
}