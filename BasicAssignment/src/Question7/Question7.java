package Question7;
//Q7. Write a program to find the number of occurrences of a character in a string without using a loop?

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String to Perform :-");
        String str=scan.nextLine();
        System.out.println("Enter a Character for Searching");
        char c = scan.next().charAt(0);
        System.out.println(countInString(c,str));
    }

    static int countInString(char ch, String str)
    {
        if(str.length()==0)
            return 0;
        int count = 0;

        if(str.charAt(0)==ch)
            count++;
        count+=countInString(ch,str.substring(1));


        return count;
    }
}
