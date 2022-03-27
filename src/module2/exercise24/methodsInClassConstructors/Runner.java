package module2.exercise24.methodsInClassConstructors;

import javax.swing.JOptionPane;

public class Runner {

        // Cuadra,Erhesto
        // BSIT IT11S4P
        // March 22 2022
        // Class Constructor
        public static void main(String[] args) {
                Book book = new Book(Integer.parseInt(JOptionPane.showInputDialog("Enter Book ID")),
                                JOptionPane.showInputDialog("Enter Book Title"),
                                JOptionPane.showInputDialog("Enter Your ISBN"),
                                JOptionPane.showInputDialog("Enter Your Category"));

                Author au = new Author(Integer.parseInt(JOptionPane.showInputDialog("Enter Author ID")),
                                JOptionPane.showInputDialog("Enter Author Lastname"),
                                JOptionPane.showInputDialog("Enter Author Firstname"));

                JOptionPane.showMessageDialog(null,
                                "Book ID: " + book.getBookId() + "\nTitle: " + book.getTitle() + "\nISBN: "
                                                + book.getIsbn() + "\nCategory: " + book.getCategory() + "AuthorID: "
                                                + au.getAuthorId()
                                                + "\nAuthorLastname: "
                                                + au.getLastName() + "\nAuthorFirstName: "
                                                + au.getFirstName());

        }

}
