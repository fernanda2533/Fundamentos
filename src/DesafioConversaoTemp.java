import java.util.Scanner; 
public class DesafioConversaoTemp { 
    public static void main(String[] args) {
        /* Definição de variaveis */
        Scanner entrada = new Scanner(System.in);
           
            double celsius; 
            System.out.println("Informe a temperatura em Celsius: ");
            celsius = entrada.nextDouble();
            double conversao = celsius * 1.8 + 32; 
            System.out.printf("A temperatura em Fahrenheit: %.2f", conversao);  

            entrada.close();

    }
}