public class Funciones {
    public static double funcRecursiva1 (double valor, double exponente){
        if (exponente == 0){
            return 1;
        } else {
            return valor * funcRecursiva1(valor, exponente - 1);
        }
    }
    public static double funcRecursiva2 (double valor, double exponente){
        if (exponente == 0){
            return 1;
        } else if (exponente % 2 != 0){
            return valor * funcRecursiva2(valor, (exponente - 1) / 2) * funcRecursiva2(valor, (exponente - 1) / 2);
        } else {
            return funcRecursiva2(valor, exponente / 2) * funcRecursiva2(valor, exponente / 2);
        }
    }
}

