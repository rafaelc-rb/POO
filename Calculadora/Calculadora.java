package calculadora;

public class Calculadora {
	public static void main(String args[]) {
		Quadrado quad = new Quadrado(3);
		Retangulo ret = new Retangulo(3,7);
		
		System.out.println("A �rea do quadrado �: " + quad.area() + ", e seu per�metro �: " + quad.perimetro() +
				"\nA �rea do ret�ngulo �: " + ret.area() + ",e seu per�metro �: " + ret.perimetro());
	}
}
