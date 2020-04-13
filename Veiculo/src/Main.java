public class Main {

    public static void main(String[] args) {

        Moto moto1 = new Moto();
        Carro car1 = new Carro();

        moto1.somdomotor();
        car1.somdomotor();


        moto1.setModelo("Esportivo");
        moto1.getModelo();

        car1.setModelo("Sedan");
        car1.getModelo();
    }
}
