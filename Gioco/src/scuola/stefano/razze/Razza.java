package scuola.stefano.razze;

public abstract class Razza {

	public int xp;
	public int tipo;
	
	
	public Razza(int xp int tipo) {
		this.xp = xp;
		this.tipo = tipo;
	}
	
	//public abstract int calcolaEsperienza();
	
	public abstract int calcolaForza(); 
	
}
