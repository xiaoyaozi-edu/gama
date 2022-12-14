import java.util.concurrent.SynchronousQueue;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-08-30 12:25
 */
public class Test03 {

    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        try {
            queue.put(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}