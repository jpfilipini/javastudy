
public class Computador {
	
	protected String so;
	protected int ram;
	protected int hd;
	protected double preco;

	public void setSo(String so){
		this.so = so;
	}

	public void setRam(int ram){
		this.ram = ram;
	}

	public void setHd(int hd){
		this.hd = hd;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}
	
    public Computador(String so, int ram , int hd, double preco) {
        this.so = so;
        this.ram = ram;
        this.hd = hd;
        this.preco = preco;
    }

    public String getSO(){
    	return so;
	}

	public int getRam(){
    	return ram;
	}

	public int getHD(){
    	return hd;
	}

	public double getPreco(){
    	return preco;
	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("O sistema operacional do Computador e: ").append(so).append(". ")
		.append("A quantidade da memoria ram é, em gb: ").append(ram).append(". ")
		.append("A quantidade do hd e, em gb: ").append(hd).append(". ")
		.append("O valor da maquina foi de: R$ ").append(preco);
		
		return sb.toString();
	}

	

}
