package module2.exercise2.methodsAndWithoutParameters;

import java.util.Scanner;

public class Runner {
    // Cuadra,Erhesto
    // BSIT IT11S4P
    // March 22 2022
    // methodsAndWithoutParams
    public static void main(String[] args) {
        int authorId;
        Book bk = new Book();
        Author au = new Author();
        Borrower br = new Borrower();
        Scanner scan = new Scanner(System.in);
        String lastName;
        String firstName;

        bk.setInfo();

        System.out.println(bk.toString());
        System.out.println("Please enter authorId");
        authorId = scan.nextInt();
        System.out.println("Please enter Author Lastname");
        lastName = scan.next();
        System.out.println("Please enter Author Firstname");
        firstName = scan.next();
        au.setInfo(authorId, lastName, firstName);

        System.out.println(au.toString());

    }

}
