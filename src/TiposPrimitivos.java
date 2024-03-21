public class TiposPrimitivos {
    public static void main(String[] args) { 
        // Dados dos funcionarios // 

        // Tipos numéricos inteiros // 
        byte anosDeEmpresa = 23; 
        short numeroDeVoos = 542;
        int id = 56789; 
        long pontosAcumulados = 3234845223L; 

        // Tipos numericos com ponto flutuante // 
        float salario = 1144544f; 
        double vendasAcumuladas = 2_991_997_103.01; 

        // Tipos booleano // 
        boolean estaDeFerias = false; //true or false // 

        // Tipo caractere // 
        char status = 'A'; // Ativo //

        // Dias de Empresa // 
        System.out.println(anosDeEmpresa * 365); 

        // Numeros de Viagens // 
        System.out.println(numeroDeVoos / 2); 

        // Pontos Acumulados e Vendas Acumuladas // 
        System.out.println(pontosAcumulados / vendasAcumuladas);  
        System.out.println(id + " ganha -> " + salario); 
        System.out.println("Férias? " + estaDeFerias); 
        System.out.println(id + " está: " + status);







    
    }

}
