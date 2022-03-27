package module2.exercise2.classesAndObjects;

import javax.swing.JOptionPane;

public class Runner {
    // Cuadra,Erhesto
    // BSIT IT11S4P
    // March 22 2022
    // classesAndObjects.
    public static void main(String[] args) {

        Book book = new Book();
        Author au = new Author();

        book.setTitle(JOptionPane.showInputDialog("Please Enter the Book Title: "));
        book.setIsbn(JOptionPane.showInputDialog("Please Enter the Book ISBN: "));
        book.setCategory(JOptionPane.showInputDialog("Please Enter the Book Category: "));
        au.setAuthorId(Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Author ID: ")));
        au.setLastName(JOptionPane.showInputDialog("Please Enter the Last Name: "));
        au.setFirstName(JOptionPane.showInputDialog("Please Enter the First Name: "));

        JOptionPane.showMessageDialog(null, "Book ID" + book.getBookId() + "\nTitle: " + book.getTitle() + "\nISBN: "
                + book.getIsbn() + "\nCategory: " + book.getCategory() + "\nAuthorID: " +
                au.getAuthorId() + "\nAuthor Lastname: " + au.getLastName() + "\nAuthor First name: "
                + au.getFirstName());

    }

}
