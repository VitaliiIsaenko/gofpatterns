package patterns.singleton;

public class FastSingleton {
    private volatile static FastSingleton uniqueInstance;

    private FastSingleton(){};

    private static FastSingleton getInstance(){
        if (uniqueInstance == null){
            synchronized (FastSingleton.class) {
                if (uniqueInstance == null){
                    uniqueInstance = new FastSingleton();
                }
            }
        }
        return  uniqueInstance;
    }

}
