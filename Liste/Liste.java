
public class Liste {

    private Maillon tete; 

    private int longueur;

    private Maillon dernier;

    /** Constructeur d'une liste vide
     */
    public Liste () {
    this.tete = null;
    this.longueur = 0;
    this.dernier = null;
    }

    /** Constructeur d'une liste a un seul element
     */
    public Liste (int x) { 
        this.tete=new Maillon(x);
        this.longueur =1;
        this.dernier = this.tete;
    }
    
  /** @param tabListe est un tableau contenant les elements de la liste
     * Pre-requis : aucun
     */
    public Liste (int[] tabListe) {
	this(); 
	if (tabListe.length > 0) {
	    this.tete = new Maillon (tabListe[0]);
	    Maillon curThis = this.tete;
	    this.longueur++;
	    for (int i = 1 ; i < tabListe.length ; i++) {
		curThis.setSuiv (new Maillon(tabListe[i])); // creation et accrochage du maillon suivant
		curThis = curThis.getSuiv();
		this.longueur++;
	    }
	   	this.dernier = curThis;
	}
    }

   /**
     * Prerequis: aucun
     * construit une liste completement disjointe de la liste l 
     */
    public Liste (Liste l) { // constructeur par recopie profonde
	this(); 
	if (! l.estVide()) {

	    this.tete = new Maillon (l.tete.getVal());
	    Maillon curThis = this.tete;
	    Maillon curL = l.tete.getSuiv();
	    this.longueur++;

	    while (curL != null) {
		curThis.setSuiv (new Maillon(curL.getVal())); // creation et accrochage du maillon suivant
		curThis = curThis.getSuiv();
		curL = curL.getSuiv();
		this.longueur++;
	    }
	    this.dernier = curThis;
	}
    }

    public boolean estVide() {
	return (this.tete == null) ;
    }

    public void ajoutTete (int x) {
	Maillon m = new Maillon(x);
	m.setSuiv(this.tete);
	this.tete=m;
	this.longueur++;
    }

    public boolean contient (int x) {
	Maillon courant = this.tete;
	while (courant != null && courant.getVal() != x) {
	    courant = courant.getSuiv(); 
	}
	return courant != null;
    }

    public String toString() {
	String s = "(";
	Maillon courant = this.tete;
	while (courant != null) {
	    s = s + (courant.getVal()) + ((courant.getSuiv() != null)?", ":"");
	    courant = courant.getSuiv();
	}
	return s + ")";
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
        return som;
    }


    public int dernierElt(){
        //prerequis: this est non vide
        //resultat: renvoie la valeur du dernier element de la liste this
        Maillon courant = this.tete;
        while(courant.getSuiv() != null){
            courant = courant.getSuiv();
        }
        return courant.getVal();
    }

    public int dernierEltBis(){
    	return this.dernier.getVal();
    }


    public boolean estSupK(int k){
        // prerequis: k est un entier positif
        // resultat: vrai ssi la longueur de la liste this est superieure a k
        return this.longueur() > k ;
    }



    public boolean estSupKBis(int k){
        //prerequis: k est un entier positif
        //resultat: vrai ssi la longueur de la liste this est superieure a k
        int cpt = 0;
        Maillon courant = this.tete;
        while(courant != null & cpt < k){
            cpt++;
            courant = courant.getSuiv();
        }
        return cpt >= k;
    }




     public boolean estLgPaire(){
    //resultat: vrai ssi la liste this possede un nombre paire d elt'
    return this.longueur() % 2 == 0;
    }

    public boolean estLgPaireBis(){
    	return this.longueur % 2 == 0;
    }



    public int valMax(){
        //prerequis: la liste this est non vide
        //resultat: la valeur maximum des elt de this
        Maillon courant = this.tete;
        int max = courant.getVal();
        while(courant != null){
            if (courant.getVal() > max){
                max = courant.getVal();
            }
            courant = courant.getSuiv();
        }
        return max;
    }


