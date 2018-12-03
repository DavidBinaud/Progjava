
public class MainCombat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arene A1,A2;
		
		A1 = new Arene(10);
		A2 = new Arene(15);

		System.out.println(A1.nbOrques());
		A1.bataille();
		System.out.println(A1.toString());
		A2.bataille();
		System.out.println(A2.toString());
		
		
			
		
		
		
	}

}
