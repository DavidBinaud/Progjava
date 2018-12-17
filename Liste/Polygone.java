import java.awt.Color;
public class Polygone{

	private ListePoints listeP;

	private Color c;


	public Polygone(Point [] lP){
		Fenetre.createFenetre(1000, 900, "Ma fenetre");
		this.c = new Color(0,0,0);
		this.listeP = new ListePoints(lP);



	}

}