    public int nbOccurence(int x){
        Maillon courant = this.tete;
        int nbx = 0;
        while(courant != null){
            if(courant.getVal() == x){
                nbx++;
            }
            courant = courant.getSuiv();
        }
        return nbx;
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

	public void ajoutFinBis(int x){
		if(this.estVide()){
			this.tete = new Maillon(x);
		}
		else{
			Maillon courant = this.dernier;
			courant.setSuiv(new Maillon(x));
		}

	}


	public void ajoutFinSiAbsent(int n){
        //action: ajoute un entier de valeur n comme dernier element de la liste this au cas ou la liste ne possede pas deja un element valabt n
        if(!this.contient(n)){
            this.ajoutFin(n); // this.ajoutFinBis(n);
        }
    }


    public Liste extractionImpairs(){
        //resultat: une nouvelle liste contenant les valeurs impairs de this dans chacun des deux cas suivants: a) lordre des elements de la liste retournee na pas dimportance b) lordre doit etre le meme que dans this 
        Maillon courant = this.tete;
        Liste l2 = new Liste();
        while(courant != null){
            if(courant.getVal() % 2 != 0){
                l2.ajoutFin(courant.getVal());
            }
            courant = courant.getSuiv();
        }
        return l2;
    }

     public Liste extractionImpairsBis(){
        //resultat: une nouvelle liste contenant les valeurs impairs de this dans chacun des deux cas suivants: a) lordre des elements de la liste retournee na pas dimportance b) lordre doit etre le meme que dans this 
        Maillon courant = this.tete;
        Liste l2 = new Liste(this);
        while(courant != null){
            if(courant.getVal() % 2 == 0){
                l2.suprElt(courant.getVal());
            }
            courant = courant.getSuiv();
        }
        return l2;
    }


     public void suprElt(int n){
        //action:supprime de la liste this la premiere occurence de lentier n
        //strat:parcours partiel
        Maillon precedent = null;
        Maillon courant = this.tete;
        boolean supr = false;
        while(courant != null && !supr){
            if(courant.getVal() == n){
                if(courant != this.tete){ precedent.setSuiv(courant.getSuiv());}
                else{ this.tete = courant.getSuiv();}
                supr = true;
            }
            else{
                precedent = courant;
                courant = courant.getSuiv();
                    
                    
                
            }
        }
    }

    public void troncK(int n){
        Maillon courant = this.tete;
        int i = 1;
        while (courant != null){
            if(i < n){
                courant = courant.getSuiv();
            }
            else{
                courant.setSuiv(null);
            }
            i++;
        }

    }



    public boolean Clones(Liste L2){
        Maillon courant = this.tete;
        Maillon courantL2 = L2.tete;
        boolean same = true;
        while( courant != null & courantL2 != null & same){
            if(courant.getVal() == courantL2.getVal()){
                courant = courant.getSuiv();
                courantL2 = courantL2.getSuiv();
            }
            else{
                same = false;
            }
        }
        return same;
    }

    public Liste inverse(){
        //resultat: une nouvelle liste contenant les éléments de this dans l'ordre inverse
        Maillon courant= this.tete;
        Liste L2 = new Liste();
        while(courant != null){
            L2.ajoutTete(courant.getVal());
            courant = courant.getSuiv();
        }
        return L2;
    }

    public void suppToutesOcc(int n){
        //action: supprime de la liste this toutes les occurrences d'un entier n.
        int nombre = this.nbOccurence(n);
        while(nombre > 0){
            this.suprElt(n);
            nombre--;
        }
    }


    public boolean sousListe(Liste l){
    	//resultat: renvoie vrai ssi This est un sous ensemble de l (sous liste consécutive)
    	Maillon courant = this.tete;
        Maillon courantL2 = l.tete;
        boolean sousL = false;
        while( courant != null & courantL2 != null & !sousL){
            if(courant.getVal() == courantL2.getVal()){
               sousL = this.appartientListe(courantL2);
            }
            else{
                courantL2 = courantL2.getSuiv();
            }
        }
        return sousL;
    }


    public boolean appartientListe(Maillon m){
        Maillon courant = this.tete;
        Maillon courantM = m;
        while(courant != null & courantM != null){
            if(courant.getVal() == courantM.getVal()){
                courant = courant.getSuiv();
                courantM = courantM.getSuiv();
            }
          
        }

        return courant == null;
    }



    

} // end class
