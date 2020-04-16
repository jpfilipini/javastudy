import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int id = 1;
        HashMap<String, Integer> mapa = new HashMap<>();

        for(int i=0; i < 20; i++){
            int num = random.nextInt(50);
                mapa.put("Id:" + id++, num);
            }

        System.out.println(mapa);
        }
    }

