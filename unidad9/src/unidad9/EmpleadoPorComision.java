package unidad9;

public class EmpleadoPorComision extends Empleado { 
	private double ventasBrutas;
    private double tarifaComision;
    private double Ganancia;
	private Object primerNombre;
	private Object apellido;
	private Object numeroSeguroSocial;

    public EmpleadoPorComision(String primerNombre, String apellido, String numeroSeguroSocial, double ventasBrutas,
            double tarifaComision, double Ganancia) {
        super(primerNombre);       

        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("ventasBrutas debe ser >= 0.0");

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException("tarifaComision debe ser > 0.0 and < 1.0");

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public void setventasBrutas(double ventasBrutas) {

        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("ventasBrutas debe ser  >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }

    public double getventasBrutas() {
        return ventasBrutas;
    }

    public void settarifaComision(double tarifaComision) {

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException("tarifaComision debe ser > 0.0 and < 1.0");
        this.tarifaComision = tarifaComision;
    }

    public double gettarifaComision() {
        return tarifaComision;
    }


    public Double Ganancia(double d) {
        return Ganancia(Ganancia+ (tarifaComision * ventasBrutas));
    }
    public double getGanancia() {
        return Ganancia;
    }

    public void setGanancia(double Ganancia) {
        this.Ganancia = Ganancia;
    }
    @Override

    public String toString() {

        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s",
                "EmpleadoPorComision", primerNombre, apellido,
                "numeroSeguroSocial", numeroSeguroSocial,
                "totaldeGanancias", Ganancia(Ganancia));
    }

    public void setprimerNombre(String primerNombre) {
    }

    public void setapellido(String apellido) {
    }

    public void setnumeroSeguroSocial(String numeroSeguroSocial) {
    }

    public void setventasBrutas(String ventasBrutas) {  
    }

    public void settarifaComision(String tarifaComision) {
    }

}
	
	
	
