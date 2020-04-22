import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Trey Jenkins on April 02, 2020 at 20:46
 */
public class StudentSearch {

    public static void main (String[] args) throws FileNotFoundException {

        Scanner input, fileReader;
        int arraySize = 0;
        String first, last;
        int id, gradeLevel;
        Student[] student = null;
        int index = 0, numComparisons = 0;
        boolean found = false;


        input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String filename = input.next();

        File file = new File(filename + ".txt"); //or File file = new File("src/" + input + ".txt");

        try {

            fileReader = new Scanner(file);

            // get the size of the array (first line)
            if (fileReader.hasNextLine())
                arraySize = fileReader.nextInt();

            //Create array of Student objects
            student = new Student[arraySize];
            index = 0;

            while (fileReader.hasNext()) {
                last = fileReader.next();
                first = fileReader.next();
                id = fileReader.nextInt();
                gradeLevel = fileReader.nextInt();

                //fill the array with student objects
                student[index] = new Student(last, first, id, gradeLevel);

                //keep your index counter
                index++;
            }
            fileReader.close();  // closes the filestream
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        //Step 3
        for (Student s:student) {
            System.out.println(s);
        }

        //Step 4
        input.nextLine(); // clear the input buffer
        System.out.print("Enter a name for Linear Search or \"quit\" to quit: ");
        String choice;
        while ( !(choice = input.nextLine()).equals("quit") ) {
            index = linearSearch(student, choice);
            if (index == -1)
                System.out.println("Name: \"" + choice + "\" not found.");
            else
                System.out.println(student[index]);
            System.out.print("Enter a name for Linear Search or \"quit\" to quit: ");
        }
        System.out.println("Exiting..."); // The user has quit.

        //Step 5
        //input.nextLine(); // clear the input buffer
        System.out.print("Search for ID Number in Binary Search or 0 to quit: ");
        int choiceID;
        while ( (choiceID = input.nextInt()) != 0 ) {
            index = binarySearch(student, choiceID);
            if (index == -1)
                System.out.println("ID: " + choiceID + " not found.");
            else
                System.out.println(student[index]);
            System.out.print("Search for ID Number in Binary Search or 0 to quit: ");
        }
        System.out.println("Goodbye..."); // The user has quit.
    }
    /**
     * Conducts a linear search to find the last name of a student.
     * @param student the array of Student objects
     * @param target the last name of the student
     * @return the index of student or -1 if no name is found
     */
    public static int linearSearch(Student[] student, String target) {
        int numberOfComparisons = 0;

        for (int i = 0; i < student.length; i++) {
            // If the last name equals the target, return the index
            numberOfComparisons++; // A comparison lies ahead
            if (student[i].getLastName().equals(target)) {
                System.out.println("Number of comparisons: " + numberOfComparisons);
                return i;
            }
        }

        // return -1 since no name was found
        return -1;

    }



    /**
     * Conducts a binary search to find the ID Number of a student
     * @param student the array of Student objects
     * @param target the ID Number of a student
     * @return the index of the student or -1 if no ID Number is found
     */
    public static int binarySearch(Student[] student, int target) {

        int low = 0;
        int high = student.length - 1;

        int numOfComparisons = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            //System.out.println(low + ", " + mid + ", " + high);

            numOfComparisons++; // if is a comparison
            if (target == student[mid].getID()) { // Check if target is at the midpoint
                System.out.println("Number of comparisons: " + numOfComparisons);
                return mid;
            }

            numOfComparisons++; // Another comparison
            if (target < student[mid].getID())
                high = mid - 1; // Discard upper half of search space
            else
                low = mid + 1; // Discard lower half of search space
        }

        return -1;
    }
}