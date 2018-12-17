
public class MaillonPoint {

    private Point point; 
    private MaillonPoint suivant;

    /** Constructeur vide */
    public MaillonPoint () { 
	this.suivant = null; 
    }

    /** Constructeur avec une valeur */
    public MaillonPoint (Point p) { 
	this.point = p;
	this.suivant = null; 
    }

    public Point getPoint() {
	return this.point;
    }

    public void setPoint(Point p) {
	this.point = p;
    }

    public MaillonPoint getSuiv () {
	return this.suivant;
    }

    public void setSuiv (MaillonPoint m) {
	this.suivant = m;
    }

    public String toString () {
	return this.point.toString();
    }

    /* -------------------------------------------------- */

}
