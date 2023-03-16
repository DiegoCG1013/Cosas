import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un valor: ");
            double valor = sc.nextDouble();
            System.out.println("Introduce un exponente: ");
            double exponente = sc.nextDouble();
            System.out.println("El resultado de la función recursiva 1 es: " + Funciones.funcRecursiva1(valor, exponente));
            System.out.println("El resultado de la función recursiva 2 es: " + Funciones.funcRecursiva2(valor, exponente));
        } catch (Exception e) {
            System.out.println("No has introducido un número");
        }
    }
}
