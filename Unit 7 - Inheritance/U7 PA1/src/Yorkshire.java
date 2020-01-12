// ****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// Name: Trey Jenkins
//
// Date: Today
//         
// ****************************************************************

public class Yorkshire extends Dog {
//your instance data here
    private int age;
    //-------------------------------------------
    // 1-arg Constructor
    // @param name   The Yorkshire's name.
    //-------------------------------------------
    public Yorkshire(String name) {
        super(name);
        //call the superclass constructor
        //initialize age to a random number on [1, 15].
        this.age = (int)(Math.random() * 15) + 1;
    }


    // ------------------------------------------------------------
    // Add Required Methods
    // ------------------------------------------------------------

    /**
     * Accessor method
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Calculate dog years
     * Return age times 5
     */
    @Override
    public int dogYears() {
        return age*5;
    }

    /**
     * Overrides speak
     * @return a small bark
     */
    @Override
    public String speak() {
        return "woof";
    }
}
