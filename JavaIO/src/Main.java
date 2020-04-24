
import java.io.*;
import java.lang.module.FindException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner input = new Scanner(System.in);

        /* Lógica para criar um arquivo */
        try {
            System.out.println("Entre com o caminho do diretorio: ");
            String nomeDir = input.nextLine();
            System.out.println("Entre com o nome do arquivo a ser criado: ");
            String nomeArquivo = input.nextLine();
            File file = new File(nomeDir + nomeArquivo + ".txt");

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
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        }

            /* Lógica para mostrar os arquivos criados */

        System.out.println("Entre com o caminho do diretorio: ");
        String nomeDir = input.nextLine();
        File path = new File(nomeDir);
        File[] dir = path.listFiles();
        for (File fileTmp : dir) System.out.println(fileTmp.getName());

    }
    }








