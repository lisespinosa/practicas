package unidad7;
import java.util.Scanner;

public class ComisionVendedores {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] rangosSalarios = new int[9]; 

        System.out.print("Ingrese el número de vendedores: ");
        int numVendedores = entrada.nextInt();

        for (int i = 0; i < numVendedores; i++) {
            System.out.printf("Ingrese las ventas del vendedor %d: $", i+1);
            double ventas = entrada.nextDouble();

            double salario = 200 + 0.09 * ventas; 

            
            if (salario < 300) {
                rangosSalarios[0]++;
            } else if (salario < 400) {
                rangosSalarios[1]++;
            } else if (salario < 500) {
                rangosSalarios[2]++;
            } else if (salario < 600) {
                rangosSalarios[3]++;
            } else if (salario < 700) {
                rangosSalarios[4]++;
            } else if (salario < 800) {
                rangosSalarios[5]++;
            } else if (salario < 900) {
                rangosSalarios[6]++;
            } else if (salario < 1000) {
                rangosSalarios[7]++;
            } else {
                rangosSalarios[8]++;
            }
        }
       
        System.out.printf("%-15s %-15s\n", "Rango", "Número de vendedores");
        System.out.printf("--------------------------\n");
        System.out.printf("$200-299       %-15d\n", rangosSalarios[0]);
        System.out.printf("$300-399       %-15d\n", rangosSalarios[1]);
        System.out.printf("$400-499       %-15d\n", rangosSalarios[2]);
        System.out.printf("$500-599       %-15d\n", rangosSalarios[3]);
        System.out.printf("$600-699       %-15d\n", rangosSalarios[4]);
        System.out.printf("$700-799       %-15d\n", rangosSalarios[5]);
        System.out.printf("$800-899       %-15d\n", rangosSalarios[6]);
        System.out.printf("$900-999       %-15d\n", rangosSalarios[7]);
        System.out.printf("$1,000 o más   %-15d\n", rangosSalarios[8]);
        
        int[] cuentas = new int[10];
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 0;
        }

        int[] bono = new int[15];

        for (int i = 0; i < bono.length; i++) {
            bono[i]++;
        }
        int[] mejoresPuntuaciones = {98, 76, 85, 91, 67};
        System.out.println("Mejores puntuaciones:");
        for (int i = 0; i < mejoresPuntuaciones.length; i++) {
            System.out.printf("%5d%n", mejoresPuntuaciones[i]);
        }
    }

}



