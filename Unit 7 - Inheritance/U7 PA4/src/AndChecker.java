/**
 * Created by Trey Jenkins on January 11, 2020 at 21:13
 */
public class AndChecker extends Checker {

    private Checker primary;
    private Checker secondary;

    /**
     * Constructor method
     * @param primary Checker to check
     * @param secondary Checker to check
     */
    public AndChecker(Checker primary, Checker secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    /**
     * Check if the text contains substr
     * @param text text to check
     * @return boolean
     */
    @Override
    boolean accept(String text) {
        return primary.accept(text) && secondary.accept(text);
    }
}
