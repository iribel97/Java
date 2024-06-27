import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args){

        //Instanciar la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        double num1, num2, resultado;
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

        //Switch para realizar la operación seleccionada
        switch(opcion){
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("No se puede dividir por cero");
                }else{
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                }
                break;
            default:
                System.out.println("Opción no válida");
        }

        //Cerrar el scanner
        scanner.close();

    }
}
