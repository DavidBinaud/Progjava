public class Maillon{
	// attributs

	private int valeur;

	private Maillon suivant;



	//constructeurs

	public Maillon(int x){
		//action:construit un Maillon de valeur x
		this.valeur = x;
		this.suivant = null;
	}

	//méthodes
	public int getVal(){
		return this.valeur;
	}

	public Maillon getSuiv(){
		return this.suivant;
	}

	public void setVal(int x){
		this.valeur = x;
	}

	public void setSuiv(Maillon m){
		//action: this.suivant prends le maillon
		this.suivant = m;
	}
}