import java.util.Random;

public class Arme {

	private static String [] tabNomsArmes = {"hachette","epee","lance","fleau","hache","halebarde","fusil","bouclier","filet"};
	
	private int idArme;
	
	private String nomArme;

	private int dmg;
	
	private int probatouch;

	private static int nbArmes = 0;

	private static Arme [] tabArmes = new Arme [100];
	
	
	
	public Arme() {
		this.idArme = Arme.nbArmes;
		this.nomArme = tabNomsArmes[randomMinMax(0,8)];
		Arme.nbArmes++;
		this.dmg = randomMinMax(1,5);
		this.probatouch = randomMinMax(50,100);
		Arme.tabArmes[this.idArme] = this;

		
	}
	
	
	public Arme(Arme a1) {
		this.idArme = a1.idArme;
		this.nomArme = a1.nomArme;
		this.dmg = a1.dmg;
		this.probatouch = a1.probatouch;

		
	}



	public static Arme selectionArme(){
		return  Arme.tabArmes[randomMinMax(0,10)];
	}
	
	
	
	public static int randomMinMax(int min, int max) {
		Random rand = new Random();
		int res = rand.nextInt(max - min + 1) + min;
		assert min <= res && res <= max : "tirage aleatoire hors des bornes";
		return res;
	}
	
	
	public String getNomArme() {
		return this.nomArme;
	}
	
	public int getDmg() {
		return this.dmg;
	}
	
	public int getProba() {
		return this.probatouch;
	}
	
	public String toString() {
		String ch = this.nomArme + " dmg:" + this.dmg + " probatoucher:" + this.probatouch;
		
		return ch;
	}
}
