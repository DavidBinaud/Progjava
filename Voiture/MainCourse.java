public class MainCourse { 
	public static void main(String args[]){
	
		Voiture v1,v2;
		Course c1;


		v1 = new Voiture ("Titi",2);
		v2 = new Voiture ("Poto",1);

		c1 = new Course (v1,v2,15);

		System.out.println("\nLa voiture qui a gagné est: " + c1.deroulement().leNom());



	
	}
}