package module2.exercise29.dowhileloop;

public class Author {
    private int authorId;
    private String lastName;
    private String firstName;

    public Author(int authorId, String lastName, String firstName) {
        this.authorId = authorId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Author() {

    }
}
