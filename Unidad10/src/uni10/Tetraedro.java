package uni10;

public class Tetraedro extends Tridimencional{
		
		public Tetraedro(double altura) {
			super(altura);
		}


		public double getArea() {

			return super.getLado1() * super.getLado1() * Math.sqrt(3);
		}


		public double getVolumen() {

			return super.getLado1() * super.getLado1() * super.getLado1() * (Math.sqrt(2) / 12);
		}

		
		public String toString() {
			return "Tetraedro";
		}

	}

