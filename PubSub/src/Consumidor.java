import java.util.*;

public class Consumidor implements Runnable {

    static List<String> fruitList = new ArrayList<String>();

    public Consumidor(List<String> fruitList){

        this.fruitList = fruitList;

    }

    public void ConsumeData() throws InterruptedException {
        System.out.println("Consumindo a lista");
        synchronized (fruitList){
        fruitList.clear();
        if(fruitList.isEmpty()){
            System.out.println("Lista Consumida");
        }
        else{
            System.out.println(fruitList.size());
        }}

    }

    public void run() {
        try{
            Thread.sleep(500);
            while(fruitList.size() == 10)
                ConsumeData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        fruitList.notify();
    }
}
