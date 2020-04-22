/**
 * Created by Trey Jenkins on April 02, 2020 at 20:41
 */
public class Student {

    private String firstName, lastName;
    private int id, gradeLevel;

    public Student(String lastName, String firstName, int id, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gradeLevel = gradeLevel;
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
        return getID() + "\t" + getGradeLevel() + "\t" + getLastName() + ", " + getFirstName();
    }

}
