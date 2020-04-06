public class Main {
    public static void main(String[] args) {
        Operacao calculo = new Operacao();

        int num1 = Operacao.getNum1();
        char operador = Operacao.getOperador();
        int num2 = Operacao.getNum2();
        int result = calculo.calcular(num1, num2, operador);
        System.out.println("O resultado foi: " + result);
    }
}

