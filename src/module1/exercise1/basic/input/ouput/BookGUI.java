package module1.exercise1.basic.input.ouput;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BookGUI {
    public static void main(String[] args) {

        Book book = new Book();

        book.setBookId(Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Book ID: ")));
        book.setTitle(JOptionPane.showInputDialog("Please Enter Title of the Book:"));
        book.setISBN(JOptionPane.showInputDialog("Please Enter the ISBN:"));
        book.setCategory(JOptionPane.showInputDialog("Please Enter the Category:"));

        JOptionPane.showMessageDialog(null, "Book ID" + book.getBookId() + "\nTitle: " + book.getTitle() + "\nISBN: "
                + book.getISBN() + "\nCategory: " + book.getCategory());

    }

}
