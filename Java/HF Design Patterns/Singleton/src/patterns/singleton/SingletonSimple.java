package patterns.singleton;

public class SingletonSimple {
    private static SingletonSimple uniqueInstance;

    private SingletonSimple(){};

    public static synchronized SingletonSimple getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new SingletonSimple();
        }
        return uniqueInstance;
    }

}
