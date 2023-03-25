package uni10;

public abstract class Tridimencional extends Figura {
	
		public Tridimencional(double lado1, double lado2,double lado3) {
			super(lado1, lado2, lado3);
		}
		public Tridimencional(double lado1,double lado2) {
			super(lado1,lado2);
		}
		public Tridimencional(double lado1) {
			super(lado1);
		}
		public Tridimencional() {
			super();
		}
		
		
		
		public abstract double getArea(); 
		public abstract double getVolumen(); 
			
		
	}


