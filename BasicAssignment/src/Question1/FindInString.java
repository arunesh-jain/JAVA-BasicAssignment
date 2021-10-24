package Question1;

import sun.awt.geom.AreaOp;

import java.util.*;

//Q1.Write a Java program to return true if a given string contain the string 'pop', but the middle 'o' also may other character.
public class FindInString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a String:-");
        String str=scan.nextLine();
        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'p')
            {
                if (str.charAt(i + 2) == 'p') {
                    flag = true;
                    break;
                }
            }
        }

        System.out.println(flag);

    }
}
