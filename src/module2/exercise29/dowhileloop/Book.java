package module2.exercise29.dowhileloop;

public class Book {
    private int bookId;
    private String title;
    private String isbn;
    private String category;

    public Book(int bookId, String title, String isbn, String category) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.category = category;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "\nBookID=" + bookId + ", Category=" + category + ", ISBN=" + isbn + ", Title=" + title + "";
    }

    public Book() {

    }
}
