
public class Embarcado extends Computador {

	public Embarcado(String so, int ram, int hd, double preco) {
		super(so, ram, hd, preco);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("O sistema operacional do Sistema Embarcado é: ").append(so).append(". ")
		.append("A quantidade da memória ram é, em gb: ").append(ram).append(". ")
		.append("A quantidade do hd é, em gb: ").append(hd).append(". ")
		.append("O valor da máquina foi de: R$ ").append(preco);
		
		return sb.toString();
		
	}

}
