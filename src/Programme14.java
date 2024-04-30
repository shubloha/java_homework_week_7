public class Programme14 {
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
     */
    public static void main(String[] args) {
        // Create a new instance of Person
        Person person = new Person();

        // Set values for firstName, lastName, and age
        person.setFirstName(""); // firstName is set to an empty string
        person.setLastName(""); // lastName is set to an empty string
        person.setAge(10);

        // Print full name and teen status
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        // Set values for firstName and age
        person.setFirstName("John"); // firstName is set to "John"
        person.setAge(18);

        // Print full name and teen status
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        // Set value for lastName
        person.setLastName("Smith"); // lastName is set to "Smith"

        // Print full name
        System.out.println("fullName= " + person.getFullName());
    }

    // Person class definition goes here
    static class Person {
        private String firstName;
        private String lastName;
        private int age;

        // Method to get the first name
        public String getFirstName() {
            return firstName;
        }

        // Method to get the last name
        public String getLastName() {
            return lastName;
        }

        // Method to get the age
        public int getAge() {
            return age;
        }

        // Method to set the first name
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        // Method to set the last name
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // Method to set the age with boundary check
        public void setAge(int age) {
            if (age >= 0 && age <= 100) { // Check if age is within valid range
                this.age = age;
            } else { // If age is out of range, set it to 0
                this.age = 0;
            }
        }

        // Method to check if the person is a teen
        public boolean isTeen() {
            return age > 12 && age < 20; // Check if age is between 13 and 19
        }

        // Method to get the full name of the person
        public String getFullName() {
            // Check for empty strings and return accordingly
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return "";
            } else if (lastName.isEmpty()) {
                return firstName;
            } else if (firstName.isEmpty()) {
                return lastName;
            } else {
                return firstName + " " + lastName;
            }
        }
    }
}
