package module2.exercise29.dowhileloop;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Runner {
    public static void main(String[] args) {

        Book book1 = new Book(772, "English", "700", "A");
        Book book2 = new Book(142, "Mathematics", "899", "B");
        Book book3 = new Book(438, "Filipino", "999", "C");
        Book book4 = new Book(613, "Science", "999", "C");
        ArrayList<Book> bkArrayList = new ArrayList<>();
        bkArrayList.add(book1);
        bkArrayList.add(book2);
        bkArrayList.add(book3);
        bkArrayList.add(book4);
        Book[] books = { book1, book2, book3, book4 };
        Circulation c = new Circulation();
        // JOptionPane.showMessageDialog(null, "Book ID" + book1.getBookId() + "\nTitle:
        // " + book.getTitle() + "\nISBN: "
        // + book1.getIsbn() + "\nCategory: " + );
        String message = String.format("Book1:%s%nBook2:%s%nBook3:%s",
                book1,
                book2,
                book3);
        JOptionPane.showMessageDialog(null, message);
        String[] options = { "Borrow", "Return" };
        String n = JOptionPane.showInputDialog(null, "What do you want todo?",
                null, JOptionPane.QUESTION_MESSAGE, null, options, options[0]).toString();
        if (n == options[0]) {
            c.borrow(books);
        } else {
            c.returns(bkArrayList);

        }
    }
}
