
public class Main {
    public static void main(String[] args) {

        Operacao calculo = new Operacao();

        Operacao.getNum1();
        Operacao.getOperador();
        Operacao.getNum2();
        int result = calculo.calcular(num1, num2, operador);
        System.out.println("O resultado foi: " + result);


    }
}

