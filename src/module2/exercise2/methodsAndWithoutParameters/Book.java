package module2.exercise2.methodsAndWithoutParameters;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String title;
    private String isbn;
    private String category;
    Scanner scan = new Scanner(System.in);

    public void setInfo() {

        System.out.println("Please enter book ID");
        bookId = scan.nextInt();
        System.out.println("Please enter book title");
        title = scan.next();
        System.out.println("Please enter book isbn");
        isbn = scan.next();
        System.out.println("Please enter book category");
        category = scan.next();

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
        return "Book [bookId=" + bookId + ", category=" + category + ", isbn=" + isbn + ", title=" + title + "]";
    }

}
