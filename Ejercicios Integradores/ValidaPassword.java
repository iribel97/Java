import java.util.Scanner;

public class ValidaPassword {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();

        scanner.close();

        if (password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println("La contraseña debe contener al menos una letra mayúscula.");
        } else if (!password.matches(".*[a-z].*")) {
            System.out.println("La contraseña debe contener al menos una letra minúscula.");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("La contraseña debe contener al menos un número.");
        } else if (!password.matches(".*[!@#$%^&*].*")) {
            System.out.println("La contraseña debe contener al menos un carácter especial.");
        } else {
            System.out.println("Contraseña válida.");
        }

    }

}
