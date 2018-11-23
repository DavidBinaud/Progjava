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
        str = strEE.split(",");
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
        int i = -1;
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
    
    
    /*private int retraitPratique(int x){
    //p_r: 0 <= i <= this.cardinal
    //resultat: supprime this.ensTab[i] de l'ensemble courant et le renvoie
    //strategie: utilise la methode contientPratique
        
        return
    }*/


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
    //resultat: renvoi true ssi x est appartient a this et est retiré de this, sinon renvoie false
    //strategie: utilise la methode contientPratique,deborde et retraitPratique
    
    if(!this.contient(x)){
        return false;
    }
    else if (this.deborde()){
        return false;
    }
        else{
            int i = this.contientPratique(x);
            this.ensTab[i] = this.ensTab[i] + this.ensTab[this.cardinal];
            this.ensTab[this.cardinal] = this.ensTab[i] - this.ensTab[this.cardinal];
            this.ensTab[i] = this.ensTab[i] - this.ensTab[this.cardinal];
            this.cardinal--;
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
        int i,k;
        i = 0;k=0;
        while(i < this.cardinal){
            while (k < e2.cardinal){
                if (this.ensTab[i] == e2.ensTab[k]){
                    i++;
                }

                k++;
            }
            i++;
            k=0;
        }


        return i == this.cardinal & k == e2.cardinal;
    }
    


}