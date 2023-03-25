package uni10;
import java.security.SecureRandom;

public class PruebaSistemaNomina {
	public static void main(String[] args) 
	   {
		 int mesActual = new SecureRandom().nextInt(12) + 1;
		 
	      EmpleadoAsalariado empleadoAsalariado = 
	         new EmpleadoAsalariado("John", "Smith", "111-11-1111",new Date(11, 14, 1987), 800.00);
	      EmpleadoPorHoras empleadoPorHoras = 
	         new EmpleadoPorHoras("Karen", "Price", "222-22-2222", new Date(6, 3, 1985) , 16.75, 40);
	      EmpleadoPorComision empleadoPorComision = 
	         new EmpleadoPorComision("Sue", "Jones", "333-33-3333",10000, .06);
	      EmpleadoBaseMasComision empleadoBaseMasComision = 
	         new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444",new Date(4, 11, 1989), 5000, .04, 300);

	      System.out.println("Mes Actual: " + mesActual);
	      
	      Empleado[] empleados = new Empleado[4]; 

	      empleados[0] = empleadoAsalariado;
	      empleados[1] = empleadoPorHoras;
	      empleados[2] = empleadoPorComision; 
	      empleados[3] = empleadoBaseMasComision;

	      System.out.printf("Empleados procesados en forma polimorfica:%n%n");
	      
	    
	      for (Empleado empleadoActual : empleados) 
	      {
	         System.out.println(empleadoActual); 

	         
	         if (empleadoActual instanceof EmpleadoBaseMasComision) 
	         {
	            
	            EmpleadoBaseMasComision empleado = 
	               (EmpleadoBaseMasComision) empleadoActual;

	            empleado.setSalarioBase(1.10 * empleado.getSalarioBase());

	            System.out.printf(
	               "el nuevo salario base con 10%% de aumento es: $%,.2f%n",
	               empleado.getSalarioBase());
	         } 
	         
	         if(mesActual == empleadoActual.getFechadeNacimiento().getMes() ){
	             System.out.printf(
	            		 
	                     "ganado $%,.2f + 100$ bonus = $%,.2f%n%n",empleadoActual.ingresos() ,empleadoActual.ingresos() + 100);
	         } else {
	             System.out.printf(
	                     "ganado $%,.2f%n%n", empleadoActual.ingresos());
	         }
	      } 
	   } 

}


