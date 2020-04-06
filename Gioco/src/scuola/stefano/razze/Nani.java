package scuola.stefano.razze;

public class Nani extends Razza {

	public Nani(int xp, int tipo) {
		super(xp, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcolaForza() {
		// TODO Auto-generated method stub
		return 20 + (4 * super.xp);
	}

}
