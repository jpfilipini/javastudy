public class Main {

    public static void main(String[] args) {

        Programa thread = new Programa();
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        Thread t3 = new Thread(thread);

        t1.start();
        t2.start();
        t3.start();
    }
}
