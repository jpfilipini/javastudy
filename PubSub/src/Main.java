import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        Produtor prodThread = new Produtor(frutas);
        Consumidor consumeThread = new Consumidor(frutas);

        Thread t1 = new Thread(prodThread);
        t1.start();
        Thread t2 = new Thread(consumeThread);
        t2.start();


    }
}
