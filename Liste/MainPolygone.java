public class MainPolygone{




	public static void main(String  args[]){


		Fenetre.createFenetre(1000, 900, "Ma fenetre");
		Point j = new Point(100,100); // Creation d'un point en position (100,100)
		Point t = new Point(200,100);
		Point u = new Point(200,200);
		Point i = new Point(300,100);
		Point o = new Point(200,400);
		Point k = new Point(500,200);
		clearConsole();
		Point [] tabP = new Point [] {j,t,u,i,o,k};
		ListePoints lP= new ListePoints(tabP);
		Polygone p1 = new Polygone(lP,0,0,0);





	}
 




	 public static void clearConsole () {
			// Action : efface la console (le terminal)
			System.out.print("\033[H\033[2J");
		    }

}