package Question11;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class CoffeeShop {

    static String coffeeName;
    static int amount;
    static  int token_no;
    void Cashier()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("### Coffee Shop Menu###");
        System.out.println("Espresso \t 50Rs\n" +
                "Caramel Macchiato. \t 60 Rs\n" +
                "Affogato\t 70 Rs\n" +
                "Mocha.\t 80 Rs\n" +
                "Hazelnut.\t 90 Rs");
        System.out.println("Enter Your Order Name:");
        coffeeName=sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Please pay the amount of "+ coffeeName);
        amount=sc.nextInt();

    }
    void Customer()
    {
        if ((Objects.equals(coffeeName, "espresso")) && (amount==50))
        {
            token_no=250;
            System.out.println("Your Token no is :"+token_no +"\n");
            System.out.println("please Wait 5 min for Your order \n");
        }
        else if((Objects.equals(coffeeName, "macchiato")) &&(amount==60))
        {   token_no=170;
            System.out.println("Your Token no is :"+token_no +"\n");
            System.out.println("please Wait 5 min for Your order \n");
        }
        else if((Objects.equals(coffeeName, "affogato"))&&(amount==70))
        {
            token_no=290;
            System.out.println("Your Token no is :"+token_no +"\n");
            System.out.println("please Wait 5 min for Your order \n");
        }
        else if((Objects.equals(coffeeName, "mocha"))&&(amount==80))
        {
            token_no=230;
            System.out.println("Your Token no is :"+token_no +"\n");
            System.out.println("please Wait 5 min for Your order\n");
        }
        else if((Objects.equals(coffeeName, "hazelnut"))&&(amount==90))
        {
            token_no=260;
            System.out.println("Your Token no is :"+token_no +"\n");
            System.out.println("please Wait 5 min for Your order\n");
        }
        else
        {
            System.out.println("You have enter the wrong amount / Sorry your order is not available");
        }
        try{
        Thread.sleep(1500);}
        catch(Exception e)
        {
        }
    }
    void Barista() {
        if (token_no == 250) {
            System.out.println("please collect Your Order "+coffeeName);
            System.out.println("You have paid Rs"+amount+" for Your Order");
        }
        if (token_no == 170) {
            System.out.println("please collect Your Order "+coffeeName);
            System.out.println("You have paid Rs"+amount+" for Your Order");
        }
        if (token_no == 290) {
            System.out.println("please collect Your Order "+coffeeName);
            System.out.println("You have paid Rs"+amount+" for Your Order");
        }
        if (token_no == 230) {
            System.out.println("please collect Your Order "+coffeeName);
            System.out.println("You have paid Rs"+amount+" for Your Order");
        }
        if (token_no == 260) {
            System.out.println("please collect Your Order "+coffeeName);
            System.out.println("You have paid Rs "+amount+" for Your Order");
        }
    }
}
