package uni10;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
		
		private double salarioBase; 

		
		public EmpleadoBaseMasComision(String nombre, String apellido, String numerodess, double ventasBrutas, double tarifaComision, double salarioBase) {
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

		public double ingresos() {
			return getSalarioBase() + super.ingresos();
		}

		public String toString() {
			return String.format("%s %s; %s: $%,.2f", "con salario base", super.toString(), "salario base", getSalarioBase());
		}

	}



