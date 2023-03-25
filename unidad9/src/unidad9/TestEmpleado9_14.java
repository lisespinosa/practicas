package unidad9;
import java.util.Scanner;

public class TestEmpleado9_14 {
	public static void main(String[] args) { 

	        EmpleadoPorComision Empleado =  
	           new EmpleadoPorComision(null, null, null, 0, .1, 0);

	        System.out.printf(
	          "informacion de los Empleados obtenida :%n");

	       System.out.printf("Ingrese el nombre del Empleado:");
	               String primerNombre = extracted().nextLine();
	               Empleado.setprimerNombre(primerNombre);

	       System.out.printf("Ingrese el apellido del Empleado:");
	               String apellido = extracted().nextLine();
	               Empleado.setapellido(apellido);

	       System.out.printf("Ingrese el numero de Seguro Social:");
	               String numeroSeguroSocial = extracted().nextLine();
	               Empleado.setnumeroSeguroSocial(numeroSeguroSocial);
	               
	               System.out.printf("ventas Brutas por Empleado:");
	               String ventasBrutas = extracted().nextLine();
	               Empleado.setventasBrutas(ventasBrutas);

	       System.out.printf("tarifa de comision por Empleado:");
	               String tarifaComision = extracted().nextLine();
	               Empleado.settarifaComision(tarifaComision);         

	        System.out.printf("%n%s:%n%n%s%n",
	            "Informacion de los Empleados actualizada ",                          

	          Empleado.toString());
	    }

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	   

}
