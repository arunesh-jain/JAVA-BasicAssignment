package Question12;

class CustomException extends Exception
{
    CustomException(String msg)
    {
        System.out.println(msg);
    }
}