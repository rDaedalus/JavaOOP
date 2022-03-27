package module2.exercise26.forloop;

import javax.swing.JOptionPane;

public class Runner {

    public static void main(String[] args) {
        Book book = new Book();
        int q = 0;
        int bookIds;
        String titles;
        String isbns;
        String categories;

        for (int i = 0; i < 3; i++) {
            bookIds = Integer.parseInt(JOptionPane.showInputDialog("Please input the Book ID: "));
            titles = JOptionPane.showInputDialog("Please input the book title: ");
            isbns = JOptionPane.showInputDialog("Please input the ISBN: ");
            categories = JOptionPane.showInputDialog(null, "What Category do you like?",
                    null, JOptionPane.QUESTION_MESSAGE, null, book.getCategories(), book.getCategories()[0])
                    .toString();
        }

        for (int i = 0; i < q; i++) {
            String message = String.format("ID:%d%nTitle:%s%nISBN:%s%nCategory:%s",
                    book.getBookIds(),
                    book.getTitles(),
                    book.getIsbns(),
                    book.getCategories());
            JOptionPane.showMessageDialog(null, message, "Books", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}