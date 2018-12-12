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

    
    public int somme(){
        //resultat: somme des elements de this
        int som = 0;
        Maillon courant =this.tete;
        while(courant != null){
            som += courant.getVal();
            courant = courant.getSuiv();
        }
    }
    
    
    public int dernierElt(){
        //prerequis: this est non vide
        //resultat: renvoie la valeur du dernier element de la liste this
        Maillont courant = this.tete;
        while(courant.getSuiv() != null){
            courant = courant.getSuiv();
        }
        return courant.getVal();
    }
    
    
    public boolean estSupK(int k){
        // prerequis: k est un entier positif
        // resultat: vrai ssi la longueur de la liste this est superieure a k
        return this.longueur() > k ;
    }
    
    public boolean estSupKBis(int k){
        //prerequis: k est un entier positif
        //resultat: vrai ssi la longueur de la liste this est superieure a k
        
    }
    
    public boolean estLgPaire(){
    //resultat: vrai ssi la liste this possede un nombre paire d elt'
    return this.longueur() div 2 == 0;
    }
    
    public int valMax(){
        //prerequis: la liste this est non vide
        //resultat: la valeur maximum des elt de this
        Maillon courant = this.tete;
        int max = courant.getVal();
        while(courant != null){
            if (courant.getVal() > max]{
                max = courant.getVal();
            }
            courant = courant.getSuiv();
        }
        return int max;
    }
    
    public int nbX (int x){
        Maillon courant = this.tete;
        int nbx = 0;
        while(courant != null){
            if(courant.getVal() = x){
                nbx++;
            }
            courant = courant.getSuiv();
        }
        return nbx;
    }
    
    public void ajoutFinSiAbsent(int n){
        //action: ajoute un entier de valeur n comme dernier element de la liste this au cas ou la liste ne possede pas deja un element valabt n
        if(this.nbX > 0){
            this.ajoutFin(n);
        }
    }
    
    public Liste extractionImpairs(){
        //resultat: une nouvelle liste contenant les valeurs impairs de this dans chacun des deux cas suivants: a) lordre des elements de la liste retournee na pas dimportance b) lordre doit etre le meme que dans this 
        
    }
    
    public void suprElt(int n){
        //action:supprime de la liste this la premiere occurence de lentier n
        //strat:parcours partiel
        Maillon courant = this.tete;
        boolean supr = false;
        while(courant != null && !supr){
            if(courant.getVal() == n){
                courant.setVal()=null;
            }
            else(courant = courant.getSuiv();
        }
    }

}
