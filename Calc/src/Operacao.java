public class Operacao {

    private double num1,
                   num2;
    private char operador;

    public void soma() {

        System.out.println(this.num1 + this.num2);
    }

    public void subtrair() {

        System.out.println(this.num1 - this.num2);
    }

    public void multiplicar() {

        System.out.println(this.num1 * this.num2);
    }

    public void dividir() {

        System.out.println(this.num1 / this.num2);
    }

    public double getNum1() {

        return num1;
    }

    public double getNum2() {

        return num2;
    }

    public char getOperador() {
        return operador;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {

        this.num2 = num2;
    }

    public void setOperador(char operador) {

        this.operador = operador;
    }

    public Operacao(double num1, double num2, char operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;

        if (operador == '+') {
            this.soma();
        } else if (operador == '-') {
            this.subtrair();
        } else if (operador == '*') {
            this.multiplicar();
        } else if (operador == '/') {
            this.dividir();
        }
    }

}


