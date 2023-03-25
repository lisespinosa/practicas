package unidad9;

public class EmpleadoHoraExtra {
	private static double pagoPorHoraExtra; 
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
   
    
    public EmpleadoHoraExtra() {
    }

    
    public EmpleadoHoraExtra(String nif) {
        this.nif = nif;
    }


    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    
    public static double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        Empleado.pagoPorHoraExtra = pagoPorHoraExtra;
    }
   
   
    
    public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }
   
    
    public double calcularSueldoBruto(){
        return sueldoBase + calcularImporteHorasExtras();
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSueldo Base: ");
        sb.append(sueldoBase);
        sb.append("\nHoras Extras: ");
        sb.append(horasExtras);
        return  sb.toString();
    }
}

	