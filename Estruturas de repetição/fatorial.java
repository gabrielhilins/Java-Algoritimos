// Este programa calcula o fatorial de qualquer valor inteiro que o usuario digitar
import java.util.*;
public class Fatorial {
    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite o valor que deseja encontrar o fatorial");
        numero = dado.nextInt();
        
        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " e: " + fatorial);
    }
}
