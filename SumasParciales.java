import java.util.Scanner;

/**
 * Clase que suma todos los números pares entre dos números dados por el usuario.
 */
public class SumasParciales {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args Argumentos de línea de comando.
     */
    public static void main(String[] args) {
        // Declaración de variables
        int n1, n2;
        int suma = 0;
        int mayor, menor;
        
        // Crear un objeto Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario el primer número
        System.out.println("Por favor introduzca un número entero");
        n1 = sc.nextInt();
        
        // Solicitar al usuario el segundo número
        System.out.println("Introduzca otro número entero");
        n2 = sc.nextInt();
        
        // Determinar cuál número es el mayor y cuál es el menor
        if (n1 > n2) {
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }
        
        // Iterar desde el número menor hasta el número mayor
        for (int i = menor; i <= mayor; i++) {
            // Si el número es par, añadirlo a la suma
            if (i % 2 == 0) {
                suma += i;
            }
        }
        
        // Mostrar el resultado de la suma de números pares
        System.out.println("La suma de los pares entre " + n1 + " y " + n2 + " es " + suma);
        
        // Cerrar el objeto Scanner
        sc.close();
    }
}