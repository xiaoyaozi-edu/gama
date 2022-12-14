import java.time.LocalDateTime;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-08-04 14:56
 */
public class Test01 {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.tryLock();
        System.out.println(LocalDateTime.now());
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 3, 0, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        CompletableFuture completableFuture = new CompletableFuture();
        CompletableFuture.runAsync(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int i = 1 / 0;
                }, pool)
                .whenComplete((v, e) -> {
                    countDownLatch.countDown();
                })
                .exceptionally(e -> {
                    System.out.println(e);
                    return null;
                });
        CompletableFuture.runAsync(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }, pool)
                .whenComplete((v, e) -> {
                    countDownLatch.countDown();
                })
                .exceptionally(e -> {
                    System.out.println(e);
                    return null;
                });
        CompletableFuture.runAsync(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }, pool)
                .whenComplete((v, e) -> {
                    countDownLatch.countDown();
                })
                .exceptionally(e -> {
                    System.out.println(e);
                    return null;
                });
        countDownLatch.await();
        System.out.println(LocalDateTime.now());
//        Object o = new Object();
//        Thread t1 = new Thread(() -> {
//            synchronized (o) {
//                try {
//                    TimeUnit.SECONDS.sleep(3);
//                    System.out.println("t1结束");
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        t1.start();
//        TimeUnit.SECONDS.sleep(1);
//        Thread t2 = new Thread(() -> {
//            synchronized (o) {
//                System.out.println("t2结束");
//            }
//        });
//        t2.start();
//        t2.interrupt();
//
//        TimeUnit.SECONDS.sleep(100);

//        ReentrantLock lock = new ReentrantLock();
//        Thread t1 = new Thread(() -> {
//            lock.lock();
//            try {
//                TimeUnit.SECONDS.sleep(3000);
//                System.out.println("t1结束");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock.unlock();
//            }
//
//        });
//        t1.start();
//        TimeUnit.SECONDS.sleep(1);
//        Thread t2 = new Thread(() -> {
//            try {
//                lock.lock();
//            } finally {
//                lock.unlock();
//            }
//        });
//        t2.start();
//        t2.interrupt();
//
//        TimeUnit.SECONDS.sleep(100);
//
////        ReentrantLock lock = new ReentrantLock();
////        Thread t1 = new Thread(() -> {
////            lock.();
////            LockSupport.unpark();
////            System.out.println("xxxxxx");
////        });
////        t1.start();
////        TimeUnit.SECONDS.sleep(1);
////        t1.interrupt();
//
//        TimeUnit.SECONDS.sleep(100);
    }
}