import java.util.Scanner; 
public class DesafioCalculadora { 
    
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / % 
        Scanner entrada = new Scanner (System.in); 
            /* Dados de Entrada do usuário */
        double num1; 
        double num2; 
        String operacao; 

        System.out.println("Informe um primeiro número: ");
        num1 = entrada.nextDouble(); 
        System.out.println("Informe um segundo número: ");
        num2 = entrada.nextDouble(); 
        System.out.println("Informe a operação:");
        operacao = entrada.next();   


            /* Operações */ 
        double resultado = "+".equals(operacao) ? num1 + num2 : 0; 
        resultado = "-".equals(operacao) ? num1 - num2 : resultado; 
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado; 

            /* Saída */ 
        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        
            /* Finalizando Scanner */ 
            entrada.close(); 
    }
            
}
 