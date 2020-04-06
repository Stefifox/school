package scuola.stefano.razze;

public class Elfi extends Razza {

	public Elfi(int xp, int tipo) {
		super(xp, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcolaForza() {
	
		if(super.xp < 5) {
			return 20 + (3 * super.xp);
		}else {
			return 80 + (2 * super.xp);
		}
		
	}

}
