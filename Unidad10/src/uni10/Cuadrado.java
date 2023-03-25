package uni10;

public class Cuadrado extends Bidimencional {
		public Cuadrado(double altura ) {
			super(altura);
		}

		
		public double getArea() {

			return super.getLado1() * super.getLado1();
		}

		
		public String toString() {
			return "Cuadrado";
		}
		
	}


