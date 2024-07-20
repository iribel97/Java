import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            //Variables
            int numUsu, factorial = 1, temp = 1;

            System.out.print("Ingrese un número: ");
            numUsu = scanner.nextInt();

            scanner.close();

            if (numUsu != 0) {
                
                do {
                    factorial *= temp;
                    temp++;
                } while (temp <= numUsu);

                System.out.println("El factorial de " + numUsu + "! es " + factorial);

            } else {
                System.out.println("El factorial de 0 es 1");
            }

        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());

        }

    }

}
