import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> Singleton.getSingletonInstance());
        executorService.execute(() -> Singleton.getSingletonInstance());
        executorService.execute(() -> Singleton.getSingletonInstance());
        executorService.execute(() -> Singleton.getSingletonInstance());
        executorService.execute(() -> Singleton.getSingletonInstance());
        executorService.execute(() -> Singleton.getSingletonInstance());
    }
}