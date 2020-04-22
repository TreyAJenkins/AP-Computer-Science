import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class StudentSort {

    public static void main (String[] args) throws FileNotFoundException {
        int arraySize = 0;
        String first, last;
        int id, gradeLevel;
        Student[] student = null;
        int selection = 0;

        String[] choices = {"grades1", "grades2", "grades3"};
        String input = (String) JOptionPane.showInputDialog(null, "Choose a file to open.", "Choose File", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        File file = new File("" + input + ".txt");//File file = new File("src/" + input + ".txt");


        Scanner scanner = new Scanner(file);

        // Read the file to create the array of Student objects

        // get the number of students (first line)
        arraySize = scanner.nextInt();
        student = new Student[arraySize];

        // read in the students
        for (int i = 0; i < arraySize; i++) {
            last = scanner.next();
            first = scanner.next();
            id = scanner.nextInt();
            gradeLevel = scanner.nextInt();

            Student stu = new Student(last, first, id, gradeLevel);

            // Read in the grades
            scanner.nextLine(); // Finish reading the current line
            for (String grade : scanner.nextLine().split(" ")) {
                //System.out.println("grade: " + grade);
                stu.addTest(Integer.parseInt(grade));
            }

            student[selection++] = stu;
        }

        scanner.close();

        // Print out array of Students

        for (int i = 0; i < arraySize; i++) {
            System.out.println(student[i]);
        }

        // Create a menu to choose which way to sort the data
        do {
            selection = printMenu();

            switch (selection)
            {
                case 1:
                    // Insertion Sort - Sort by Grade Level
                    gradeLevelSort(student);

                    // Print the sorted students using a for-each loop
                    break;

                case 2:
                    // Selection Sort - Sort by Average
                    gradeAverageSort(student);

                    // Print the sorted students using a while-loop
                    break;
                case 3:
                    // Insertion or Selection Sort - Sort by Last Name
                    lastNameSort(student);

                    // Print the sorted students using a for-loop
                    break;

            }
            System.out.println();
        } while (selection > 0 && selection <= 3);

        System.out.println("Thank you!!");


    }

    /**
     * Creates a menu to make a choice
     * @return the choice to sort the students
     */
    public static int printMenu()
    {

        String str = JOptionPane.showInputDialog("How do you want to sort?\n1. Grade Level\n2. Average\n3. Name\n4. Quit");
        int choice = Integer.parseInt(str);
        return choice;

    }

    /**
     * Sorts the students by grade level in ascending order
     * @param stu the array of Student
     */
    public static void gradeLevelSort(Student[] stu) {
        for (int i = 1; i < stu.length; i++) {
            Student temp = stu[i];
            int j = i - 1;

            while (j >= 0 && stu[j].getGradeLevel() > temp.getGradeLevel()) {
                stu[j+1] = stu[j];
                j--;
            }
            stu[j+1] = temp;
        }

        System.out.println("\nGrade level sort:");
        for (Student student : stu) {
            System.out.println(student);
        }

    }



    /**
     * Sorts the students by average in ascending order
     * @param stu the array of Student
     */
    public static void gradeAverageSort(Student[] stu) {
        for (int i = 0; i < stu.length-1; i++) {
            int min = i;
            // find min location
            for (int j = i+1; j < stu.length; j++) {
                if (stu[j].getAverage() < stu[min].getAverage()) {
                    min = j;
                }
            }
            // swap min and i
            Student tmp = stu[i];
            stu[i] = stu[min];
            stu[min] = tmp;
        }


        System.out.println("\nGrade average sort:");
        int sel = 0;
        while (sel < stu.length) {
            System.out.println(stu[sel++]);
        }
    }



    /**
     * Sorts the students by Name in alphabetical order
     * @param stu the array of Student
     */
    public static void lastNameSort(Student[] stu) {
        for (int i = 1; i < stu.length; i++) {
            Student temp = stu[i];
            int j = i - 1;

            while (j >= 0 && stu[j].getLastName().compareToIgnoreCase(temp.getLastName()) > 0 ) {
                stu[j+1] = stu[j];
                j--;
            }
            stu[j+1] = temp;
        }
        System.out.println("\nLast name sort:");

        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }
    }



}