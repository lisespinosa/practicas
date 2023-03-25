package uni10;

public class Date {
	private int mes; 
	   private int dia; 
	   private int año; 

	   private static final int[] diaspormes = 
	      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   
	   
	   public Date(int mes, int dia, int año)
	   {
	   
	      if (mes <= 0 || mes > 12)
	         throw new IllegalArgumentException(
	            "mes (" + mes + ") debe ser 1-12");

	      if (dia <= 0 || 
	         (dia > diaspormes[mes] && !(mes == 2 && dia == 29)))
	         throw new IllegalArgumentException("day (" + dia + 
	            ") Fuera de rango para un mes del año");

	      if (mes == 2 && dia== 29 && !(año % 400 == 0 || 
	           (año % 4 == 0 && año % 100 != 0)))
	         throw new IllegalArgumentException("day (" + dia +
	            ") Fuera de Rango para un mes y año especifico");

	      this.mes = mes;
	      this.dia = dia;
	      this.año = año;
	   } 
	   
		public int getMes() {
			return mes;
		}
		
		public int getDia() {
			return dia;
		}
		
		public int getAño() {
			return año;
		}


	   public String toString()
	   { 
	      return String.format("%d/%d/%d", mes, dia, año); 
	   } 

}


