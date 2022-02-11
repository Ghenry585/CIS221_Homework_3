
/* Gary Henry
CIS221
2/7/2022
Tuesdays and Thrusdays (2:10pm to 4:00pm)
Professor: Mr.Swinarski 
CIS221 Homework_3*/

//Main class
public class Main {
    public static void main(String[] args) { // Main method

        Person myObj = new Person(); // create new object of the person class
        myObj.setName("John"); // sends John to the public setter for name
        System.out.println(myObj.getName()); // public getter that gets the private name variable value and prints to
                                             // screen

        Age myObj2 = new Age(); // create new object of Age class
        myObj2.setAge(32); // send integer to the public setter, sets age variable
        System.out.println(myObj2.getAge()); // retrieves the age variable value and prints to screen

        System.out.println(myObj.getName() + " is " + myObj2.getAge() + " years old."); // gets age and name variable.
                                                                                        // Concat to a sentence and
                                                                                        // print to screen

    }

}