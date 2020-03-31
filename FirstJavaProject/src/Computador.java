
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
		sb.append("O sistema operacional do Computador �: ").append(so).append(". ")
		.append("A quantidade da mem�ria ram �, em gb: ").append(ram).append(". ")
		.append("A quantidade do hd �, em gb: ").append(hd).append(". ")
		.append("O valor da m�quina foi de: R$ ").append(preco);
		
		return sb.toString();
		
	}
	

}
