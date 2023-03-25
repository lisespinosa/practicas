package uni10;

public abstract class Empleado {
	private final String nombre;
	private final String apellido;
	private final String numerodess;
	private Date nacimiento = null;

	
	public Empleado(String nombre, String apellido, String numerodess) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numerodess = numerodess;
		extracted();
	}


	private Date extracted() {
		return this.nacimiento = nacimiento;
	}


	public String getNombre() {
		return nombre;
	}

	
	public String getApellido() {
		return apellido;
	}


	public String getNumerodesegurosocial() {
		return numerodess;
	}


	public Date getFechadeNacimiento() {
		return nacimiento;
	}
	
	
	public String toString() {
		return String.format("%s %s%nNumero de seguro social: %s",getNombre (), getApellido(),
				getNumerodesegurosocial());
	}


	public abstract double ingresos(); // 


	public Object getMontoPago() {
		// TODO Auto-generated method stub
		return null;
	}
} 




