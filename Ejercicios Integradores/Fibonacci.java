public class Fibonacci {
    
    public static void main(String[] args) {
        
        /*
         * VARIABLES
         */
        //Numeros totales de la serie
        int cant = 8;
        //Otras variables
        int ini = 0, sig = 1, temp;
        int cont = 0;

        while (cont < cant) {
            System.out.print(ini + " ");
            temp = ini;
            ini = sig;
            sig = temp + sig;
            cont++;
            
        }

    }

}
