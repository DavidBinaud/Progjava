import java.util.*;
public class Orque {
	
	private int id;
	
	private Arene arene;

	private int force;

	private int poids;

	private int taille;

	private int pdv;

	private int initiative;

	private int degat;

	private Arme arme;
	
	private static int nbOrques = 0;
	
	private static Orque [] tabOrques = new Orque [1000];
	
	public Orque(Arene arene) {
		this.id = Orque.nbOrques;
		this.arene = arene;
		this.nbOrques++;
		Orque.tabOrques[this.id] = this;

		this.aleatoireCarac();
		this.arme = Arme.selectionArme();
		this.degat=this.calculdegats();

		
	}

	private void aleatoireCarac(){
		// affecte des caracteristiques aleatoire a lorque
		this.force = randomMinMax(1,9);
		this.poids = randomMinMax(1,5);
		this.taille = randomMinMax(1,5);
		this.pdv = 20 + this.poids + this.taille;
		this.initiative = randomMinMax(1,5);

	}

	


	private int calculdegats(){
		// calcul les degats de lorque en fonction de ses caracteristiques
		int degat = 0;
		return degat;
	}


	
	
	public int getid() {
		return this.id;
	}
	
	
	public static Orque getOrqueById(int ident) {
		return tabOrques[ident];
	}

	public int combat(Orque ennemi){
		if(this.randomMinMax(1,2) == 1){
			return this.id;
		}
		else{
			return ennemi.id;
		}
		
	}

	public static int getnbOrques(){
		return nbOrques;
	}


	public static int randomMinMax(int min, int max) {
		Random rand = new Random();
		int res = rand.nextInt(max - min + 1) + min;
		assert min <= res && res <= max : "tirage aleatoire hors des bornes";
		return res;
	}	
}
