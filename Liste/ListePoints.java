
public class ListePoints {

    private MaillonPoint tete; 

    private int longueur;

    private MaillonPoint dernier;

    /** Constructeur d'une liste vide
     */

    public ListePoints () {
    this.tete = null;
    this.longueur = 0;
    this.dernier = null;
    }

    /** Constructeur d'une liste a un seul element
     */
    public ListePoints (Point p) { 
        this.tete=new MaillonPoint(p);
        this.longueur = 1;
        this.dernier = this.tete;
    }
    
  /** @param tabListe est un tableau contenant les elements de la liste
     * Pre-requis : aucun
     */
    public ListePoints (Point[] tabPoint) {
    this(); 
    if (tabPoint.length > 0) {
        this.tete = new MaillonPoint (tabPoint[0]);
        MaillonPoint curThis = this.tete;
        this.longueur++;
        for (int i = 1 ; i < tabPoint.length ; i++) {
        curThis.setSuiv (new MaillonPoint(tabPoint[i])); // creation et accrochage du maillon suivant
        curThis = curThis.getSuiv();
        this.longueur++;
        }
        this.dernier = curThis;
    }
    }

   /**
     * Prerequis: aucun
     * construit une liste completement disjointe de la liste l 
     */
    public ListePoints (ListePoints lP) { // constructeur par recopie profonde
    this(); 
    if (! lP.estVide()) {

        this.tete = new MaillonPoint (lP.tete.getPoint());
        MaillonPoint curThis = this.tete;
        MaillonPoint curL = lP.tete.getSuiv();
        this.longueur++;

        while (curL != null) {
        curThis.setSuiv (new MaillonPoint(curL.getPoint())); // creation et accrochage du maillon suivant
        curThis = curThis.getSuiv();
        curL = curL.getSuiv();
        this.longueur++;
        }
        this.dernier = curThis;
    }
    }



    public boolean estVide() {
    return (this.tete == null) ;
    }
    
    public Point getTetePoint() {
    	return this.tete.getPoint();
    }
    
    
    
    public Point getDernierPoint() {
    	return this.dernier.getPoint();
    }
} // end class
