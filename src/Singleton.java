public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
        System.out.println("Instance created");
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            return singleton;
        } else {
            return singleton;
        }
    }

}
