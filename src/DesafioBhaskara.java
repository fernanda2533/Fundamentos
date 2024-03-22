import java.util.Scanner;
public class DesafioBhaskara { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        /*Variaveis */ 
        double a, b, c, delta, r1, r2; 

        /*Entrada de dados */
        System.out.println("Informe o valor de a: ");
        a = entrada.nextDouble(); 
        System.out.println("Informe o valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Informe o valor de c: ");
        c = entrada.nextDouble();

        /*Operação */ 
        delta = (b*b) - (4*a*c); 
        if((2*a==0) || (delta<0)){
			System.out.print("Impossivel calcular\n");
		}else{
			r1 = ((-1 * b) + Math.sqrt(delta))/(2*a);
			r2 = ((-1 * b) - Math.sqrt(delta))/(2*a);

			System.out.print("R1 = ");
			System.out.printf("%.5f", r1);
			System.out.print("\nR2 = ");
			System.out.printf("%.5f", r2);
			System.out.print("\n"); 

            entrada.close();
        } 
    }
}

    



