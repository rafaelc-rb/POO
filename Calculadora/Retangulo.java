package calculadora;

public class Retangulo implements CalculosFiguraGeometrica {
	protected double base, altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		return base * altura;
	}
	public double perimetro() {
		return (2 * base) + (2 * altura);
	}
}
