package uni10;

public class Test10 {
	 public static void main(String[] args) {
	        EmpleadoPorComision commEmp = new EmpleadoPorComision("Malcolm", 
	                "Reynolds", "111-11-111", 100000, .06);
	        
	        EmpleadoPorComision bpcEmp = new EmpleadoPorComision("Zoe", "Wash", "222-22-222", 100000, .06);
	        
	        
	       EmpleadoPorComision commEmp2 = bpcEmp;
	        
	        System.out.printf("%s%n%s%n%n", "Superclass toString()", 
	                commEmp.toString());
	        System.out.printf("%s%n%s%n%n", "Subclass toString()", 
	                bpcEmp.toString());
	        System.out.printf("%s%n%s%n%n",
	                "Subclass toString() on Superclass object", commEmp2.toString());
	        
	    } 
	}


