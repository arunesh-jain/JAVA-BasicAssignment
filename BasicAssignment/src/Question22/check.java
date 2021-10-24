package Question22;

public class check {
    static int sum = 0, count = 0;
    static int digit;
    void solution(int number)
    {
        int len = String.valueOf(number).length();
        if (len == 9)
        {
            while (number > 0) {
                digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }
            System.out.println("Sum of Digits of Your Card Numbers is :"+sum);
            if (sum % 10 == 0)
            {
                System.out.println("Okay");
            }
            else
            {
                System.out.println("NotOkay");
            }

        }
        else
        {
            System.out.println("You have exceeded the limit of digits :");

        }


    }
}
