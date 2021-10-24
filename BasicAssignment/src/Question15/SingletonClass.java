package Question15;

public class SingletonClass {

    private static SingletonClass instance = null;

    protected static void demoMethod() {
        System.out.println("Singleton class method");
    }

    public static SingletonClass getInstance() {
        if(instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}