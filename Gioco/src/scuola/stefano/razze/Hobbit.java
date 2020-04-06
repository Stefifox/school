package scuola.stefano.razze;

public class Hobbit extends Razza {

	public Hobbit(int xp, int tipo) {
		super(xp, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcolaForza() {
		// TODO Auto-generated method stub
		return 10 + (3 * super.xp);
	}

}
