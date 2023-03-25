package uni10;

public class EmpleadoPorComision extends Empleado {

		private double ventasBrutas; 
		private double tarifaComision; 


		public EmpleadoPorComision(String nombre, String apellido, String numerodess, double ventasBrutas, double tarifaComision) {
			super(nombre, apellido, numerodess);

			if (tarifaComision <= 0.0 || tarifaComision >= 1.0) 
				throw new IllegalArgumentException("La tarifa de comision debe ser de > 0.0 and < 1.0");

			if (ventasBrutas < 0.0) 
				throw new IllegalArgumentException("Las ventas brutas deben ser de >= 0.0");

			this.ventasBrutas = ventasBrutas;
			this.tarifaComision = tarifaComision;
		}


		 

		public void setVentasBrutas(double ventasBrutas) {
			if (ventasBrutas < 0.0) 
				throw new IllegalArgumentException("Las ventas brutas deben ser de >= 0.0");

			this.ventasBrutas = ventasBrutas;
		}

		
		public double getVentasBrutas() {
			return ventasBrutas;
		}

		
		public void setTarifaComision(double tarifaComision) {
			if (tarifaComision <= 0.0 || tarifaComision >= 1.0) 
				throw new IllegalArgumentException("La tarida de comision debe ser de> 0.0 and < 1.0");

			this.tarifaComision = tarifaComision;
		}


		public double getTarifaComision() {
			return tarifaComision;
		}

		public double ingresos() {
			return getTarifaComision() * getVentasBrutas();
		}

		
		public String toString() {
			return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "comisiones por empleado", super.toString(), "ventas brutas",
					getVentasBrutas(), "tarifa de comision", getTarifaComision());
		}




		public double getMontoPago() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

