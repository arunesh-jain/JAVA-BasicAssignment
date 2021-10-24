package Question14;
public class Main {

    private static final String string="main.java.utils";
    public static void main(String[] args) {
        try {
            Class loadedClass = Class.forName(string);
            System.out.println("Class " + loadedClass + " found successfully!");
        }
        catch (ClassNotFoundException ex) {
            System.err.println("A ClassNotFoundException was caught: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
