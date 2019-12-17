/**
 * Created by Trey Jenkins on December 02, 2019 at 10:19
 */
public class Word implements Comparable <Word> {

    private String bird = "";

    /**
     * Compares two words, ignoring case, primarily based on length
     * @param o the word to compare
     * @return a value denoting if the words are equal or not.
     */
    @Override
    public int compareTo(Word o) {
        if (bird.length() < o.bird.length()) {
            return -1;
        }
        if (bird.length() > o.bird.length()) {
            return 1;
        }
        return bird.compareToIgnoreCase(o.bird);
    }

    /**
     * Constructs the word
     * @param bird the word to store in the object
     */
    public Word (String bird) {
        this.bird = bird;
    }

    /**
     * toString method
     * @return the object's word as a string
     */
    public String toString() {
        return bird;
    }
}
