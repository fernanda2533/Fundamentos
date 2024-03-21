public class DesafioOperadores {
    public static void main(String[] args) {
        
        /* int b = (int) Math.pow(a, 3); */
        /* System.out.println(b); */ 
        
        double exp1 = (((6 * (3 + 2)) * (6 * (3 + 2)))  / (3 * 2));
        double exp2 = ((((1 - 5) * (2 - 7)) / 2) * (((1 - 5) * (2 - 7)) / 2)  ); 
        double exp3 = exp1 - exp2;
        double exp4 = Math.pow(exp3, 3); 
        double exp5 = Math.pow(10 ,3);
        double exp6 = exp4 / exp5; 

        System.out.println(exp6); 

    }

}
