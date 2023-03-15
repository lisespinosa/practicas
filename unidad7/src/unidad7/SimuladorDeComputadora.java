package unidad7;
import java.io.DataInput;
import java.util.Scanner;


public class SimuladorDeComputadora {
	Scanner entrada  = new Scanner(System.in);
    static int memoria[]=new int[100];
    int c=0;
    static int n=0;
    int sum=0;
    static int codigoDeOperacion=0;
	static int operando=0;
	static int y=0;
	int registroDeInstruccion=0;
	static int contadorDeIntrucciones=0;
    static int acumulador=0;
    static String a;
	static String w;
	static String n1;
	static String n2;


	public static void main(String[] args) {
		System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instruccion ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");
	
        for( contadorDeIntrucciones=0; contadorDeIntrucciones<100; contadorDeIntrucciones++){
            memoria[contadorDeIntrucciones]=0;
        }





        while (n!=-999){





            if(y<10){
                w="0"+Integer.toString(y);
           
           
            }else{
                w=Integer.toString(y);
            }
            
                System.out.print(w+"?");
                Scanner input = null;
				n=input.nextInt();
                a=Integer.toString(n);
                n2=Character.toString(a.charAt(2))+Character.toString(a.charAt(3));
                n1=Character.toString(a.charAt(0))+Character.toString(a.charAt(1));
                codigoDeOperacion=Integer.valueOf(n1);
                operando=Integer.valueOf(n2);
                




                    if (codigoDeOperacion==10){
                        System.out.print("Ingrese el entero: ");
                        n=input.nextInt();
                        memoria[operando]=n;





                    }else if(codigoDeOperacion==30){
                         System.out.print("Ingrese el entero a sumar: ");
                        n=input.nextInt();
                       
                        memoria[operando]=memoria[operando]+n;




                    }else if(codigoDeOperacion==31){
                         System.out.print("Ingrese el entero a restar: ");
                        n=input.nextInt();
                        memoria[operando]=memoria[operando]-n;




                    }else if(codigoDeOperacion==32){
                         System.out.print("Ingrese el entero a dividir: ");
                            n=input.nextInt();
                            memoria[operando]=memoria[operando]/n;



                    }else if(codigoDeOperacion==33){
                         System.out.print("Ingrese el entero a multipicar: ");
                            n=input.nextInt();
                            memoria[operando]=memoria[operando]*n;




                    }else if (codigoDeOperacion==20){
                        System.out.print("Ingrese el entero: ");
                        n=input.nextInt();
                        acumulador=n;






                    }else if (codigoDeOperacion==21){
                        memoria[operando]=acumulador;





                    }else if (codigoDeOperacion==11){
                        System.out.println(memoria[operando]);





                    }else if (codigoDeOperacion==43){
                        n=-999;
              
              
              
              
              
                    }else if (codigoDeOperacion==40){
                        contadorDeIntrucciones=operando;
                  
                  
                  
                  
                  
                    }else if (codigoDeOperacion==41){
                        if (acumulador<0){
                            contadorDeIntrucciones=operando;
                        }
                   
                   
                   
                   
                   
                   
                    }else if (codigoDeOperacion==42){
                        if (acumulador==0){
                            contadorDeIntrucciones=operando;
                        }
                    }

                y++;
            

        }
        System.out.println("*** Se completo la carga del programa ***");
        System.out.println("*** Empieza la ejecucion del programa ***");








        for( contadorDeIntrucciones=0; contadorDeIntrucciones<100; contadorDeIntrucciones++){






            
            if(contadorDeIntrucciones<10){
                w="0"+Integer.toString(contadorDeIntrucciones);
            }else{
                w=Integer.toString(contadorDeIntrucciones);
            }
            System.out.println(w+"? "+memoria[contadorDeIntrucciones]);
        }

    

    }



    }
	