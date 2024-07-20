import java.util.Scanner;

public class NumPrimos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            

            /*
             * VARIABLES
             */
            int numUsu, cont = 0;

            do {

                if (cont > 2) {
                    System.out.print("El número ingresado no es primo. Ingrese de nuevo un número: ");
                } else {
                    System.out.print("Ingrese un número (0 en caso de querer salir): ");
                }
                
                numUsu = scanner.nextInt();
                cont = 0;

                if (numUsu != 0) {
                    
                    for (int i = 1; i <= numUsu; i++) {
                        if (numUsu % i == 0) {
                            cont++;
                        }
                    }
    
                    if (cont == 2) {
                        System.out.println("El número " + numUsu + " es primo.");
                    }
                    
                }

                
            } while (numUsu != 0);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
