package calculadora;

public class Calculadora {
	public static void main(String args[]) {
		Quadrado quad = new Quadrado(3);
		Retangulo ret = new Retangulo(3,7);
		
		System.out.println("A área do quadrado é: " + quad.area() + ", e seu perímetro é: " + quad.perimetro() +
				"\nA área do retângulo é: " + ret.area() + ",e seu perímetro é: " + ret.perimetro());
	}
}
