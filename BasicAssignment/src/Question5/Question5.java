package Question5;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Factorial.factorialFirst(num);
    }
}

class Factorial{
    static void factorialFirst(int num)
    {
        int result=1;
        for(int i=num;i>0;i--)
            result *= i;
        System.out.println("Question5.Factorial of "+ num +" is : " + result);
    }
}
