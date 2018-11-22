public class EE{
    
// attribut ou variable dinstance
    private int[] ensTab;

    private int cardinal;

    //Constructeur
    public EE(int max){
    //p_r:max>0
    //action: construit un ensemble vide pouvant contenir au maximum max delements
        ensTab = new int [max];
        this.cardinal=0;
        
    }
    
    
    public EE(int max, int [] t){
    //p_r:les valeurs de tab sont distinctes et t.length <= max
    //action: cree un ensemble contenant les valeurs de t et pouvant contenir au maximum max delements
        this.(max);
    
        for(int i=0; i < t.length; i++){
            this.ajoutPratique(t[i]);
        }

    }
    
    

    public EE(int max,int [] t){
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
    
    
    
    public EE(EE e){
    //p_r: aucun
    //action:cree un ensemble par recopie
        this(e.ensTab.length);
        for(int i=0; i < this.ensTab.length; i++){
            this.ensTab[i] = e.ensTab[i];
        }
        this.cardinal = e.cardinal;
    }
    
    
    public EE(int max,String str){
    //p_r: aucun
    //action: cree un ensemble a partir dune chaine de caractere
        this(max);
        str [] = str.parse(',');
        for(int i; i< str.length; i++){
            this.ensTab[i] = str[i];
            this.cardinal++;
        }
        
    }



// methodes
    
    private void ajoutPratique(int x){
    //p_r: nappartient pas a this.ensTab et this.cardinal < this.ensTab.length
    //action: ajoute x a this
        this.ensTab[this.cardinal] = x;
        this.cardinal++;
        
        
    }



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
    
    
    
    public boolean deborde(){
    //p_r:aucun
    //resultat: retourne vrai ssi this.ensTab est plein
        return this.ensTab.length == this.cardinal;
    }
    
    
    public boolean contient(int x){
    //p_r:aucun
    //resultat: retourne vrai ssi x est deja dans this
        return this.contientPratique(x) != -1;
    }
    
    public String toString(){
    //p_r: aucun
    //resultat: renvoie une chaine de caractere representant un ensemble du type '{n1,n2...nk}'
        char virgule = ',';
        String ch = "";
        for(int i=0; i < this.cardinal - 1; i++){
            ch = ch + this.ensTab[i] + virgule;
        }
        
        
        return "{" + ch + "}";
    }
    
    
    public int getCardinal(){
    //p_r:aucun
    //resultat:
        return this.cardinal;
        
    }
    
    
    private int contientPratique(int x){
    //p_r: aucun
    //resultat: renvoie -1 si x nest pas dans this sinon renvoie la position courante de x dans this(indice de ensTab)
    
        
        
    }
    
    private int retraitPratique(int x){
    //p_r:aucun
    //resultat:
    //strategie: utilise la methode contientPratique
        
        
    }
    
    public boolean estVide(){
    //p_r:aucun
    //resultat: renvoie vrai ssi this est vide
        return this.cardinal ==0;
    }
    
    
}
