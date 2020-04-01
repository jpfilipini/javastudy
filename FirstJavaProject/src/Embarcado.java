
public class Embarcado extends Computador {

	public float peso;

	public void setPeso(float peso){
		this.peso = peso;
	}

	public Embarcado(String so, int ram, int hd, double preco) {
		super(so, ram, hd, preco);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("O sistema operacional do Sistema Embarcado e: ").append(so).append(". ")
		.append("A quantidade da memória ram e, em gb: ").append(ram).append(". ")
		.append("A quantidade do hd e, em gb: ").append(hd).append(". ")
		.append("O valor da maquina foi de: R$ ").append(preco);
		
		return sb.toString();
	}
	
	public String getString(){
		String toString = null;
		return toString;
	}

	public float getPeso(){
		return peso;
	}

}
