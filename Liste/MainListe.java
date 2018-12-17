
public class MainListe {

    public static void main (String args[]) {


    clearConsole();

	Liste L1 = new Liste(3);
	L1.ajoutTete(2);
	L1.ajoutTete(6);

	System.out.println("2 appartient a L1 ? " + L1.contient(2));

	int[] tab = {-3, -8, 5, 6, 8, 2,6};
	Liste L2 = new Liste (tab);

	Liste Lvide = new Liste();
	System.out.println("1 appartient Lvide ? " + Lvide.contient(1));

	Liste L2copie = new Liste(L2);

	System.out.println("L1 = " + L1); 
	System.out.println("L2 = " + L2);
	System.out.println("Lvide = " + Lvide);
	System.out.println("L2copie = " + L2copie);
	L2copie.ajoutFin(15);
	L2copie.ajoutFinSiAbsent(15);
	L2copie.ajoutFin(44);
	System.out.println("L2copie = " + L2copie);

	System.out.println("Longueur de L1 = " + L1.longueur());
	System.out.println("Longueur de L2 = " + L2.longueur());

	System.out.println("Somme des elts de L1 = " + L1.somme());
	System.out.println("Somme des elts de L2 = " + L2.somme());

	System.out.println("Maximum de L1 = " + L1.valMax());
	System.out.println("Maximum de L2 = " + L2.valMax());

	System.out.println("Dernier Element de L1 = " + L1.dernierElt());
	System.out.println("Dernier Element de L2 = " + L2.dernierElt());
	System.out.println("Dernier Element de L2 = " + L2.dernierEltBis());

	System.out.println("Nombre d'element de L1 supérieur à 5: " + L1.estSupK(5));
	System.out.println("Nombre d'element de L2 supérieur à 5: " + L2.estSupK(5));

	System.out.println("BIS: Nombre d'element de L1 supérieur à 5: " + L1.estSupKBis(5));
	System.out.println("BIS: Nombre d'element de L2 supérieur à 5: " + L2.estSupKBis(5));

	System.out.println("L1 longueur Paire: " + L1.estLgPaire());
	System.out.println("L1 longueur Paire: " + L1.estLgPaireBis());
	System.out.println("impairs de L2 Longueur paire: " + L2.extractionImpairs().estLgPaire());
	System.out.println("L2 Longueur paire: " + L2.estLgPaireBis());

	
	System.out.println("Nombre d'occurence de 2 dans L1: " + L1.nbOccurence(2));
	System.out.println("Nombre d'occurence de 6 dans L2: " + L2.nbOccurence(6));

	System.out.println("Impairs de L2: " + L2.extractionImpairs().toString());

	Liste L2Impair = new Liste (L2.extractionImpairs());
	L2Impair.suprElt(5);
	System.out.println("impairs de L2 - le premier 5" + L2Impair.toString());
	// ...
	int[] tab3 = {-3, -3, -8, -3, -3, 6, -3, 5, -3, 8, -3}; 
	Liste L3 = new Liste (tab3);
	System.out.println("L3 = " + L3);

	L3.suprElt(6);
	System.out.println("suppression de 6 dans L3" + L3.toString());

	L3.troncK(4);
	System.out.println("troncation de L3 après le 4ème élément: " + L3.toString());
	System.out.println("L2 et L3 clones? " + L2.Clones(L3));
	System.out.println("inverse de L3:" + L3.inverse().toString());


	System.out.println("Impair de L3" + L3.extractionImpairsBis().toString());
	L3.suppToutesOcc(-3);  
	System.out.println("SuppToutesOcc de -3 dans L3 = " + L3.toString());

	
	 int[] tab6 = {8, 8, 6}; 
	 Liste L6 = new Liste (tab6);
	 int[] tab7 = {1, 5, 8, 8, 4, 6, 8, 6, 4}; 
	 Liste L7 = new Liste (tab7);
	 System.out.println("L6 = " + L6 + " L7 = " + L7 + " Sous Liste ? "  + L6.sousListe(L7));

	 int[] tab8 = {8, 8, 6}; 
	 Liste L8 = new Liste (tab8);
	 int[] tab9 = {1, 5, 8, 8, 4, 6, 8, 8, 6, 4}; 
	 Liste L9 = new Liste (tab9);
	 System.out.println("L8 = " + L8 + " L9 = " + L9 + " Sous Liste ? " + L8.sousListe(L9));
    }


    public static void clearConsole () {
	// Action : efface la console (le terminal)
	System.out.print("\033[H\033[2J");
    }

}
