package webjava2024.rdajila.poo;

public final class Contador {
	private int Cont;
	
	public Contador(){}
	
	public Contador(int cont) {
		if (cont > 0) this.Cont = cont;
		else this.Cont = 0;
	}
	
	public Contador (final Contador contadorSource) {
		this.Cont = contadorSource.Cont;
	}

	public int getCont() {
		return Cont;
	}

	public void setCont(int cont) {
		Cont = cont;
	}
	
	public void incrementar() {
		this.Cont++;
	}
	
	public void decrementar() {
		this.Cont--;
		if (this.Cont < 0 ) this.Cont = 0;
	}

}