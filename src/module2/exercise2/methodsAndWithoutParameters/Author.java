package module2.exercise2.methodsAndWithoutParameters;

import java.util.Scanner;

public class Author {
    private int authorId;
    private String lastName;
    private String firstName;

    public void setInfo(int authorId, String lastName, String firstName) {

        this.authorId = authorId;
        this.lastName = lastName;
        this.firstName = firstName;

    }

    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
