package scuola.stefano.razze;

public class Uomini extends Razza {

	public Uomini(int xp) {
		int tipo = 0;
		super(xp, tipo);
		// TODO Auto-generated constructor stub
	}
	
	public int calcolaForza() {
		
		return 30 + (6*super.xp);
		
	}

}
