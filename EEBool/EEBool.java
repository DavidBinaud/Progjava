public class EEBool{

	private int cardinal;

	private boolean [] ensTabB;

	//////Constructeur////////////////////////////////////////////////////////////////////////////////////////////
		   
		    public EEBool(int max){
		    //p_r:max>0
		    //action: construit un ensemble vide pouvant contenir au maximum max delements
		        this.ensTabB = new boolean [max];
		        this.cardinal=0;
		        
		    }
		    
		////////////////////////////////////////////////////////////////////////////////////////////
		    
		    /*   public EEBool(int max, int[] t){
		            //p_r:les valeurs de tab sont distinctes et t.length <= max
		            //action: cree un ensemble contenant les valeurs de t et pouvant contenir au maximum max delements
		                this(max);
		            
		                for(int i=0; i < t.length; i++){
		                    this.ajoutPratique(t[i]);
		                }

		            }
		    */
		    
		////////////////////////////////////////////////////////////////////////////////////////////
		  
		    public EEBool(int max,boolean [] t){
		    //p_r: aucun
		    //action: cree un ensemble contenant les valeurs distinctes de t et pouvant contenir au maximum max delements, si t contient plus de max elements seules les max premieres valeurs sont mises dans this
		    //strategie: utilise la methode ajoutElt et pp de t
		        this(max);
		        int i=0;
		        
		        while (i<t.length){
		            this.ensTabB[i] = t[i];
		            i++;
		        
		        }
		    }
		    
		////////////////////////////////////////////////////////////////////////////////////////////
		    
		    public EEBool(EEBool e){
		    //p_r: aucun
		    //action:cree un ensemble par recopie
		        this(e.ensTabB.length);
		        for(int i=0; i < this.ensTabB.length; i++){
		            this.ensTabB[i] = e.ensTabB[i];
		        }
		        this.cardinal = e.cardinal;
		    }

		// Methodes////////////////////////////////////////////////////////////////////////////////////////////
		    
		    public String toString(){
		    //p_r: aucun
		    //resultat: renvoie une chaine de caractere representant un ensemble du type '{n1,n2...nk}'
		        char virgule = ',';
		        String ch = "";
		        for(int i=0; i < this.cardinal; i++){
		           if(i < this.cardinal -1) {
		        	   ch = ch + this.ensTabB[i] + virgule;
		           }
		           else {
		        	   ch = ch + this.ensTabB[i];
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









}