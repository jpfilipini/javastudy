
public class Notebook extends Computador {

	public float peso;

	public void setPeso(float peso){
		this.peso = peso;
	}

	public Notebook(String so, int ram, int hd, double preco) {
		super(so, ram, hd, preco);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("O sistema operacional do Notebook e: ").append(so).append(". ")
		.append("A quantidade da memoria ram é, em gb: ").append(ram).append(". ")
		.append("A quantidade do hd e, em gb: ").append(hd).append(". ")
		.append("O valor da maquina foi de: R$ ").append(preco);
		
		return sb.toString();
		
	}

	public float getPeso(){
		return peso;
	}

}
