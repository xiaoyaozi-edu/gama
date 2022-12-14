import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-07-29 15:35
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        List<Callable<Void>> tasks = new ArrayList<>();
        IntStream.range(0, 10).forEach(i -> tasks.add(() -> {
            System.out.println("callable " + i);
            TimeUnit.MILLISECONDS.sleep(200);
            return null;
        }));
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Thread thread = new Thread(() -> {
            try {
                executorService.invokeAll(tasks);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finish");
        });
        thread.start();

        TimeUnit.MILLISECONDS.sleep(500);
        List<Runnable> runnables = executorService.shutdownNow();
        System.out.println("shutdown");
        runnables.forEach(r -> {
            int i = 0;
        });
    }
}