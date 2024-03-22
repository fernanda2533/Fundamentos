import java.util.Locale;
import java.util.Scanner; 
public class Imc { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        /*Variaveis */
        String peso;
        String altura; 
        
        
        /*Entrada de dados */ 
        System.out.println("Informe seu peso: ");
        peso = sc.next().replace(",", "."); 
        System.out.println("Informe sua altura: ");
        altura = sc.next().replace(",", "."); 
        
        double peso1 = Double.parseDouble(peso);
        double altura1 = Double.parseDouble(altura);

        /*Operação */
        double IMC = peso1 / altura1;

        /*Saída */ 
        System.out.printf("Seu IMC é: %.2f", IMC);

        sc.close();
    }


}
