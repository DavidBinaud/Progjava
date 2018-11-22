public class Voiture {


	private String nom;

	private int position;

	private int sens;

	private int vitesse;

	/*///////////////////////////////////////////////////////////////////////////*/
	public Voiture(String unNom, int uneVitesse){
	/* pr´e-requis : vitesse positive ou nulle
	* action : cr´ee une voiture de nom unNom et de vitesse uneVitesse
	* plac´ee `a l’origine, pr^ete `a partir
	*/
	this.nom=unNom;
	this.vitesse=uneVitesse;
	this.position=0;
	this.sens=1;

	}

	/*///////////////////////////////////////////////////////////////////////////*/
	public String toString(){
	/* r´esultat : retourne une cha^ıne de caract`eres contenant les caract´eristiques
	* de this (sous la forme de votre choix)
	*/
		String ch = "nom: " + this.nom 
				+ "\nposition: " + this.position 
				+ "\nsens: " + this.sens 
				+ "\nvitesse: " + this.vitesse;
		
		
		
 	return ch;
	}

	
	
	/*///////////////////////////////////////////////////////////////////////////*/
	public String toString2(){
	/* r´esultat : retourne une cha^ıne de caract`eres form´ee d’une suite d’espaces
	* suivie de la premi`ere lettre du nom de this, suivie d’un retour
	* `a la ligne, le nombre d’espaces ´etant ´egal `a la position de this.
	*/
	char espace = ' ';
	String nbespace="";

	for (int i=0;i<=this.position;i++){
		nbespace = nbespace + espace;
	}

	return nbespace + this.nom.charAt(0);
	}

	
	/*///////////////////////////////////////////////////////////////////////////*/
	
	
	public String leNom(){
	/* r´esultat : retourne le nom de this */
	return this.nom;
	}



	/*///////////////////////////////////////////////////////////////////////////*/
	
	public boolean depasse(int limite){
	/* r´esultat : retourne vrai si et seulement si la position de this est
	* sup´erieure ou ´egale `a limite
	*/
	return this.position >= limite ;
	}

	
	/*///////////////////////////////////////////////////////////////////////////*/
	
	public void faitDemiTour(){
	/* action : fait faire un demi-tour `a this */
		this.sens = this.sens * -1;
	}

	
	/*///////////////////////////////////////////////////////////////////////////*/
	
	public void avance(){
	/* pr´e-requis : vitesse >= 0
	* action : fait avancer this d’une distance ´egale `a sa vitesse dans son sens de
	* d´eplacement (`a compl´eter)
	*/
		
		this.position = this.position + this.vitesse;
		
		
	}


	/*///////////////////////////////////////////////////////////////////////////*/

	public void accelere(){







	}




	/*///////////////////////////////////////////////////////////////////////////*/

	public int ecart(Voiture v2){
		int distance = this.position - v2.position;
		return distance;
	}











}