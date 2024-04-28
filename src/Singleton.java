public class Singleton {

    private static volatile Singleton singletonInstance;
    private Singleton(){
        System.out.println("Instantiated");
    }

    public static Singleton getSingletonInstance(){
        if (singletonInstance == null){
            synchronized (Singleton.class){
                if (singletonInstance == null)
                    singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }
}
