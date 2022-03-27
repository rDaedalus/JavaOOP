package module2.exercise26.whileloop;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Book {

    public static void main(String[] args) {
        ArrayList<Integer> borrowerId = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> courseSelection = new ArrayList<>();
        String n = "";
        String[] options = { "CITE", "CBE", "CEA", "CE" };
        int cycle = 0;
        while (cycle < 3) {
            for (int i = 0; i <= 3; i++) {

                borrowerId.add(Integer.parseInt(JOptionPane.showInputDialog("Please Borrow ID:")));
                firstNames.add(JOptionPane.showInputDialog("Please FirstName:"));
                lastNames.add(JOptionPane.showInputDialog("Please Last Name:"));
                courseSelection.add(JOptionPane.showInputDialog(null, "What is your course?",
                        null, JOptionPane.QUESTION_MESSAGE, null, options, options[0]).toString());
                cycle++;
            }
        }
        for (int i = 0; i < borrowerId.size(); i++) {
            JOptionPane.showMessageDialog(null, "Borrrow ID" +
                    borrowerId.get(i) + "\n First Name: " +
                    firstNames.get(i) + "\nLast Name: "
                    + lastNames.get(i) + "\nCategory: " +
                    courseSelection.get(i), null, JOptionPane.INFORMATION_MESSAGE);

        }

    }

}