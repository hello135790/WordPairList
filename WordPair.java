public class WordPair {
    private String f;
    private String s;
    /** Constructs a WordPair object. */
    public WordPair(String first, String second) {
        f = first;
        s = second;
    }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
        return f;
        /* implementation not shown */ }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        return s;
        /* implementation not shown */ }

    public String toString() {
        return "(\"" + f + "\", \"" + s + "\")";
    }
}