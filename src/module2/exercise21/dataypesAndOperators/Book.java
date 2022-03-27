package module2.exercise21.dataypesAndOperators;

public class Book extends Author {

    public short bookId;
    public String bookTitle;
    public double bookPrice;
    public char bookCategory;

    public Book(short bookId, String bookTitle, double bookPrice, char bookCategory) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookCategory = bookCategory;
    }

    public Book() {

    }

    public short getBookId() {
        return bookId;
    }

    public void setBookId(short bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public char getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(char bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "Book [bookCategory=" + bookCategory + ", bookId=" + bookId + ", bookPrice=" + bookPrice + ", bookTitle="
                + bookTitle + "]";
    }

}
