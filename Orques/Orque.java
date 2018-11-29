
public class Orque {
	
	private int id;
	
	private Arene arene;
	
	private static int nbOrques;
	
	private static Orque [] tabOrques = new Orque [1000];
	
	public Orque(Arene A) {
		
	
		
		
	}
	
	
	
	public int Getid() {
		return this.id;
	}
	
	
	public static Orque getOrqueById(int ident) {
		return tabOrques[ident];
	}
}
