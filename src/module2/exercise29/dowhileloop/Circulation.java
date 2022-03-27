package module2.exercise29.dowhileloop;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Circulation {
    Scanner scan = new Scanner(System.in);
    int ctr = 0;
    int quantity = 0;

    public void borrow(Book[] books) {

        do {
            quantity = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Book Quantity \nMaximum : 3 "));

        } while (quantity > 3);

        int[] inputs = new int[quantity];
        Book[] borrowBooks = new Book[quantity];

        do {

            inputs[ctr] = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Book ID: "));
            ctr++;

        } while (ctr < quantity);
        ctr = 0;
        for (Book book : books) {
            for (int input : inputs) {
                if (input == book.getBookId()) {
                    borrowBooks[ctr] = book;
                    ctr++;
                }
            }

        }
        String message;
        if (quantity == 1) {
            message = String.format("Book1:%s",
                    borrowBooks[0]);
        } else if (quantity == 2) {
            message = String.format("Book1:%s%nBook2:%s",
                    borrowBooks[0],
                    borrowBooks[1]);
        } else {
            message = String.format("Book1:%s%nBook2:%s%nBook3:%s",

                    borrowBooks[0],
                    borrowBooks[1],
                    borrowBooks[2]);
        }
        JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
    }

    public void returns(ArrayList<Book> books) {
        // If the return method is selected,
        // use the do-while loop control structure to return or add the borrowed books.
        System.out.println("Starting Return");
        // If the return method is selected,
        // use the do-while loop control structure to return or add the borrowed books.
        quantity = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Book Quantity For Returning"));

        do {
            Book book = new Book();
            book.setBookId(Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Book ID: ")));
            book.setTitle(JOptionPane.showInputDialog("Please Enter the Book Title:"));
            book.setIsbn(JOptionPane.showInputDialog("Please Enter the Book isbn: "));
            book.setCategory(JOptionPane.showInputDialog("Please Enter the Book Category: "));
            ctr++;
            books.add(book);

        } while (ctr < quantity);

        JOptionPane.showMessageDialog(null, books, null, JOptionPane.INFORMATION_MESSAGE);
    }

}
