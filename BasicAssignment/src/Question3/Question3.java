package Question3;

import java.util.*;

//Write a Java program to remove a specified character from a given string.
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Write a Line:-");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println("Write a Character to remove from line:-");
        char ch = scan.nextLine().charAt(0);
        String result = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != ch)
                result += str.charAt(i);
        }
        System.out.println(result);
    }
}
