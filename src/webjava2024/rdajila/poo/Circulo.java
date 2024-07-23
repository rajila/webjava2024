package webjava2024.rdajila.poo;

public final class Circulo extends Figura {
	private double ratio = 0.0;
	
	public Circulo() {}
	
	public Circulo(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(ratio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [Area()=" + Area() + "]";
	}
}