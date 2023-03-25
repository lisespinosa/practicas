package uni10;

public class EmpleadoBaseComision extends EmpleadoPorComision{
		
		private double salarioBase; 

			
			public EmpleadoBaseComision(String nombre, String apellido, String numerodess,
					double ventasBrutas, double tarifaComision, double salarioBase) {
				super(nombre, apellido, numerodess, ventasBrutas, tarifaComision);

				if (salarioBase < 0.0) 
					throw new IllegalArgumentException("El salario base debe ser de >= 0.0");

				this.salarioBase = salarioBase;
			}


			public void setSalarioBase(double salarioBase) {
				if (salarioBase < 0.0) 
					throw new IllegalArgumentException("Salario base debe ser de >= 0.0");

				this.salarioBase = salarioBase;
			}

			
			public double getSalarioBase() {
				return salarioBase;
			}

			public double MontoPago() {
				return getSalarioBase() + super.getMontoPago();
				
			}

			public String toString() {
				return String.format("%s %s; %s: $%,.2f", "con salario base", super.toString(), "salario base", getSalarioBase());
			}

			 public static void main(String[] args) {
			       EmpleadoBaseMasComision emp = 
			               new EmpleadoBaseMasComision ("Jane", "Smith", "222-22-222", 
			                       70000, .04, 500);
			  
			       System.out.printf("%s:%n%s%n%s: $%.2f%n", "From toString()", 
			               emp, "Ingresos", emp.getMontoPago());
			    } 

		}





