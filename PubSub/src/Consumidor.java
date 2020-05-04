import java.util.*;

public class Consumidor implements Runnable {

    static List<String> fruitList = new ArrayList<String>();
    boolean flag = true;

    public Consumidor(List<String> fruitList) {

        this.fruitList = fruitList;
        flag = true;

    }

    public void ConsumeData() throws InterruptedException {
        while (fruitList.size() == 10) {
            System.out.println("Consumindo a lista");
            fruitList.clear();
        }
        System.out.println("Lista Consumida");
    }


    public synchronized void run() {
        while(true)
        try {
            Thread.sleep(500);
            {
                ConsumeData();
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        notifyAll();
        }
    }
}

