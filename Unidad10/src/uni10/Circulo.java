package uni10;

public class Circulo extends Bidimencional{
		
		public Circulo(double radio) {
			super(radio);
		}

		
		public double getArea() {
			return Math.PI * super.getLado1() * super.getLado1();
		}

		
		public String toString() {
			return "Ciiculo";
		}
		
		
}
