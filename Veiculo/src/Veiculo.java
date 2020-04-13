public class Veiculo {

    private String modelo;
    private String placa;
    private int preco;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public String getModelo() {
        System.out.println("O modelo é: " + modelo);
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
}
