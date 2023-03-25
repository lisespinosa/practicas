package uni10;

public class PruebaSistemaNomina10 {
	public static void main(String[] args) 
	   {

		 
	      EmpleadoAsalariado10 empleadoAsalariado = 
	         new EmpleadoAsalariado10("John", "Smith", "111-11-1111", 800.00);
	      EmpleadoPorHoras empleadoPorHoras = 
	         new EmpleadoPorHoras("Karen", "Price", "222-22-2222",  16.75, 40);
	      EmpleadoPorComision empleadoPorComision = 
	         new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06);
	      EmpleadoBaseMasComision empleadoBaseMasComision = 
	         new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
	      
	      
	      Empleado[] empleados = new Empleado[4]; 

	      empleados[0] = empleadoAsalariado;
	      empleados[1] = empleadoPorHoras;
	      empleados[2] = empleadoPorComision; 
	      empleados[3] = empleadoBaseMasComision;


	      for (Empleado empleadoActual : empleados) {
	            System.out.println(empleadoActual);
	            
	            if (empleadoActual instanceof EmpleadoBaseMasComision) {
	              
	                EmpleadoBaseMasComision tempEmp = 
	                        (EmpleadoBaseMasComision) empleadoActual;  
	                        
	                tempEmp.setSalarioBase(tempEmp.getSalarioBase() * 1.10);
	                System.out.printf("%s: $%.2f%n", "El nuevo salario base", 
	                        tempEmp.getSalarioBase());
	            }
	            
	            System.out.printf("%s: $%.2f%n%n", "ingresos", 
	                    empleadoActual.getMontoPago());
	        }
	        
	        for (int j = 0; j < empleados.length; j++) {
	            System.out.printf("%s %d %s %s%n", "Empleado", j+1, "es a(n)", 
	                    empleados[j].getClass().getName());
	            
	        }
	    }}

