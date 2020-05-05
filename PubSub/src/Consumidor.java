import java.util.*;

public class Consumidor implements Runnable {

    static List<String> fruitList = new ArrayList<String>();
    boolean flag = true;

    public Consumidor(List<String> fruitList) {

        this.fruitList = fruitList;

    }

    public void ConsumeData() throws InterruptedException {

        synchronized (fruitList){
            while(fruitList.isEmpty()){
                System.out.println("Lista Vazia");
                fruitList.wait();
            }


        Thread.sleep(1000);
        if (fruitList.size() == 10) {
            System.out.println("Consumindo a lista");
            fruitList.clear();
        }
        System.out.println("Lista Consumida");
        fruitList.notifyAll();
    }}


    public synchronized void run() {
        while(true)
        try {
                ConsumeData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

