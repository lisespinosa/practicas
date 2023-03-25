package uni10;

public class EmpleadoAsalariado10 extends Empleado {
		
		private double salarioSemanal;

			
			public EmpleadoAsalariado10(String nombre, String apellido, String numerodess,
					double salarioSemanal) {
				super(nombre, apellido, numerodess);

				if (salarioSemanal < 0.0)
					throw new IllegalArgumentException("Salario Semanal debe ser >= 0.0");

				this.salarioSemanal = salarioSemanal;
			}


			public void setSalarioSemanal(double salarioSemanal) {
				if (salarioSemanal < 0.0)
					throw new IllegalArgumentException("Salario Semanal debe ser >= 0.0");

				this.salarioSemanal = salarioSemanal;
			}


			public double getSalarioSemanal() {
				return salarioSemanal;
			}

			
			public double ingresos() {
				return getSalarioSemanal();
			}


			public double getMontoPago() {
		        return getSalarioSemanal();
		    }
		    

		    
		    public String toString() {
		        return String.format("%s%n%s: $%.2f", super.toString(), 
		                "Salario", getSalarioSemanal());
		    } 
		    
		    
		    
		    public static void main(String[] args) {
		       EmpleadoAsalariado10 emp = new EmpleadoAsalariado10("Jack", "Dangerfield", "333-33-333", 3000);
		       
		       System.out.printf("%s:%n%s%n", "From toString()", emp);
		    } 
		    

}
