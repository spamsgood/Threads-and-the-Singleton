public class LazyInitializedSingleton implements Runnable {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    @Override
    public void run() {
        // code to be executed in new thread
        System.out.println("This is running in a thread.");
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public void startNewThread() {
        Thread thread = new Thread(this);
        thread.start();
    }
}
