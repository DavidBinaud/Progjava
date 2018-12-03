import java.util.*;
public class Orque {
	
	private int id;
	
	private Arene arene;
	
	private static int nbOrques = 0;
	
	private static Orque [] tabOrques = new Orque [1000];
	
	public Orque(Arene arene) {
		this.id = Orque.nbOrques;
		this.arene = arene;
		Orque.tabOrques[this.id] = this;
		this.nbOrques++;
		
	}
	
	
	
	public int Getid() {
		return this.id;
	}
	
	
	public static Orque getOrqueById(int ident) {
		return tabOrques[ident];
	}

	public int Combat(Orque ennemi){
		if(this.randomMinMax(1,2) == 1){
			return this.id;
		}
		else{
			return ennemi.id;
		}
		
	}

	public static int GetnbOrques(){
		return nbOrques;
	}


	public static int randomMinMax(int min, int max) {
		Random rand = new Random();
		int res = rand.nextInt(max - min + 1) + min;
		assert min <= res && res <= max : "tirage aleatoire hors des bornes";
		return res;
	}	
}
