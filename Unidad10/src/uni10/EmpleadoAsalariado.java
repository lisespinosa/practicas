package uni10;

public class EmpleadoAsalariado extends Empleado
	{
		private double salarioSemanal;

		
		public EmpleadoAsalariado(String nombre, String apellido, String numerodess, Date nacimiento,
				double salarioSemanal) {
			super(nombre, apellido, numerodess);

			if (salarioSemanal < 0.0)
				throw new IllegalArgumentException("Salario Semanal debe ser >= 0.0");

			this.salarioSemanal = salarioSemanal;
		}


		
		


		public void setSalarioSemanal(double salarioSemanal) {
			if (salarioSemanal < 0.0)
				throw new IllegalArgumentException("Salaeio Semanla debe ser >= 0.0");

			this.salarioSemanal = salarioSemanal;
		}


		public double getSalarioSemanal() {
			return salarioSemanal;
		}

		
		public double ingresos() {
			return getSalarioSemanal();
		}


		public String toString() {
			return String.format("Empleado Asalariado: %s%n%s: $%,.2f", super.toString(), "Salario Semanal", getSalarioSemanal());
		}

	}

