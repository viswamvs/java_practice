public class SingleTon {

    private static volatile SingleTon instance = null;
    private SingleTon(){
        System.out.println("SingleTon Instantiated");
    }

    public static SingleTon getSingleTonInstance(){
        if(instance == null){
            synchronized (SingleTon.class){
                if(instance == null)
                    instance = new SingleTon();
            }
        }
        return instance;
    }
}
