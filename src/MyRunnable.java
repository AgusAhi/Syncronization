public class MyRunnable implements Runnable{
    private Counter counter;


    public MyRunnable(Counter counter){
        this.counter = counter;
    }


    public void run(){
        for (int i = 0; i < 10_000_000; i++) {
            counter.increment();
        }


    }
}
