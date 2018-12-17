import java.awt.Color;
public class Polygone{

	private ListePoints listeP;

	private Color c;


	public Polygone(Point [] lP){
		this.c = new Color(0,0,0);
		this.listeP = new ListePoints(lP);



	}
	
	public Polygone(ListePoints lP){
		this.c = new Color(0,0,0);
		this.listeP = new ListePoints(lP);
		Trait trait = new Trait(listeP.getTetePoint(),listeP.getDernierPoint(),5,6,9);

	}

}