public class Programa implements Runnable {

    static int i = 1;

    static synchronized void increment() {
        System.out.println(Thread.currentThread().getName() + ": " + i);
        i++;
    }

    public void run() {
        while(i<29){
            increment();
        }
    }

}
