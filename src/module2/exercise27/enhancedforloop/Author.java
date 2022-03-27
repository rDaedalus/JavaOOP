package module2.exercise27.enhancedforloop;

import java.util.Arrays;

public class Author {
    private int[] authorIds;
    private String[] lastNames;
    private String[] firstNames;

    public Author(int[] authorIds, String[] lastNames, String[] firstNames) {
        this.authorIds = authorIds;
        this.lastNames = lastNames;
        this.firstNames = firstNames;
    }

    public Author() {
        // empty method
    }

    public int[] getAuthorIds() {
        return authorIds;
    }

    public void setAuthorIds(int[] authorIds) {
        this.authorIds = authorIds;
    }

    public String[] getLastNames() {
        return lastNames;
    }

    public void setLastNames(String[] lastNames) {
        this.lastNames = lastNames;
    }

    public String[] getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String[] firstNames) {
        this.firstNames = firstNames;
    }

    @Override
    public String toString() {
        return "Author [authorIds=" + Arrays.toString(authorIds) + ", firstNames=" + Arrays.toString(firstNames)
                + ", lastNames=" + Arrays.toString(lastNames) + "]";
    }

}
