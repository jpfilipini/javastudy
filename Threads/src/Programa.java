import java.util.concurrent.locks.ReentrantLock;

public class Programa implements Runnable {

    static int counter = 1;

    static ReentrantLock counterLock = new ReentrantLock();

    static void incrementCounter(){
        counterLock.lock();

        try{
            System.out.println(Thread.currentThread().getName() + ": " + counter);
            counter++;
        }finally{
            counterLock.unlock();
        }
    }

    public void run() {
        while(counter<29){
            incrementCounter();
        }
    }
}
