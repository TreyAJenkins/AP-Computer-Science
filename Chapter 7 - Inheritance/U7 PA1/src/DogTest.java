// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// Name: Trey Jenkins
//
// Date: Today
//         
// ****************************************************************

public class DogTest {
    public static void main(String[] args) {

        //Dog is abstract so it cannot be instantiated

        //Dog dog = new Dog("Spike");
        //System.out.println(dog.getName() + " says " + dog.speak());

        // Create yorkshire
        Yorkshire yorky = new Yorkshire("Yorky");
        System.out.println(yorky.getName() + " is really " + yorky.getAge() + " years old, " +
                "which is " + yorky.dogYears() + " in dog-years, and she says " + yorky.speak());

        // Create labrador
        Labrador doug = new Labrador("Doug", "Black");
        System.out.println(doug.getName() + " is really " + doug.getAge() + " years old, " +
                "which is " + doug.dogYears() + " in dog-years. She is " + doug.getColor() +
                ", and she says " + doug.speak());

    }
}
