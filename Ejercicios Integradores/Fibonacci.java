import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            /*
             * VARIABLES
             */
            //Numeros totales de la serie ahora ingrgesado por el susuario
            int cant;
            //Otras variables
            int ini = 0, sig = 1, temp;
            int cont = 0;

            System.out.print("Ingrese la cantidad de números de la serie Fibonacci: ");
            cant = scanner.nextInt();

            scanner.close();
    
            while (cont < cant) {
                System.out.print(ini + " ");
                temp = ini;
                ini = sig;
                sig = temp + sig;
                cont++;
                
            }
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        }
        

    }

}
