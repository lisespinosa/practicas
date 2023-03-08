package unidad5;

import java.util.Scanner;

public class Ejercicio5_17 {

	public static void main ( String args[] )
	{
		int num = 0;
		int numproducto;
		int montoproducto;
		double subtotal = 0;
		double total = 0;
		while(num != 2) {
			
			Scanner entrada = new Scanner (System.in);
			System.out.print("\nIngrese el numero del producto");
			numproducto = entrada.nextInt();
			
			Scanner entrada2 = new Scanner (System.in);
			System.out.print("\nIngrese el monto del producto");
			montoproducto = entrada2.nextInt();
			
			switch(numproducto) {
				case 1:
					double precioproducto1 = 2.98;
					subtotal = (precioproducto1 * montoproducto);
					
					break;
				case 2:
					double precioproducto2 = 4.50;
					subtotal = (precioproducto2 * montoproducto);
					break;
				case 3:
					double precioproducto3 = 9.98;
					subtotal = (precioproducto3 * montoproducto);
					break;
				case 4:
					double precioproducto4 = 4.49;
					subtotal = (precioproducto4 * montoproducto);
					break;
				case 5:
					double precioproducto5 = 6.87;
					subtotal = (precioproducto5 * montoproducto);
					break;
					
			}
			System.out.print("\nDesea seguir? 1.Si 2.No ");
			Scanner continuar = new Scanner (System.in);
			num = continuar.nextInt();
			total = +subtotal;
			
		}
		System.out.print("\ntotal de compra:  "+total);
		
	}
}
