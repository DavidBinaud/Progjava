import java.util.Random;
public class Course {

	private Voiture Voiture1;
	
	private Voiture Voiture2;
	
	private int longueur;
	
	

	public Course (Voiture uneVoit1, Voiture uneVoit2, int longueur){
	/* pr´e-requis : longueur > 0 et les voiture doivent exister
	* action : Constructeur d'une course 
	*/
		this.Voiture1 = uneVoit1;
		this.Voiture2 = uneVoit2;
		this.longueur = longueur;
		
	}
	
	
	
	

	public String toString(){
	/* r´esultat : retourne une cha^ıne de caract`eres contenant les caract´eristiques
	* de this (sous la forme de votre choix)
	*/
		
		String ch = "Voiture 1: " + this.Voiture1 
				+ "\n Voiture 2: " + this.Voiture2 
				+ "\n Longueur piste: " + this.longueur ;
		
		
		
 	return ch;
	}
		
		
		
	

	public Voiture deroulement(){
	/* pr´e-requis : this.voit1 et this.voit2 sont sur la ligne de d´epart
	* (`a l’origine), pr^etes `a partir
	* action : simule le d´eroulement d’une course entre this.voit1 et this.voit2
	* sur une piste de longueur this.longueurPiste, en affichant `a chaque
	* ´etape les 2 voitures, repr´esent´ees par la premi`ere lettre de leur
	* nom, `a leur position respective, et retourne la voiture gagnante.
	*/


		Voiture VoitureGagnante = Voiture1;
		while (!this.Voiture1.depasse(this.longueur) & !this.Voiture2.depasse(this.longueur)){
			Ut.clearConsole();
			System.out.print(this.Voiture1.toString2());
			System.out.print("\n" + this.Voiture2.toString2());
			Ut.pause(50);

			if (Randomisationavance() == 1)
				{this.Voiture1.avance();}
			else{this.Voiture2.avance();}
		}
		

		
		
		return VoitureGagnante;
	}
	
	
	
	public static int Randomisationavance() {
		// Resultat : un entier entre min et max choisi aleatoirement
		
		Random rand = new Random();
		int res = 1 + rand.nextInt(2);

		return res;    
		
	}
	
	
	
	
}