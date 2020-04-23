
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        /* Lógica para criar um arquivo */
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome do arquivo a ser criado: ");
        String nomeArquivo = input.nextLine();
        File file = new File("C:\\Users\\Joao\\Documents\\javastudy\\Directory\\" + nomeArquivo + ".txt");

        OutputStream os = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Nome: ");
        System.out.println("Entre com a seu nome: ");
        String nome = input.nextLine();
        bw.write(nome);
        bw.newLine();
        bw.write("Idade: ");
        System.out.println("Entre com a sua idade: ");
        String idade = input.nextLine();
        bw.write(idade);
        bw.close();

        /* Lógica para mostrar os arquivos criados */

        File path = new File("C:\\Users\\Joao\\Documents\\javastudy\\Directory");
        File[] dir = path.listFiles();

        for (File fileTmp : dir) {
            System.out.println(fileTmp.getName());
        }
    }
}
