import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);  

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine(); 
        

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine(); 
         

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt(); 

        System.out.printf(" " + nome + " " + sobrenome + " tem %d anos de idade ", idade);

        teclado.close(); 

        




    }
 }

