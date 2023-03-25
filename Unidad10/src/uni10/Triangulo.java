package uni10;

public class Triangulo extends Bidimencional{

		private double semiPerimetro;
		
		public Triangulo(double lado1, double lado2, double lado3) {
				super(lado1, lado2, lado3);
				semiPerimetro = (lado1 + lado2 + lado3) / 2;
				if(!(semiPerimetro > lado1 && semiPerimetro > lado2 && semiPerimetro > lado3)) {
					throw new IllegalArgumentException("Estos valores no representan los lado del triangulo");
				}
		}

		
		public double getArea() {
			double lado1 = super.getLado1();
			double lado2 = super.getLado2();
			double lado3 = super.getLado3();
			return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
		}


		public String toString() {
			return "Triangulo";
		}
}
