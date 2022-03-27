package module2.exercise21.dataypesAndOperators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookAquisitionRunner {
    // Cuadra,Erhesto
    // BSIT IT11S4P
    // March 22 2022
    // Class Constructor

    public static void main(String[] args) throws IOException {
        byte qntity;
        byte bookQuantity;
        float discountedBookPrice;
        boolean orderBook = true;
        float totalPrice;
        char exitCode;
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Author> authors = new ArrayList<>();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        Scanner scan = new Scanner(System.in);
        Supplier sup = new Supplier();

        do {
            Book bk = new Book();
            Author auth = new Author();
            System.out.println("Please enter the Supplier Id");
            sup.setSupplierId(Integer.parseInt(br.readLine()));
            System.out.println("Please enter the Supplier Name");
            sup.setSupplierName(scan.next());
            System.out.println("Please enter the Supplier Address");
            sup.setSupplierAddress(scan.next());
            System.out.println("Please enter the Supplier Telephone No.");
            sup.setSupplierTelephone(Long.parseLong(br.readLine()));
            System.out.println("Please enter the Book ID: ");
            bk.setBookId(Short.parseShort(br.readLine()));
            System.out.println("Please enter the Book Title: ");
            bk.setBookTitle(scan.next());
            System.out.println("Please enter the Book Price: ");
            bk.setBookPrice(Double.parseDouble(br.readLine()));
            System.out.println(" CATEGORY");
            System.out.println(" A. History");
            System.out.println(" B. Romance");
            System.out.println(" C. Comedy");
            System.out.println(" D. Sci-fi");
            System.out.println("Please enter the Book Category: ");
            bk.setBookCategory(scan.next().charAt(0));
            System.out.println("Please enter the last name of the author");
            auth.setBookAuthorLastname(scan.next());
            System.out.println("Please enter the last name of the author");
            auth.setBookAuthorFirstname(scan.next());
            System.out.println("Please enter the Book Quantity: ");
            qntity = Byte.parseByte(br.readLine());
            books.add(bk);
            authors.add(auth);
            float sameBookAuthor;
            float sameCategoryAuthor;

            for (Book b : books) {

                for (Author a : authors) {

                    sameBookAuthor = b == a ? 0.10f : 0f;

                }

            }
            sameCategoryAuthor = bk.getBookCategory() == (auth.bookAuthorLastname.charAt(0)) ? 0.20f : 0f;

            discountedBookPrice = (float) ((qntity >= 4 && qntity < 6) ? 0.25 : 0);
            discountedBookPrice = (float) ((qntity >= 6 && qntity > 4) ? 0.50 : 0);

            // Use appropriate logical operators to determine additional discounts on book
            // price. Refer to the conditions in the provided table below.
            // BookQuantity Discount
            // The same book and author 10%
            // The same category and author 20%

            // totalPrice = bookQuantity * (bookPrice – discountedBookPrice)

            System.out.println("Are you done ordering?Y/N");
            exitCode = scan.next().charAt(0);
            if (exitCode == 'Y' || exitCode == 'y') {
                orderBook = false;
            }

        } while (orderBook);

    }
}
