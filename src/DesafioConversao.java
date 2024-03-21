import java.util.Scanner;

public class DesafioConversao { 
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Informe o salário de Fernanda: "); 
        String salario1 = entrada.nextLine();
        System.out.println("\nInforme o salário de Isadora: \n");
        String salario2 = entrada.nextLine();
        System.out.println("\nInforme o salário de Kaic: "); 
        String salario3 = entrada.nextLine(); 
        
        Double salarioF = Double.parseDouble(salario1); 
        Double salarioI = Double.parseDouble(salario2); 
        Double salarioK = Double.parseDouble(salario3); 

        Double soma = salarioF + salarioI + salarioK; 

        System.out.println("O salario de Fernanda é: " +salarioF + "\nO salário de Isadora é: " + salarioI
        + "\nO salario de Kaic é: " + salarioK + "\nA média do salário dos três é de: " + soma);


        entrada.close(); 

    }

}
