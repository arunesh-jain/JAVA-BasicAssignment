package Question16;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter roll_no of first student");
            int roll1=sc.nextInt();
            System.out.println("Enter Name of first student");
            String name1=sc.next();
            Student s1=new Student(roll1,name1);
            Student s2=(Student)s1.clone();

            System.out.println("before cloning : "+s1.rollno+" "+s1.name);
            System.out.println("after cloning first object into second object : "+s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}