public class Arene {

	private EE ensOrques;
	
	private int taille;
	
	public Arene(int nbo,int x) {
		this.taille = x;
		
		this.ensOrques = new EE(nbo);
		
		for(int i = 0; i < nbo*2 ; i++) {
		new Arme();}
		for(int i = 0; i < nbo ; i++) {
			Orque orc = new Orque(this);
			
			this.ensOrques.ajoutElt(orc.getid());
		}
	}
	
	
	
	public void bataille() {
		Orque orq1;
		Orque orq2;
		

		while(ensOrques.getCardinal() > 1){
		orq1 = Orque.getOrqueById(this.ensOrques.selectEltAleatoirement());
		orq2 = Orque.getOrqueById(this.ensOrques.selectEltAleatoirement());
		this.ensOrques.ajoutElt(orq1.combat(orq2));
		}
	}

	public int getTaille() {
		return this.taille;
	}

	public int nbOrques(){
		return Orque.getnbOrques();
	}

	public String toString(){
		//affichage de lArene en utilisant Fenetre , des Orques en utilisant Point, du contour arene avec Ttrait
		return this.ensOrques.toString();
	}
	
	public String orqueGG() {
		return Orque.getOrqueById(this.ensOrques.selectEltAleatoirement()).toString();
	}
}

