import java.util.Scanner;

/**
 * Clase que permite calcular el área de diferentes figuras geométricas.
 */
public class FigurasGeometricas {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Argumentos de línea de comando.
     */
    public static void main(String[] args) {
        float area; // Variable para almacenar el área calculada
        int opcion; // Variable para almacenar la opción seleccionada por el usuario
        final float PI = 3.14159f; // Constante para el valor de PI
        Scanner sc = new Scanner(System.in); // Objeto para leer datos del usuario

        do {
            // Menú de opciones
            System.out.println("Elige la opción:");
            System.out.println("1.- Área de círculo");
            System.out.println("2.- Área de triángulo");
            System.out.println("3.- Área de cuadrado");
            System.out.println("4.- Salir");
            opcion = sc.nextInt();

            // Switch para determinar la operación a realizar según la opción seleccionada
            switch (opcion) {
                case 1:
                    // Cálculo del área del círculo
                    System.out.println("Seleccionó el círculo");
                    System.out.print("Ingrese el radio: ");
                    float radio = sc.nextFloat();
                    area = PI * radio * radio;
                    System.out.println("El área es: " + area);
                    break;
                case 2:
                    // Cálculo del área del triángulo
                    System.out.println("Seleccionó el triángulo");
                    System.out.print("Ingrese la base: ");
                    float base = sc.nextFloat();
                    System.out.print("Ingrese la altura: ");
                    float altura = sc.nextFloat();
                    area = (base * altura) / 2;
                    System.out.println("El área es: " + area);
                    break;
                case 3:
                    // Cálculo del área del cuadrado
                    System.out.println("Seleccionó el cuadrado");
                    System.out.print("Ingrese el lado: ");
                    float lado = sc.nextFloat();
                    area = lado * lado;
                    System.out.println("El área es: " + area);
                    break;
                case 4:
                    // Opción para salir del programa
                    System.out.println("Hasta luego");
                    break;
                default:
                    // En caso de que la opción seleccionada no sea válida
                    System.out.println("Su elección no es correcta");
            }
        } while (opcion != 4); // El ciclo se repite mientras no se seleccione la opción 4 (Salir)

        sc.close(); // Cerrar el objeto Scanner
    }
}