package unidad9;

public class Empleado {
	
	public static double pagoPorHoraExtra;
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private String apellido;
	private String nss;
	
	public Empleado( String nombre )
	{
	
	this.primerNombre = nombre;
	this.apellidoPaterno = apellido;
	this.numeroSeguroSocial = nss;
	}
	public void establecerPrimerNombre( String nombre )
	{
	primerNombre = nombre;
	} 
	public String obtenerPrimerNombre()
	{
	return primerNombre;
	} 
	public void establecerApellidoPaterno( String apellido )
	{
	apellidoPaterno = apellido;
	} 
	public String obtenerApellidoPaterno()
	{
	return apellidoPaterno;
	} 
	public void establecerNumeroSeguroSocial( String nss )
	{
	numeroSeguroSocial = nss; 
	}
	public String obtenerNumeroSeguroSocial()
	{
	return numeroSeguroSocial;
	}
	
	@Override
	 public String toString()
	 {
		return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f","Empleado", primerNombre, apellidoPaterno,
				"numero de seguro social", numeroSeguroSocial); 
	}
	public static void setPagoPorHoraExtra(double importe) {
		// TODO Auto-generated method stub
		
	}
	public Object calcularSueldo() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object calcularImporteHorasExtras() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}
	public void setSueldoBase(double sueldoBase) {
		// TODO Auto-generated method stub
		
	}
	public void setHorasExtras(int horasExtras) {
		// TODO Auto-generated method stub
		
	}
	}
	
	
	
	