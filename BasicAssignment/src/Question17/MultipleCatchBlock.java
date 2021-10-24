package Question17;

public class MultipleCatchBlock {

    public static void main(String[] args) {

        try{
            int a[]=new int[5];
            a[5]=30/0; //It will give Arithmetic Exception.
            System.out.println(a[5]); //It will give Array Index Out Of Bounds Exception.

            String string=null;
            System.out.println(string.length()); //It will give Parent Exception.
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }

        finally {
            System.out.println("finally block is always executed");
        }
    }
}