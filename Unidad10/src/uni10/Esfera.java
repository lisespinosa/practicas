package uni10;

public class Esfera extends Tridimencional {
		public Esfera(double radio) {
			super(radio);
		}

		public double getArea() {

			return 4 * Math.PI * Math.pow(super.getLado1(), 2);
		}

		
		public double getVolumen() {

			return 4 / 3 * Math.PI * Math.pow(super.getLado1(), 3);
		}
		

		public String toString() {
			return "Esfera";
		}

	}


