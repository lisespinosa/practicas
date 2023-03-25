package uni10;

public abstract class Bidimencional extends Figura{
		
		
		public Bidimencional(double lado1, double lado2, double lado3) {
			super(lado1, lado2, lado3);
		}

		public Bidimencional(double lado1, double lado2) {
			super(lado1, lado2);
		}

		public Bidimencional(double lado1) {
			super(lado1);
		}

		public Bidimencional() {
			super();
		}

		public abstract double getArea();

	}


