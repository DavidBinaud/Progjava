public class TestEE {
	

	public static void main (String args[]){


		EE e1,e2,e3,e4,e5,e6;

		e1 = new EE (15);

		int [] tab1 = {3,6,9,8,11};

		e2 = new EE (10,tab1);

		e3 = new EE (e2);

		int [] tab2 = {3,9,20,8};

		e4 = new EE (10,tab2);

		int []tab3 = {10,25,30};

		int []tab4 = {10,25,48,63};

		e5 = new EE (10,tab3);

		e6 = new EE(10,tab4);

		System.out.println(e4.toString());
		System.out.println("Le cardinal de e1 est: " + e1.getCardinal());
		System.out.println("e2 contient 8: " + e2.contient(8));
		System.out.println("e2 contient 20: " + e2.contient(20));
		System.out.println("Le cardinal de e2 est: " + e2.getCardinal());

		System.out.println(e2.ajoutElt(20));

		System.out.println("Le cardinal de e2 est: " + e2.getCardinal());
		System.out.println("e2 contient 20: " + e2.contient(20));
		System.out.println(e2.toString());
		System.out.println("e1 est vide: " + e1.estVide());

		System.out.println(e2.retraitElt(6));
		System.out.println(e2.toString());
		System.out.println("Le cardinal de e2 est: " + e2.getCardinal());

		System.out.println(e2.retraitElt(15));

		System.out.println("e5 est inclus dans e6: " + e5.estInclus(e6));
		
		System.out.println("e5 est egal à e6: " + e5.EstEgal(e6));

		System.out.println("intersection entre e5 et e6: " + e5.intersection(e6).toString());
		System.out.println("reunion entre e5 et e6: " + e5.reunion(e6).toString());
		System.out.println("difference entre e5 et e6: " + e5.difference(e6).toString());

		System.out.println("e2 et e5 sont disjoints: " + e2.estDisjoint(e5));
	}






}