package scuola.stefano.razze;

public class Orchi extends Razza {

	public Orchi(int xp, int tipo) {
		super(xp, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcolaForza() {
		// TODO Auto-generated method stub
		if(super.xp < 5) {
			return 30 + (2 * super.xp);
		}else {
			return 70 + (3 * super.xp);
		}
	}

}
