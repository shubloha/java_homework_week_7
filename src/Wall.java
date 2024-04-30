public class Wall {
    // Instance variables
    private double width;
    private double height;

    /**
     * Write a class with the name Person. The class needs three fields (instance variables) with the names
     * firstName, lastName of type String and age of type int.
     * Write the following methods (instance methods):
     * *Method named getFirstName without any parameters, it needs to return the value of the firstName
     * field.
     * *Method named getLastName without any parameters, it needs to return the value of the lastName
     * field.
     * *Method named getAge without any parameters, it needs to return the value of the age field.
     * *Method named setFirstName with one parameter of type String, it needs to set the value of the
     * firstName field.
     * *Method named setLastName with one parameter of type String, it needs to set the value of the
     * lastName field.
     * *Method named setAge with one parameter of type int, it needs to set the value of the age field. If
     * the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
     * *Method named isTeen without any parameters, it needs to return true if the value of the age field is
     * greater than 12 and less than 20, otherwise, return false.
     * *Method named getFullName without any parameters, it needs to return the full name of the person.
     * *In case both firstName and lastName fields are empty, Strings return an empty String.
     * *In case firstName is an empty String, return firstName.
     * *In case lastName is an empty String, return lastName.
     * To check if s String is empty, use the method isEmpty from the String class. For example,
     * firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
     * contain any characters.
     * TEST EXAMPLE
     * TEST CODE: (Write below code in to main method then check out put)
     * Person person = new Person();
     * person.setFirstName(""); // firstName is set to empty string
     * person.setLastName(""); // lastName is set to empty string
     * person.setAge(10);
     * System.out.println("fullName= " + person.getFullName());
     * System.out.println("teen= " + person.isTeen());
     * person.setFirstName("John"); // firstName is set to John
     * person.setAge(18);
     * System.out.println("fullName= " + person.getFullName());
     * System.out.println("teen= " + person.isTeen());
     * person.setLastName("Smith"); // lastName is set to Smith
     * System.out.println("fullName= " + person.getFullName());
     * OUTPUT
     * fullName=
     * teen= false
     * fullName= John
     * teen= true
     * fullName= John Smith
     * NOTE: All methods should be defined as public NOT public static.
     * NOTE: In total, you have to write 8 methods.
     */
    // First constructor (no-arg constructor)
    public Wall() {
        // Default values for width and height are 0
    }

    // Second constructor with parameters for width and height
    public Wall(double width, double height) {
        // Initialize width and height with given values, ensuring they are non-negative
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to set the width with boundary check
    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    // Method to set the height with boundary check
    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    // Method to calculate and return the area of the wall
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        // Create a new instance of Wall with width 5 and height 4
        Wall wall = new Wall(5, 4);

        // Print the area of the wall
        System.out.println("Area: " + wall.getArea());

        // Set height to -1.5
        wall.setHeight(-1.5);

        // Print width, height, and area after setting height to -1.5
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());
    }
}
