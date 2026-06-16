package SingletonPatternExample;

public class LoggerTest {
    public static void main(String[] args) {

        Logger ob1 = Logger.getInstance();
        Logger ob2 = Logger.getInstance();

        ob1.log("Application started.");
        ob2.log("User logged in.");

        if (ob1 == ob2) {
            System.out.println("Same instance - Singleton pattern works correctly.");
        } else {
            System.out.println("Different instances - Singleton pattern failed.");
        }
    }    
}
