package uni10;

public abstract class EmpleadoPorComision10 extends Empleado{

		
		
		private double ventasBrutas; 
		private double tarifaComision; 


		public EmpleadoPorComision10(String nombre, String apellido, String numerodess, 
				double ventasBrutas, double tarifaComision) {
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

		public double getMontoPago() {
	        return getTarifaComision() * getVentasBrutas();
	    } 
	    
	  
	 
	    public String toString() {
	        return String.format("%s%n%s: $%.2f%n%s: %.2f", super.toString(), 
	                "Ventas Brutas", getVentasBrutas(), "Tatrifa comision", getTarifaComision());
	    } 
	    
	    
	    public static void main(String[] args) {
	       EmpleadoPorComision emp = 
	              new EmpleadoPorComision("Bob", "Smith", "111-11-111", 100000, .06);

	       System.out.printf("%s:%n%s%n%s $%.2f%n", "From toString()", 
	               emp, "Ingresos", emp.getMontoPago());
	    } 
	    

			       
	       
		
			}
		





