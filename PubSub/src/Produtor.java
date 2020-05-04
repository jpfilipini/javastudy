import java.util.*;

public class Produtor implements Runnable {

    static List<String> fruitList = new ArrayList<String>();
    static int i = 0;

    public Produtor(List<String> fruitList){

        this.fruitList = fruitList;

    }

    public void ProduceData() throws InterruptedException {

        System.out.println("Inserindo strings na lista: ");

        fruitList.add("Laranja");
        fruitList.add("Pera");
        fruitList.add("Uva");
        fruitList.add("Manga");
        fruitList.add("Morango");
        fruitList.add("Pessego");
        fruitList.add("Limao");
        fruitList.add("Banana");
        fruitList.add("Tangerina");
        fruitList.add("Carambola");

        int n = fruitList.size();
        while (true) {
            synchronized (fruitList){
            for (int k = 0; k < n; k++) {
                System.out.println("Posicao: " + k + "  " + fruitList.get(k));
                i++;
            }
            System.out.println("Lista Cheia");
            fruitList.wait();
        }}
    }

    @Override
    public synchronized void run() {
        while(i < 10) {
            try {
                ProduceData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fruitList.notify();
        }
    }
}
