public class SingletonThread implements Runnable {

    @Override
    public void run() {
        LazyInitializedSingleton singletonInstance = LazyInitializedSingleton.getInstance();
        System.out.println("Singleton instance hash code from thread " +
                Thread.currentThread().getId() + ": " + singletonInstance.hashCode());
    }
}
