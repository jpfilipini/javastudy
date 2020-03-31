
public class Application {

	public static void main(String[] args) {
		
		Computador comp1 = new Computador("Windows", 16, 1000, 5000.00 );
		
		System.out.println(comp1);

		Notebook note1 = new Notebook("Mac", 32, 2000, 10000.00 );
		
		System.out.println(note1);
		
		Embarcado emb1 = new Embarcado("Linux", 16, 2000, 3500.00 );
		
		System.out.println(emb1);
	}

}
