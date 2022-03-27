package module2.exercise2.selectioncontrolstructure;

public class Borrower {
    private int borrowId;
    private String lastName;
    private String firstName;

    public Borrower(int borrowId, String lastName, String firstName) {
        this.borrowId = borrowId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Borrower() {

    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
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

}
