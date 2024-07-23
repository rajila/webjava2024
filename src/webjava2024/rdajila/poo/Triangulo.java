package webjava2024.rdajila.poo;

public final class Triangulo extends Figura {
	private double base = 0.0;
	private double altura = 0.0;
	
	public Triangulo() {}
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return (base * altura)/2;
	}

	@Override
	public String toString() {
		return "Triangulo [Area()=" + Area() + "]";
	}
}