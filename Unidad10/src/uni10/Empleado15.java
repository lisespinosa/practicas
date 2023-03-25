package uni10;

public abstract class Empleado15 implements PorPagar
{
		 private final String nombre;
		    private final String apellido;
		    private final String numerodess;
		    
		  
		    public Empleado15(String nombre, String apellido, String numerodess) {
		        this.nombre = nombre;
		        this.apellido  = apellido;
		        this.numerodess = numerodess;
		    } 
		        
		    public String getNombre() {
		        return nombre;
		    } 
		    
		    public String getApellido() {
		        return apellido;
		    } 
		    
		    public String getNumerodeSS() {
		        return numerodess;
		    } 
		    
		 
		    public String toString() {
		        return String.format("%s: %s %s%n%s: %s", "Nombre", getNombre(), 
		                getApellido(), "Numero de SS", getNumerodeSS());
		    } 
		  
		    
		    public abstract double getMontoPago();
		    
		

	}


