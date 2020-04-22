import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Trey Jenkins on April 02, 2020 at 20:41
 */
public class Student {

    private String firstName, lastName;
    private int id, gradeLevel;
    private double average;
    private ArrayList<Integer> tests;

    public Student(String lastName, String firstName, int id, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gradeLevel = gradeLevel;
        this.average = 0.0;
        tests = new ArrayList<>();
    }

    public double getAverage() {
        return average / tests.size();
    }

    public ArrayList<Integer> getTests() {
        return tests;
    }

    public void addTest(int score) {
        tests.add(score);
        average += score;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return id;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getID() + "\t" + getGradeLevel() + "\t" + getLastName() + ", " + getFirstName() + "\tAvg: " + df.format(getAverage());
    }

}
