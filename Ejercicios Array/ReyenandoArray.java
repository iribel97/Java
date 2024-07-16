import java.util.Arrays;
import java.util.Scanner;

public class ReyenandoArray {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Solicitar tamaño
        System.out.print("Introduce el tamaño del arreglo: ");
        int tamano = scanner.nextInt();
        System.out.print("Introduce el número con el que quieres rellenar el arreglo: ");
        int numero = scanner.nextInt();

        scanner.close();
        //Crear arreglo
        int[] arrayNum = new int[tamano];

        //Rellenar
        Arrays.fill(arrayNum, numero);

        //Mostrar
        System.out.println("Array: " + Arrays.toString(arrayNum));
    }

}
