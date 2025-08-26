public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        System.out.println("Instance created");
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
