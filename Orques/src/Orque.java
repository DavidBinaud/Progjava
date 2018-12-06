import java.util.*;
public class Orque {
	// attribut instance
	private int id;
	
	private Arene arene;

	private int force;

	private int poids;

	private int taille;

	private int pdv;

	private int initiative;

	private int degat;

	private Arme arme;
	
	// attribut classe
	private static int nbOrques = 0;
	
	private static Orque [] tabOrques = new Orque [1000];
	
	private int posX;
	
	private int posY;
	
	
	// Constructeur
	public Orque(Arene arene) {
		
		this.id = Orque.nbOrques;
		this.arene = arene;
		Orque.nbOrques++;
		Orque.tabOrques[this.id] = this;
		this.aleatoireCarac();
		this.arme = new Arme(Arme.selectionArme());
		this.degat=this.calculdegats();

		
	}

	
	private void aleatoireCarac(){
		// affecte des caracteristiques aleatoire a lorque
		this.force = randomMinMax(1,9);
		this.poids = randomMinMax(1,5);
		this.taille = randomMinMax(1,5);this.resetPv();
		this.initiative = randomMinMax(1,5);

	}
	
	private void resetPv(){
		this.pdv = 20 + this.poids + this.taille;
	}
	
	private int calculdegats(){
		// calcul les degats de lorque en fonction de ses caracteristiques
		int degat = this.force + this.poids + this.taille + this.arme.getDmg();
		return degat;
	}
	
	private void initPos(Orque o2) {
		this.posX = 5;
		this.posY = 5;
		o2.posX = 10;
		o2.posY = 10;
	}
	
	private boolean ecart(Orque o2) {
		
		if (Math.abs(this.posX - o2.posX) > 1 | Math.abs(o2.posX - this.posX ) > 1 | Math.abs(this.posY - o2.posY) > 1 | Math.abs(o2.posY - this.posY ) > 1  | Math.abs(this.posX - o2.posX) > 1  ) {
		
		return true;
		}
		else {
			return false;
		}
	}
	
	private void deplacement(Orque o2) {
		if(this.ecart(o2)) {
			
			
			
			if(this.ecart(o2)) {
				
			}
			
		}
		
	}

	
	// toString
	public String toString() {
		String ch = "";
		ch = 	"id: " + this.id +
				"\nforce: " + this.force +
				"\npoids: " + this.poids +
				"\ntaille: " + this.taille +
				"\npdv: " + this.pdv +
				"\ninitiative: " + this.initiative +
				"\ndegat: " + this.degat +
				"\narme: " + this.arme.toString();
		
		return ch;
	}
	


	// methodes
		/*----------------------------------------------*/
	
		public static int getnbOrques(){
			return nbOrques;
		}
		
		/*----------------------------------------------*/
		
		public int getid() {
			return this.id;
		}
		
		/*----------------------------------------------*/
		
		private boolean enVie() {
			return this.pdv > 0;
		}
		
		/*----------------------------------------------*/
	
		public static Orque getOrqueById(int ident) {
			return tabOrques[ident];
		}
		
		/*----------------------------------------------*/
	
		public int combat(Orque ennemi){
			this.resetPv();
			ennemi.resetPv();
			this.initPos(ennemi);
			int init1 = this.initiative*10;
			int init2 = ennemi.initiative*10;
			
			while(this.enVie() & ennemi.enVie()) {
			//	if(!this.ecart(ennemi)){
					if ((Orque.randomMinMax(1,100) + init1) > (Orque.randomMinMax(1,100) + init2)){
						this.attaque(ennemi);
					}
					else{
						ennemi.attaque(this);
					}
				}
				/*else{
					this.deplacement(ennemi);
				}*/
			
			
			
			if (this.enVie()) 
				{return this.id;}
			else 
				{return ennemi.id;}
		}
	

		/*----------------------------------------------*/
		
		public void attaque (Orque gethit) {
			if (Orque.randomMinMax(0,100) < this.arme.getProba())
				{
				gethit.pdv -= this.degat;
				}
		}
		
		/*----------------------------------------------*/

		public static int randomMinMax(int min, int max) {
			Random rand = new Random();
			int res = rand.nextInt(max - min + 1) + min;
			assert min <= res && res <= max : "tirage aleatoire hors des bornes";
			return res;
		}	
		
		/*----------------------------------------------*/
}
