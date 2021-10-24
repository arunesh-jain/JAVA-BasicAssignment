package Question22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your 9 digit number :");
        int number = sc.nextInt();
        check c=new check();
        c.solution(number);

    }


}

