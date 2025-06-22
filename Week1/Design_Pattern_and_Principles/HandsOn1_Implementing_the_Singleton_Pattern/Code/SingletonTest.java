public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first message.");


        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second message.");


        //this will check if both logger1 and logger2 are the same instance and accordingly print the message
        if (logger1 == logger2) {
            System.out.println("Logger instances are the same. Singleton pattern is working!");
        } else {
            System.out.println("Logger instances are different. Singleton pattern failed.");
        }


    }
}
