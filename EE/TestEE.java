public class TestEE {
	

	public static void main (String args[]){


		EE e1,e2,e3,e4;

		e1 = new EE (15);

		int [] tab1 = {3,6,9,8,11};

		e2 = new EE (10,tab1);

		e3 = new EE (e2);

		e4 = new EE ("5,2,4,7,8,9",15);

		System.out.println(e4.toString());
		System.out.println("Le cardinal de e1 est: " + e1.getCardinal());
		System.out.println("e2 contient 8: " + e2.contient(8));
		System.out.println("e2 contient 20: " + e2.contient(20));
		System.out.println("Le cardinal de e2 est: " + e2.getCardinal());
		System.out.println(e3.ajoutElt(20));
		System.out.println("Le cardinal de e2 est: " + e2.getCardinal());
		System.out.println("e2 contient 20: " + e2.contient(20));
		System.out.println(e2.toString());
		System.out.println("e1 est vide: " + e1.estVide());
	
	}






}