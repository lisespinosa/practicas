package uni10;

public class Cubo extends Tridimencional{
		public Cubo(double altura) {
			super(altura);
		}

		
		public double getArea() {
			return super.getLado1() * super.getLado1() * 6;
		}

		
		public double getVolumen() {
			return super.getLado1() * super.getLado1() * super.getLado1();
		}


		public String toString() {
			return "Cubo";
		}
		
}
