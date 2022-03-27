package module2.exercise2.selectioncontrolstructure;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Catalogue {
    public static void main(String[] args) {
        Book book = new Book();

        Author author = new Author();

        Borrower br = new Borrower();
        JFrame f;

        f = new JFrame();

        int repeat;
        int getChoose;
        do {
            int select;
            int choose = 0;
            select = Integer
                    .parseInt(JOptionPane.showInputDialog("Select Appropriate input \n1.Book \n2.Author \n3.Borrower"));
            switch (select) {
                case 1:
                    // code block
                    book.setTitle(JOptionPane.showInputDialog("Please Enter the Book ID: "));
                    book.setIsbn(JOptionPane.showInputDialog("Please Enter the Book ISBN: "));
                    book.setCategory(JOptionPane.showInputDialog("Please Enter the Book Title: "));
                    choose = choose + 1;
                    break;
                case 2:
                    // code block
                    author.setAuthorId(Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Author ID: ")));
                    author.setLastName(JOptionPane.showInputDialog("Please Enter the Author Last Name: "));
                    author.setFirstName(JOptionPane.showInputDialog("Please Enter the First Name: "));

                    choose = choose + 1;
                    break;
                case 3:
                    // code block
                    br.setBorrowId(Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Borrower ID: ")));
                    br.setLastName(JOptionPane.showInputDialog("Please Enter the Borrower Last Name: "));
                    br.setFirstName(JOptionPane.showInputDialog("Please Enter the Borrower First Name: "));

                    choose = choose + 1;
                    break;

                default:
                    // code block
                    JOptionPane.showMessageDialog(null, "Wrong Input");

            }
            repeat = select;
            getChoose = choose;
            if (getChoose == 1) {

                JOptionPane.showMessageDialog(null,
                        "Book ID" + book.getBookId() + "\nTitle: " + book.getTitle() + "\nISBN: "
                                + book.getIsbn() + "\nCategory: " + book.getCategory());
            } else if (getChoose == 2) {
                JOptionPane.showMessageDialog(null, "\nAuthorID: " +
                        author.getAuthorId() + "\nAuthor Lastname: " + author.getLastName()
                        + "\nAuthor First name: "
                        + author.getFirstName());
            }

            else if (getChoose == 3) {
                JOptionPane.showMessageDialog(null, "\nBorrow ID: " +
                        br.getBorrowId() + "\nBorrow LastName: " + br.getLastName()
                        + "\nBorrow First Name: "
                        + br.getFirstName());
            }

            else {
                System.out.println("Invalid Input");
            }
        } while (repeat >= 3);

    }

}