package Question4;

import java.util.*;

//Q4.Write a Java Program to reverse a string without using String inbuilt function.

public class Question4 {
    public static void main(String[] args) {
        System.out.println("Write a String:-");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String result = "";
        for (int i = str.length()-1; i >= 0; i--)
        {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
