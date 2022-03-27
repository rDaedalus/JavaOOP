package module2.exercise26.forloop;

public class Book {
    private int bookIds;
    private String titles;
    private String isbns;
    private String[] categories = { "Business", "Computing", "Education", "Engineering" };

    public Book() {

    }

    public int getBookIds() {
        return bookIds;
    }

    public void setBookIds(int bookIds) {
        this.bookIds = bookIds;
    }

    public String getTitles() {
        return titles;
    }

    public Book(int bookIds, String titles, String isbns, String[] categories) {
        this.bookIds = bookIds;
        this.titles = titles;
        this.isbns = isbns;
        this.categories = categories;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getIsbns() {
        return isbns;
    }

    public void setIsbns(String isbns) {
        this.isbns = isbns;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

}
