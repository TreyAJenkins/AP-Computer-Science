/**
 * Created by Trey Jenkins on January 11, 2020 at 21:05
 */
public class CheckerDriver {
    public static void main(String[] args) {
        Checker broccoliChecker = new SubstringChecker("broccoli");
        System.out.println("the first Checker object is: broccoli");

        System.out.print("The first Checker found in the following phrase:\"broccoli\": ");
        System.out.println(broccoliChecker.accept("broccoli"));

        System.out.print("The first Checker found in the following phrase: \"I like broccoli\": ");
        System.out.println(broccoliChecker.accept("I like broccoli"));

        System.out.print("The first Checker found in the following phrase: \"carrots are great\": ");
        System.out.println(broccoliChecker.accept("carrots are great"));

        System.out.print("The first Checker found in the following phrase: \"Broccoli Bonanza\": ");
        System.out.println(broccoliChecker.accept("Broccoli Bonanza"));
        System.out.println();


        Checker bChecker = new SubstringChecker("beets");
        Checker cChecker = new SubstringChecker("carrots");
        Checker bothChecker = new AndChecker(bChecker, cChecker);

        System.out.println("The bothChecker contains Checker objects for: beets & carrots");

        System.out.print("Both Checker objects are found in the phrase: \"I love beets and carrots\": ");
        System.out.println(bothChecker.accept("I love beets and carrots"));

        System.out.print("Both Checker objects are found in the phrase: \"beets are great\": ");
        System.out.println(bothChecker.accept("beets are great"));
        System.out.println();

        Checker aChecker = new SubstringChecker("artichokes");
        Checker veggies = new AndChecker(bothChecker, aChecker);
        System.out.println("The veggie contains Checker objects for: beets, carrots and artichokes");

        System.out.print("All three Checker objects are found in the phrase: \"artichokes, beets, and carrots\": ");
        System.out.println(veggies.accept("artichokes, beets, and carrots"));
    }
}
