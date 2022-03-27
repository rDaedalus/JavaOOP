package module1.exercise1.basic.input.ouput;

/*
Cuadra,Erhesto Josh F.
BSIT ITS11S3
March 17 2022
Week 1
JAVA OOP BASICS
*/

//Book Class
public class Book {

    private int bookId;

    private String title, category, ISBN;

    public int getBookId() {
        return bookId;
    }

    /**
     * This is a method for setting the book id.
     * 
     *
     * @param bookId book identifier
     * @return returns void
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    // getters for the title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Method Overriding toString for print the output
    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", ISBN=" + ISBN + ", category=" + category + "]";
    }

}
