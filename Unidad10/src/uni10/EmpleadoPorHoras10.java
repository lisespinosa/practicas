package uni10;

public abstract class EmpleadoPorHoras10 extends Empleado {
		
		private double sueldo; 
		private double horas; 

		
		public EmpleadoPorHoras10(String nombre, String apellido, String numerodess,  double sueldo,
				double horas) {
			super(nombre, apellido, numerodess);
		

			if (sueldo < 0.0) 
				throw new IllegalArgumentException("Sueldo por hora debe ser de >= 0.0");

			if ((horas < 0.0) || (horas > 168.0)) 
				throw new IllegalArgumentException("Horas trabajada debe ser de >= 0.0 and <= 168.0");

			this.sueldo = sueldo;
			this.horas = horas;
		}
}
