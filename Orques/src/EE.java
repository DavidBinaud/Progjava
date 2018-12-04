public class EE{
	    
		// attribut ou variable dinstance
		    private int[] ensTab;

		    private int cardinal;

		//////Constructeur////////////////////////////////////////////////////////////////////////////////////////////
		   
		    public EE(int max){
		    //p_r:max>0
		    //action: construit un ensemble vide pouvant contenir au maximum max delements
		        this.ensTab = new int [max];
		        this.cardinal=0;
		        
		    }
		    
		////////////////////////////////////////////////////////////////////////////////////////////
		    
		    /*   public EE(int max, int[] t){
		            //p_r:les valeurs de tab sont distinctes et t.length <= max
		            //action: cree un ensemble contenant les valeurs de t et pouvant contenir au maximum max delements
		                this(max);
		            
		                for(int i=0; i < t.length; i++){
		                    this.ajoutPratique(t[i]);
		                }

		            }
		    */
		    
		////////////////////////////////////////////////////////////////////////////////////////////
		  
		    public EE(int max,int[] t){
		    //p_r: aucun
		    //action: cree un ensemble contenant les valeurs distinctes de t et pouvant contenir au maximum max delements, si t contient plus de max elements seules les max premieres valeurs sont mises dans this
		    //strategie: utilise la methode ajoutElt et pp de t
		        this(max);
		        int i=0;
		        
		        while (i<t.length & !this.deborde()){
		            this.ajoutElt(t[i]);
		            i++;
		        
		        }
		    }
		    
		////////////////////////////////////////////////////////////////////////////////////////////
		    
		    public EE(EE e){
		    //p_r: aucun
		    //action:cree un ensemble par recopie
		        this(e.ensTab.length);
		        for(int i=0; i < this.ensTab.length; i++){
		            this.ensTab[i] = e.ensTab[i];
		        }
		        this.cardinal = e.cardinal;
		    }
		////////////////////////////////////////////////////////////////////////////////////////////  
		    
		    public EE(String strEE,int max){
		    //p_r: aucun
		    //action: cree un ensemble a partir dune chaine de caractere
		        this(max);
		        String str[];
		        str = strEE.split(" ");
		        for(int i=0; i < str.length; i++){
		            this.ensTab[i] = Integer.parseInt(str[i]);
		            this.cardinal++;
		        }
		        
		    }



		// Methodes////////////////////////////////////////////////////////////////////////////////////////////
		    
		    public String toString(){
		    //p_r: aucun
		    //resultat: renvoie une chaine de caractere representant un ensemble du type '{n1,n2...nk}'
		        char virgule = ',';
		        String ch = "";
		        for(int i=0; i < this.cardinal; i++){
		           if(i < this.cardinal -1) {
		        	   ch = ch + this.ensTab[i] + virgule;
		           }
		           else {
		        	   ch = ch + this.ensTab[i];
		           }
		        }
		    
		         return "{" + ch + "}";
		    }


		////////////////////////////////////////////////////////////////////////////////////////////

		    public int getCardinal(){
		    //p_r:aucun
		    //resultat:
		        return this.cardinal;
		        
		    } 


		////////////////////////////////////////////////////////////////////////////////////////////

		    private int contientPratique(int x){
		    //p_r: aucun
		    //resultat: renvoie -1 si x nest pas dans this sinon renvoie la position courante de x dans this(indice de ensTab)
		    //strategie: parcours partiel
		        int i = 0;
		        int contient = -1;
		        while (i < this.cardinal & contient == -1){
		            i++;
		            if(this.ensTab[i] == x){
		                contient = i;
		            }
		            
		        }
		        
		        return contient;
		    }



		////////////////////////////////////////////////////////////////////////////////////////////
		   
		       public boolean contient(int x){
		    //p_r:aucun
		    //resultat: retourne vrai ssi x est deja dans this
		        return this.contientPratique(x) != -1;
		    }
		   

		////////////////////////////////////////////////////////////////////////////////////////////
		   
		    private void ajoutPratique(int x){
		    //p_r: nappartient pas a this.ensTab et this.cardinal < this.ensTab.length
		    //action: ajoute x a this
		    	
		        this.ensTab[this.cardinal] = x;
		        this.cardinal++;
		      
		        
		        
		    }
		    
		    

		  ////////////////////////////////////////////////////////////////////////////////////////////
		    
		    
		    private int retraitPratique(int i){
		    //p_r: 0 <= i <= this.cardinal
		    //resultat: supprime this.ensTab[i] de l'ensemble courant et le renvoie
		    //strategie:
		        int k = this.ensTab[i] ;
		        
		        this.ensTab[i] = this.ensTab[this.cardinal-1];

		        this.cardinal--;
		        return k;
		    }


		//////////////////////////////////////////////////////////////////////////////////////////// 
		   
		       public boolean estVide(){
		    //p_r:aucun
		    //resultat: renvoie vrai ssi this est vide
		        return this.cardinal == 0;
		    }
		    
		    
		//////////////////////////////////////////////////////////////////////////////////////////// 

		    public boolean deborde(){
		    //p_r:aucun
		    //resultat: retourne vrai ssi this.ensTab est plein
		        return this.ensTab.length == this.cardinal;
		    }
		    




		//////Methodes Calcul//////////////////////////////////////////////////////////////////////////////////////
		    
		    public boolean retraitElt(int x){
		    //p_r:aucun
		    //resultat: renvoi true ssi x est appartient a this et est retire de this, sinon renvoie false
		    //strategie: utilise la methode contientPratique,deborde et retraitPratique
		    int i = this.contientPratique(x); 
		    if(i == -1){
		        return false;
		    }
		    else{

		           this.retraitPratique(i);
		            return true;
		        }
		        
		    }




		//////////////////////////////////////////////////////////////////////////////////////////// 

		    public int ajoutElt(int x){
		    //p_r:aucun
		    //resultat: retourne -1 si x nest pas dans this et this est plein ,msinon si x est deja dans this retourne 0 sinon ajoute x a this et retourne 1
		    //strategie: utilise la methode contient,deborde et ajoutPratique
		    
		        if(this.contient(x)){
		            return 0;
		        }
		        else if (this.deborde()){
		            return -1;
		        }
		            else{
		                this.ajoutPratique(x);
		                return 1;
		            }
		        }



		//////////////////////////////////////////////////////////////////////////////////////////// 


		    public boolean estInclus(EE e2){
		        //p-r: aucun
		        //resultat: renvoie true ssi this est inclus dans e2, renvoie false sinon
		        //strategie: utilise contientPratique et une boucle while
		        int i = 0;
		            if ( this.cardinal > e2.cardinal){
		                return false;
		            }
		            else{
		                while (i < this.cardinal && e2.contient(this.ensTab[i])){

		                i++;
		                }

		               return i == this.cardinal;
		            }

		    }
		    




		//////////////////////////////////////////////////////////////////////////////////////////// 
		    

		    public boolean EstEgal(EE e2){
		        //p-r: aucun
		        //resultat: renvoie true ssi this est egal a e2
		        

		        return this.cardinal == e2.cardinal && this.estInclus(e2);
		           
		        }

		////////////////////////////////////////////////////////////////////////////////////////////   

		    public boolean estDisjoint(EE e2){
		    //p_r: aucun
		    //resultat: renvoi vrai ssi this et e2 n'ont aucun elements en commun
		        boolean Disjoint = true;
		        int i = 0;
		        while(i < this.cardinal & Disjoint){
		            if(e2.contient(ensTab[i])){
		                Disjoint = false;
		            }

		            i++;
		        }




		        return Disjoint;
		    }


		////////////////////////////////////////////////////////////////////////////////////////////
		    public EE intersection(EE e2){
		    //p_r: EER.lengt == au cardinal le plus petit
		    //resultat: renvoie un rnsemble qui contient les element contenu a la fois dans this et dans e2
		    //strategie: utilise contient
		        EE e3 = new EE (this.cardinal);

		        for(int i = 0; i < this.cardinal; i++){
		           
		            if(e2.contient(this.ensTab[i])){
		                e3.ajoutPratique(this.ensTab[i]);
		                }
		        }


		    return e3;

		    }

		 ////////////////////////////////////////////////////////////////////////////////////////////   

		    public EE reunion (EE e2){
		        EE e3 = new EE (this.cardinal+e2.cardinal);

		        for (int i = 0; i < this.cardinal ;i++){
		            e3.ajoutPratique(this.ensTab[i]);
		        }

		        for (int k =0; k < e2.cardinal ;k++){
		            if(!e3.contient(e2.ensTab[k])){
		            e3.ajoutPratique(e2.ensTab[k]);}
		        }


		        return e3;
		    }

		////////////////////////////////////////////////////////////////////////////////////////////
		    public EE difference(EE e2){
		        EE e3 = (this);
		        EE intersection = (this.intersection(e2));

		        for(int i = 0; i < intersection.cardinal; i++){
		            e3.retraitElt(intersection.ensTab[i]);
		        }

		            



		        return e3;
		    }
		////////////////////////////////////////////////////////////////////////////////////////////
		    public int selectEltAleatoirement() {
		    	// Pre-requis : ensemble this est non vide
		    	// Resultat/action : enleve un element de this (aleatoirement)
		    	// et le retourne
		    	int i = Ut.randomMinMax(0, this.cardinal - 1);
		    	int select = this.retraitPratique(i);
		    	return select;
		    	}
		    
		    
		    
		}


