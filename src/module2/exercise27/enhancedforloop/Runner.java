package module2.exercise27.enhancedforloop;

import javax.swing.JOptionPane;

public class Runner {
    // Cuadra,Erhesto
    // BSIT IT11S4P
    // March 22 2022
    // Class Constructor
    public static void main(String[] args) {
        Author auth = new Author();
        int quantity = 0;
        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many books will you enter?"));

        int[] authorIds = new int[quantity];
        String[] lastNames = new String[quantity];
        String[] firstNames = new String[quantity];
        int[] inputs = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            authorIds[i] = Integer.parseInt(JOptionPane.showInputDialog("Please input the Author ID: "));
            lastNames[i] = JOptionPane.showInputDialog("Please input the Author Last name: ");
            firstNames[i] = JOptionPane.showInputDialog("Please input the Author First: ");

        }
        auth = new Author(authorIds, lastNames, firstNames);

        for (int i = 0; i < quantity; i++) {
            inputs[i] = i;
        }
        for (int i : inputs) {

            String message = String.format("ID:%d%nLastName:%s%nFirtName:%s",
                    auth.getAuthorIds()[i],
                    auth.getLastNames()[i],
                    auth.getFirstNames()[i]);

            JOptionPane.showMessageDialog(null, message, "Author", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
