/**Write a class with the name Person.
 The class needs three fields (instance variables) with the names  firstName, lastName of type String and age of type int.  */
public class Person {

    String firstName; //""
    String lastName; //""
    int age;

/**Method named getFirstName without any parameters, it needs to return the value of the firstName field. */
    public String getFirstName() {
        return this.firstName;
    }

/**Method named getLastName without any parameters, it needs to return the value of the lastName field. */
    public String getLastName() {
        return this.lastName;
    }

/**Method named getAge without any parameters, it needs to return the value of the age field. */
    public int getAge() {
        return this.age;
    }

/**Method named setFirstName with one parameter of type String, it needs to set the value of the  firstName field. */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

/**Method named setLastName with one parameter of type String, it needs to set the value of the  lastName field. */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

/**Method named setAge with one parameter of type int, it needs to set the value of the age field.
 If  the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.*/
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

/**Method named isTeen without any parameters,it needs to return true if the value of the age field is  greater than 12 and less than 20, otherwise, return false*/
    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }

/** Method named getFullName without any parameters,
     * it needs to return the full name of the person.
     * In case both firstName and lastName fields are empty, Strings return an empty String.
     * *In case firstName is an empty String, return firstName.
     * In case lastName is an empty String, return lastName.
     * To check if s String is empty, use the method isEmpty from the String class.
     * For example,  firstName.isEmpty() returns true if the String is empty or in other words,
     * when the String does not  contain any characters.
     */
    public String getFullName() {
        String str = null;
        if (this.firstName == "") {
            str = this.lastName;
        } else if (this.lastName == "") {
            str = this.firstName;
        } else if (this.firstName == "" && this.lastName == "") {
            str = "";
        } else {
            str = this.firstName + " " + this.lastName;
        }
        return str;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("John");// firstNam = John & lastName =""
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName()); // John
        System.out.println("teen= " + person.isTeen());

        // firstName = John & lastName= ""
        person.setLastName("Smith"); // firstName = "John" & lastName = "Smith"
        System.out.println("fullName= " + person.getFullName()); // John Smith

    }

}
