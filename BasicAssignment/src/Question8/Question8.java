package Question8;

//Q8.Write a program to print your Firstname, LastName & age using static block, static method & static variable respectively
public class Question8 {
    static String firstName,lastName;

    static
    {
        firstName = "Arunesh";
        lastName = "Jain";
        System.out.println("***Static block Called ***");
    }
    public static void main(String[] args) {
        //calling static variables.
        System.out.println("First Name : " + Question8.firstName);
        System.out.println("Last Name : " + Question8.lastName);
    }
}
