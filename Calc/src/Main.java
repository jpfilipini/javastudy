import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o 1º número: ");
        Double Numero1 = Double.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Digite o operador: + - * /");
        String Operacao = new Scanner(System.in).nextLine();
        System.out.println("Digite o 2º número:");
        Double Numero2 = Double.valueOf(new Scanner(System.in).nextLine());

        Operacao calculo = new Operacao(Numero1,Numero2,Operacao.charAt(0));
    }
}

