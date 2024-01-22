public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r1 = new MyRunnable(counter);
        Runnable r2 = new MyRunnable(counter);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Si sale más de 15_000_000 David es tonto: " + counter.getValue());
    }
}
