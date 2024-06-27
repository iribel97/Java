import java.util.Scanner;

public class NumParImpar {

    public static void main(String[] args) {
    
        //Instaciar variable que va a leer lo que el ususario ingrese por consola
        Scanner scanner = new Scanner(System.in);

        //Variables que se van a utilizar
        int num;
        boolean esPar;

        //Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        num = scanner.nextInt();

        //Calcular si el número es par o impar
        esPar = (num % 2 == 0);

        //Mostrar el resultado
        System.out.println("El número " + num + " es " + (esPar ? "par" : "impar"));

        //Cerrar el scanner
        scanner.close();
    
    }
}
