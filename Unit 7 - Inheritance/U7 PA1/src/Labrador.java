// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// Name: Trey Jenkins
//
// Date: 12/15
//         
// ****************************************************************


public class Labrador extends Dog {
//your new instance data here
    private int age;
    private String color;
    //-------------------------------------------
    // 2-arg Constructor
    // @param name   The Labrador's name.
    // @param color  The Labrador's fur color.
    //-------------------------------------------
    public Labrador(String name, String color) {
        //call the superclass cosntructor
       super(name);
        //make the object's color equal to the color parameter
       this.color = color;
       //initialize age to a random number on [1, 10].
      this.age = (int) (Math.random() * 10) + 1;
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
     * Accessor method
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Overrides speak
     * @return a small bark
     */
    @Override
    public String speak() {
        return super.speak() + super.speak() + "WOOF";
    }

    /**
     * Calculate dog years
     * Return age times 7
     */
    @Override
    public int dogYears() {
        return age*7;
    }

}
