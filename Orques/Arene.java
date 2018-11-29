public class Arene {

	private EE ensOrques;
	
	public Arene(int nbo) {
		
		this.ensOrques = new EE(nbo);
		for(int i=0; i < nbo ; i++) {
			this.ensOrques[i]=i;
		}
		
		for(int k = Orque.nbOrques; k <Orque.nbOrques + nbo; k++) {
			 Orques.tabOrques[k] = k;
		}
		Orque.nbOrques == Orque.nbOrques + nbo;
		
		
	}
	
	
	
	public void bataille(EE ensOrk) {
		
	}
	
	
}

