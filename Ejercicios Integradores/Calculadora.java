import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args){

        //Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        double num1, num2;
        int opcion;

        //Pedir al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        //Menu de opciones
        System.out.println("|------------------------------|" + "\n" +
                           "|      MENU DE OPERACIONES     |" + "\n" +
                           "|------------------------------|" + "\n" +
                           "| 1. SUMA                      |" + "\n" +
                           "| 2. RESTA                     |" + "\n" +
                           "| 3. MULTIPLICACION            |" + "\n" +
                           "| 4. DIVISION                  |" + "\n" +
                           "|------------------------------|"
                            );
        System.out.print("Ingrese la opción deseada: ");
        opcion = scanner.nextInt();

        System.out.println((opcion == 1) ? ("La suma de los dos números es: " + (num1 + num2)) 
                            : (opcion == 2) ? ("La resta de los dos números es: " + (num1 - num2)) 
                            : (opcion == 3) ? ("La multiplicación de los dos números es: " + (num1 * num2)) 
                            : (opcion == 4) ? ((num2 != 0) ? ("La división de los dos números es: " + (num1 / num2)) : "No se puede dividir por cero")
                            : "Opción no válida");

        //Cerrar el scanner
        scanner.close();

    }
}
