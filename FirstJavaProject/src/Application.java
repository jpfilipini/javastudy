
public class Application {

	public static void main(String[] args) {
		
		Computador comp1 = new Computador("Windows", 16, 1000, 5000.00 );
		
		System.out.println(comp1);

		Notebook note1 = new Notebook("Mac", 32, 2000, 10000.00 );

		note1.setPeso(5);
		System.out.println(note1);
		System.out.println("O peso do notebook, em kg, e de: " + note1.getPeso());
		
		Embarcado emb1 = new Embarcado("Linux", 16, 2000, 3500.00 );

		emb1.setPeso(10);
		System.out.println(emb1);
		System.out.println("O peso do Sistema Embarcado, em kg, e de: " + emb1.getPeso());
	}

}
