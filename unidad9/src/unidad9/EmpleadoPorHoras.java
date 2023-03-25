package unidad9;
import java.io.IOException;
import java.util.Scanner;

public class EmpleadoPorHoras {
	
	    final static int MAXIMO_EMPLEADOS = 20;
	    static Empleado[] empleados = new Empleado[MAXIMO_EMPLEADOS];
	    static int indice = 0;
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        double importe;
	        Empleado e;
	        leerEmpleados();
	        if (numeroDeEmpleados() > 0) {

	            //mostrar empleados
	            System.out.println("\n\nEmpleados introducidos: ");
	            mostrar();

	            importe = leerImporteHorasExtras();

	            
	            Empleado.setPagoPorHoraExtra(importe);

	            
	            e = empleadoQueMasCobra();
	            System.out.println("\n\nEmpleado que más cobra:");
	            System.out.println(e);
	            System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

	           

	            
	            e = empleadoQueMenosCobra();
	            System.out.println("\n\nEmpleado que menos cobra:");
	            System.out.println(e);
	            System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

	            
	            e = empleadoQueMasCobraPorHorasExtras();
	            System.out.println("\n\nEmpleado que más cobra por horas extras:");
	            System.out.println(e);
	            System.out.printf("Total horas extras: %.2f €" , e.calcularImporteHorasExtras());

	            
	            e = empleadoQueMenosCobraPorHorasExtras();
	            System.out.println("\n\nEmpleado que menos cobra por horas extras:");
	            System.out.println(e);
	            System.out.printf("Total horas extras: %.2f €" , e.calcularImporteHorasExtras());

	            
	            ordenarPorSalario();
	            System.out.println("\n\nEmpleados ordenados por salario:");
	            mostrarEmpleadosYSalarios();

	        }
	    }

	    
	    public static void leerEmpleados() throws IOException {
	        Empleado e;
	        String dni, nombre;
	        double sueldoBase;
	        int horasExtras;
	        int i, N;

	        do {
	            System.out.print("Número de empleados? ");
	            N = sc.nextInt();
	        } while (N < 0 || N > MAXIMO_EMPLEADOS);
	       
	        for (i = 1; i <= N; i++) {
	            sc.nextLine(); 
	            System.out.println("Empleado " + i);
	            dni = sc.nextLine();
	            System.out.print("Nombre: ");
	            nombre = sc.nextLine();
	            System.out.print("Sueldo Base: ");
	            sueldoBase = sc.nextDouble();
	            System.out.print("Horas extra: ");
	            horasExtras = sc.nextInt();
	            

	            e = new Empleado(dni); 
	            e.setNombre(nombre);
	            e.setSueldoBase(sueldoBase);
	            e.setHorasExtras(horasExtras);
	            
	            empleados[indice] = e; 
	            indice++;
	        }
	    }

	    
	    public static void mostrar() {
	        for (int i = 0; i < indice; i++) {
	            System.out.println(empleados[i]);
	        }
	    }

	    
	    public static double leerImporteHorasExtras() {
	        double importe;
	        System.out.print("Introduce el importe a pagar por cada hora extra: ");
	        importe = sc.nextDouble();
	        return importe;
	    }

	    public static int numeroDeEmpleados() {
	        return indice;
	    }

	    
	    public static Empleado empleadoQueMasCobra() {
	        Empleado mayor = empleados[0];
	        for (int i = 1; i < indice; i++) {
	            if (Empleado(i).calcularSueldo() > mayor.calcularSueldo()) {
	                mayor = empleados[i];
	            }
	        }
	        return mayor;
	    }

	    
	    public static Empleado empleadoQueMenosCobra() {
	        Empleado menor = empleados[0];
	        for (int i = 1; i < indice; i++) {
	            if (Empleado(i).calcularSueldo() < menor.calcularSueldo()) {
	                menor = empleados[i];
	            }
	        }
	        return menor;
	    }

	    
	    public static Empleado empleadoQueMasCobraPorHorasExtras() {
	        Empleado mayor = empleados[0];
	        for (int i = 1; i < indice; i++) {
	            if (empleados[i].calcularImporteHorasExtras() > mayor.calcularImporteHorasExtras()) {
	                mayor = empleados[i];
	            }
	        }
	        return mayor;
	    }

	    	    public static Empleado empleadoQueMenosCobraPorHorasExtras() {
	        Empleado menor = empleados[0];
	        for (int i = 1; i < indice; i++) {
	            if (Empleado(i).calcularImporteHorasExtras() < menor.calcularImporteHorasExtras()) {                 
	                menor = empleados[i];
	            }
	        }
	        return menor;
	    }

	    
	    private static Empleado Empleado(int i) {
					// TODO Auto-generated method stub
					return null;
				}


		public static void ordenarPorSalario() {

	        int i, j;
	        Empleado aux;
	        for (i = 0; i < indice - 1; i++) {
	            for (j = 0; j < indice - i - 1; j++) {
	                if (Empleado(j + 1).calcularSueldo() < Empleado(j).calcularSueldo()) {
	                    aux = empleados[j + 1];
	                    empleados[j + 1] = empleados[j];
	                    empleados[j] = aux;
	                }
	            }
	        }
	    }

	    
	    public static void mostrarEmpleadosYSalarios() {
	        for (int i = 0; i < indice; i++) {
	            System.out.println(empleados[i]);
	            System.out.printf("Sueldo: %.2f € %n" , empleados[i].calcularSueldo());
	        }
	    }
}
	    
	    
	    
	