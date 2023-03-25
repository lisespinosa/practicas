package uni10;

public class Factura implements PorPagar{
		
		 private final String numeroPieza;
		    private final String descripcionPieza;
		    private int cantidad;
		    private double precioPorArticulo;
		    
		    
		    public Factura(String numeroPieza, String descripcionPieza, int cantidad, 
		            double precioPorArticulo) {
		        if (cantidad < 1) { 
		            throw new IllegalArgumentException("La cantidad debe ser positica");
		        }
		            
		        if (precioPorArticulo <= 0.0) { 
		            throw new IllegalArgumentException("El precio debe ser positivo");
		        }
		        
		        this.cantidad = cantidad;
		        this.precioPorArticulo = precioPorArticulo;
		        this.descripcionPieza = descripcionPieza;
		        this.numeroPieza = numeroPieza;
		    } 
		    
		    public void setCantidad(int cantidad) {
		        if (cantidad < 1) { 
		            throw new IllegalArgumentException("La cantidad debe ser positiva");
		        }
		        
		        this.cantidad = cantidad;
		    } 
		    
		    public int getCantidad() {
		        return cantidad;
		    } 
		    
		    public void setPrecioPorArticulo(double precioPorArticulo) {
		        if (precioPorArticulo <= 0.0) { 
		            throw new IllegalArgumentException("El precio debe ser positivo");
		        }
		        
		        this.precioPorArticulo = precioPorArticulo;
		    } 
		    
		    public double getPrecioPorArticulo() {
		        return precioPorArticulo;
		    } 
		    
		    public String getNumeroPieza() {
		        return numeroPieza;
		    } 
		    
		    public String getDescripcionPieza() {
		        return descripcionPieza;
		    } 
		    
		  
		    public String toString() {
		        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
		            "Factura", "Parte #", getNumeroPieza(), getDescripcionPieza(),
		            "Cantidad", getCantidad(), "Precio por articulo", getPrecioPorArticulo());
		    } 
		    public double getMontoPago() {
		        return getCantidad() * getPrecioPorArticulo();
		    } 
		    
		 
		    public static void main(String[] args) {
		        Factura testFactura = new Factura("111-XYZ", "Thingamajig 9000", 10, 
		                15.50);
		        
		        System.out.printf("%s%n%s%n%s: $%.2f%n", "Item", testFactura, 
		                "Total Cost", testFactura.getMontoPago());
		        
		    } 

	}


