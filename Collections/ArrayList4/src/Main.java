import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        List<String> cores = new ArrayList<String>();

        cores.add("Azul");
        cores.add("Verde");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.remove(2);

        for(int i=0; i < cores.size(); i++){
            String cor = cores.get(i);
            System.out.println(cor);
        }

    }
}
