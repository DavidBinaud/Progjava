public class Arene {

	private EE ensOrques;
	
	public Arene(int nbo) {
		this.ensOrques = new EE(nbo);

		for(int i = 0; i < nbo ; i++) {
			Orque orc = new Orque(this);
			this.ensOrques.ajoutElt(orc.Getid());
		}
	}
	
	
	
	public void bataille() {
		Orque Orq1;
		Orque Orq2;
		

		while(ensOrques.getCardinal() != 1){
		Orq1 = Orque.getOrqueById(this.ensOrques.selectEltAleatoirement());
		Orq2 = Orque.getOrqueById(this.ensOrques.selectEltAleatoirement());
		ensOrques.ajoutElt(Orq1.Combat(Orq2));
		}
	}



	public int nbOrques(){
		return Orque.GetnbOrques();
	}

	public String toString(){
		return ensOrques.toString();
	}
	
	
}

