/**
 * Created by Trey Jenkins on January 11, 2020 at 21:09
 */
public class SubstringChecker extends Checker {

    private String substr;

    /**
     * Constructor method
     * @param substr string to check for
     */
    public SubstringChecker(String substr) {
        this.substr = substr;
    }

    /**
     * Check if the text contains substr
     * @param text text to check
     * @return boolean
     */
    @Override
    boolean accept(String text) {
        return text.contains(substr);
    }
}
