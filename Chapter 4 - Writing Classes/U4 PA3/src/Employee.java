import java.text.NumberFormat;

/**
 * Created by Trey Jenkins on November 01, 2019 at 10:16
 */
public class Employee {

    private String name;
    private Double salary;

    /**
     * Gets the name
     * @return name as String
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the salary
     * @return salary as double
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the name
     * @param n name to set
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * Sets the salary
     * @param s salary
     */
    public void setSalary(double s) {
        salary = s;
    }

    /**
     * raises the salary by a percent
     * @param byPercent the percent to raise the salary by
     */
    public void raiseSalary(double byPercent) {
        salary = salary + (salary * byPercent/100.00);
    }

    /**
     * Converts the Employee class to a string
     * @return name and salary
     */
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return name + " " + nf.format(salary);
    }

    /**
     * Constructs the Employee class
     * @param name name of the employee
     * @param salary salary of the employee
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
