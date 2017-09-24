package patterns.singleton;

public class NotLazySingleton {
    private static NotLazySingleton uniqueInstance = new NotLazySingleton();

    private NotLazySingleton(){};

    public static NotLazySingleton getInstance() {
        return uniqueInstance;
    }
}
