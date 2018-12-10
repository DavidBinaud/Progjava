public class Liste{
	//attribut
	private Maillon tete;

	//constructeurs
	public Liste(){
		//action: construit une liste vide
		this.tete = null;
	}

	public Liste(int x){
		//action: construit une liste avec un seul élement x
		this.tete = new Maillon(x);
	}

	public Liste(int[] tab){
		//action: construit une liste contennant les valeurs de tab
		Maillon courant;
		this();
		if(tab.length > 0){
			this.tete = new Maillon(tab[0]);
			courant = this.tete;
			for(int i=1; i < tab.length;i++){
				courant.setSuiv(new Maillon (tab[i]));
				courant = courant.getSuiv();
			}
		}
	}

	//Variante 2
	public Liste (int[] tab){
		//action: construit une liste avec les elements de tab
		//stratégie: utilise ajoutTete
		this();
		for(int i = tab.length - 1;i >=0 ; i--){
			this.ajoutTete(tab[i]);
		}
	}

	public void ajoutTete (int x){
		//action: ajoute x en tete de this
		Maillon m = new Maillon(x);
		m.setSuiv(this.tete);
		this.tete = m;
	}

	//Variante 3
	public Liste(int []tab){
		//action: construit une liste contennat les elements de tab
		//stratégie: utilise ajoutFin // Pas efficace
		this();
		for(int i = 0; i < tab.length ; i++){
			this.ajoutFin(tab[i]);
		}
	}

	public void ajoutFin(int x){
		//action: ajoute x en fin de this
		if(this.estVide()){
			this.tete = new Maillon(x); // ou this.ajoutTete
		}
		else{
			Maillon courant = this.tete;
			while(courant.getSuiv() != null){
				courant = courant.getSuiv();
			}
			courant.setSuiv(new Maillon (x));
		}
	}

	public boolean estVide(){
		//resultat: retourne vrai ssi this est vide
		return this.tete == null;
	}


	public int longueur(){
		//resultat: retourne le nb d'elements de this.
		int cpt = 0;
		Maillon courant = this.tete;
		while(courant != null){
			cpt++;
			courant = courant.getSuiv();
		}
		return cpt;
	}


}