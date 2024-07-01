public class SingletonClass {
    //cache memory will not be used in volatile variable
    private static volatile SingletonClass instance = null;

    private SingletonClass() {
        System.out.println("Singleton class created");
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                instance = new SingletonClass();
            }
        }
        return instance;
    }
}
