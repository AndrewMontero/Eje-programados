import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El numero ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero ingresado es negativo.");
        } else {
            System.out.println("El numero ingresado es cero.");
        }
    }
}
