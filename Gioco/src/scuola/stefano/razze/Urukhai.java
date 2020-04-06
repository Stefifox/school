package scuola.stefano.razze;

public class Urukhai extends Razza {

	public Urukhai(int xp, int tipo) {
		super(xp, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcolaForza() {
		// TODO Auto-generated method stub
		return 50 + (5 * super.xp);
	}

}
