import java.util.*;

public class Produtor implements Runnable {

    static List<String> fruitList = new ArrayList<String>();


    public Produtor(List<String> fruitList){

        this.fruitList = fruitList;

    }


    public void ProduceData(int i) throws InterruptedException {

        synchronized (fruitList){
            while(fruitList.size() == 10){
                System.out.println("Lista Cheia");
                fruitList.wait();
            }


        Thread.sleep(1000);
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
                try{
                    for (int k = 0; k < n; k++) {
                        System.out.println("Posicao: " + k + "  " + fruitList.get(k));
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            System.out.println("Lista Cheia");
            fruitList.notifyAll();
        }
    }

    @Override
    public synchronized void run() {

        int counter = 1;
        while(true){
            try {
                ProduceData(counter++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }

}

