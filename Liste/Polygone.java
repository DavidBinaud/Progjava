import java.awt.Color;
public class Polygone{

	private ListePoints listeP;

	private Color c;


	public Polygone(Point [] lP){
		this.c = new Color(0,0,0);
		this.listeP = new ListePoints(lP);



	}
	
	public Polygone(ListePoints lP,int r,int g,int b){
		this.c = new Color(r,g,b);
		this.listeP = new ListePoints(lP);
		MaillonPoint precedent = null;
		MaillonPoint courant = this.listeP.getTete();
		while(courant != null){
		Trait trait = new Trait(courant.getPoint(),precedent.getPoint(),c.getRed(),c.getGreen(),c.getBlue());
		precedent = courant;
		courant = courant.getSuiv();
		}

	}

}