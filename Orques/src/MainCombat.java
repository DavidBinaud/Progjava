
public class MainCombat {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		Arene A1,A2;
		
		A1 = new Arene(10,50);
		A2 = new Arene(15,50);

		System.out.println("Arene 1 contient les orques: " + A1.toString());
		System.out.println(A1.nbOrques());
		A1.bataille();
		System.out.println("le gagnant de l'Arene 1 est:  " + A1.toString());
		System.out.println("avec les caractéristiques:\n" + A1.orqueGG());
		System.out.println("Arene 2 contient les orques: " + A2.toString());
		A2.bataille();
		System.out.println("le gagnant de l'Arene 2 est:  " + A2.toString());
		System.out.println("avec les caractéristiques:\n" + A2.orqueGG());


		
		
			
		
		
		
	}

}
