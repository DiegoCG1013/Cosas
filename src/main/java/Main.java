import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Aplicacion();
    }
    public static void Aplicacion(){
        try {
            int funcion = eligeFuncion();
            eligeValores(funcion);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Aplicacion();
        }
    }
    public static int eligeFuncion(){
        System.out.println("Elige una función: ");
        System.out.println("1. Función recursiva 1");
        System.out.println("2. Función recursiva 2");
        int funcion = sc.nextInt();
        return funcion;
    }
    public static void eligeValores(int funcion) throws Exception{
        System.out.println("Introduce el valor de la base: ");
        double valor = sc.nextDouble();
        System.out.println("Introduce el valor del exponente: ");
        double exponente = sc.nextDouble();
        if (funcion == 1){
            System.out.println("Con la funcion recursiva 1: " + Funciones.funcRecursiva1(valor, exponente));
        } else if (funcion == 2){
            System.out.println("Con la funcion recursiva 2: " + Funciones.funcRecursiva2(valor, exponente));
        } else {
            throw new Exception("Elige una opción válida");
        }
    }
}
