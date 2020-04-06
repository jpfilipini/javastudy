import java.util.Scanner;

public class Operacao {

    static Scanner input = new Scanner(System.in);
    private char operador;


    public int soma(int num1, int num2) {

        return num1 + num2;
    }

    public double soma(double num1, double num2){

        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {

        return num1 - num2;
    }

    public double subtrair(double num1, double num2) {

        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {

        return num1 * num2;
    }

    public double multiplicar(double num1, double num2) {

        return num1 * num2;
    }

    public int dividir(int num1, int num2) {

        return num1 / num2;
    }

    public double dividir(double num1, double num2) {

        return num1 / num2;
    }

    static int getNum1(int num1) {

        System.out.println("Digite o Primeiro Número: ");
         num1 = input.nextInt();
        return num1;
    }

    static double getNum1(double num1) {

        System.out.println("Digite o Primeiro Número: ");
        num1 = input.nextInt();
        return num1;
    }

    static int getNum2(int num1) {

        System.out.println("Digite o Segundo Número: ");
        int num2 = input.nextInt();
        return num2;
    }

    static double getNum2(double num1) {

        System.out.println("Digite o Segundo Número: ");
        int num2 = input.nextInt();
        return num2;
    }


    static char getOperador() {

        System.out.println("Digite o Operador: + - * / ");

        char operador = input.next().charAt(0);

        switch (operador) { // Start of Switch
            case '+':

                break;
            case '-':

                break;
            case '*':

                break;
            case '/':

                break;
            default:
                System.out.println("Illegal Operation");

        }

        return operador;
    }

    public void setNum1(int num1) { }

    public void setNum2(int num2) { }

    public void setOperador(char operador) {

        this.operador = operador;
    }

    public int calcular(int num1, int num2, char operador) {

        this.operador = operador;
        int result = 0;

        if (operador == '+') {
            return soma(num1, num2);
        } else if (operador == '-') {
            return subtrair(num1, num2);
        } else if (operador == '*') {
            return multiplicar(num1, num2);
        } else if (operador == '/') {
            return dividir(num1, num2);
        }

        return result;
    }

    public double calcular(double num1, double num2, char operador) {

        this.operador = operador;
        double result = 0;

        if (operador == '+') {
            this.soma(num1, num2);
        } else if (operador == '-') {
            this.subtrair(num1, num2);
        } else if (operador == '*') {
            this.multiplicar(num1, num2);
        } else if (operador == '/') {
            this.dividir(num1, num2);
        }

        return result;

    }

}

