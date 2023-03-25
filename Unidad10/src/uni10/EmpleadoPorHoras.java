package uni10;

public class EmpleadoPorHoras extends Empleado{

		private double sueldo; 
		private double horas; 

		
		public EmpleadoPorHoras(String nombre, String apellido, String numerodess, double sueldo,
				double horas) {
			super(nombre, apellido, numerodess);

			if (sueldo < 0.0) 
				throw new IllegalArgumentException("Sueldo por hora debe ser de >= 0.0");

			if ((horas < 0.0) || (horas > 168.0)) 
				throw new IllegalArgumentException("Horas trabajada debe ser de >= 0.0 and <= 168.0");

			this.sueldo = sueldo;
			this.horas = horas;
		}

		

		public void setSueldo(double sueldo) {
			if (sueldo < 0.0) 
				throw new IllegalArgumentException("Sueldo por hora debe ser de >= 0.0");

			this.sueldo = sueldo;
		}

		
		public double getSueldo() {
			return sueldo;
		}

		
		public void setHoras(double horas) {
			if ((horas < 0.0) || (horas > 168.0)) 
				throw new IllegalArgumentException("Horas trabajadas debe se de >= 0.0 and <= 168.0");

			this.horas = horas;
		}

		
		public double getHoras() {
			return horas;
		}

		
		public double ingresos() {
			if (getHoras() <= 40) 
				return getSueldo() * getHoras();
			else
				return 40 * getSueldo() + (getHoras() - 40) * getSueldo() * 1.5;
		}


		public String toString() {
			return String.format("Empleado por horas: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "Sueldo por horas", getSueldo(),
					"Horas trabajadas", getHoras());
		}
	}


