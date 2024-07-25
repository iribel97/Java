import java.util.Arrays;
import java.util.Scanner;

public class ManipularOraciones {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            //VARIABLES
            int opc;
            String oracion = "";

            do {

                System.out.print("|-------------------------------------------------------|"+ 
                               "\n|                    MENU DE OPCIONES                   |"+
                               "\n|-------------------------------------------------------|"+
                               "\n| 1. Crear oración o Borrar oración                     |"+
                               "\n| 2. Cantidad de caracteres de la oración               |"+
                               "\n| 3. Cantidad de palabras de la oración                 |"+
                               "\n| 4. Mostrar palabras ordenadas alfabéticamente         |"+
                               "\n| 5. Ingresar un número y devolver la palabra           |"+
                               "\n| 6. Buscar palabra dentro de la oración                |"+
                               "\n| 7. Modificar palabra dentro de la oración             |"+
                               "\n| 8. Agregar contenido a la oración                     |"+
                               "\n| 9. Salir                                              |"+
                               "\n|-------------------------------------------------------|"+
                               "\nIngrese una opción: ");
                opc = scan.nextInt();

                switch (opc) {
                    case 1:

                        if (oracion.isEmpty()) {
                            System.out.println("Crear oración");
                            System.out.println("Ingrese una oración: ");
                            scan.nextLine();
                            oracion = scan.nextLine();
                        } else {
                            System.out.println("Borrar oración");
                            oracion = "";
                        }
                        
                        break;
                    
                    case 2:
                        if (oracion.isEmpty()) {
                            System.out.println("La oración está vacía");
                        } else {
                            System.out.println("Cantidad de caracteres de la oración: " + oracion.length());
                        }
                        break;

                    case 3:
                        if (oracion.isEmpty()) {
                            System.out.println("La oración está vacía");
                        } else {
                            System.out.println("Cantidad de palabras de la oración: " + oracion.split(" ").length);
                        }
                        break;
                    
                    case 4:
                        if (oracion.isEmpty()) {
                            System.out.println("La oración está vacía");
                        } else {
                            String[] palabras = oracion.split(" ");
                            Arrays.sort(palabras);
                            System.out.println("Palabras ordenadas alfabéticamente: ");
                            for (String palabra : palabras) {
                                System.out.print(palabra + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 5:
                        if (oracion.isEmpty()) {
                            System.out.println("La oración está vacía");
                        } else {
                            System.out.print("Ingrese un número: ");
                            int num = scan.nextInt();
                            if (num > 0 && num <= oracion.split(" ").length) {
                                System.out.println("La palabra correspondiente al número ingresado es: " + oracion.split(" ")[num-1]);
                            } else {
                                System.out.println("Número inválido. Intente nuevamente");
                            }
                        }
                        break;

                    case 6:
                        if (oracion.isEmpty()) {
                            System.out.println("La oración está vacía");
                        } else {
                            System.out.print("Ingrese una palabra: ");
                            scan.nextLine();
                            String palabra = scan.nextLine();
                            if (oracion.contains(palabra)) {
                                System.out.println("La palabra fue encontrada en la posición: " + oracion.indexOf(palabra));
                            } else {
                                System.out.println("La palabra no fue encontrada");
                            }
                        }
                        break;

                    case 7:
                        if (oracion.isEmpty()) {
                            System.out.println("La oración está vacía");
                        } else {
                            System.out.print("Ingrese la palabra que desea cambiar: ");
                            scan.nextLine();
                            String palabraVieja = scan.nextLine();
                            if (oracion.contains(palabraVieja)) {
                                System.out.print("Ingrese la nueva palabra: ");
                                String palabraNueva = scan.nextLine();
                                oracion = oracion.replace(palabraVieja, palabraNueva);
                                System.out.println("Oración modificada: " + oracion);
                            } else {
                                System.out.println("La palabra no fue encontrada");
                            }
                        }
                        break;

                    case 8:
                        System.out.print("Ingrese contenido para agregar a la oración: ");
                        scan.nextLine();
                        String contenido = scan.nextLine();
                        oracion += " " + contenido;
                        System.out.println("Oración modificada: " + oracion);
                        break;

                    case 9:
                        System.out.println("Saliendo...");
                        break;
                
                    default:
                        System.out.println("Opción inválida. Intente nuevamente");
                        break;
                }

                
            } while (opc != 9);


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close();
        }
    }

}