
public class Notebook extends Computador {

	public Notebook(String so, int ram, int hd, double preco) {
		super(so, ram, hd, preco);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("O sistema operacional do Notebook �: ").append(so).append(". ")
		.append("A quantidade da mem�ria ram �, em gb: ").append(ram).append(". ")
		.append("A quantidade do hd �, em gb: ").append(hd).append(". ")
		.append("O valor da m�quina foi de: R$ ").append(preco);
		
		return sb.toString();
		
	}

}
