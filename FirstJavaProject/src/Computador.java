
public class Computador {
	
	protected String so;
	protected int ram;
	protected int hd;
	protected double preco;
	
    public Computador(String so, int ram , int hd, double preco) {
        this.so = so;
        this.ram = ram;
        this.hd = hd;
        this.preco = preco;
    }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("O sistema operacional do Computador é: ").append(so).append(". ")
		.append("A quantidade da memória ram é, em gb: ").append(ram).append(". ")
		.append("A quantidade do hd é, em gb: ").append(hd).append(". ")
		.append("O valor da máquina foi de: R$ ").append(preco);
		
		return sb.toString();
		
	}
	

}
