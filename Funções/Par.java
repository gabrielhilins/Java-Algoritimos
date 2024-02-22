package Funções;
import java.util.Scanner;
public class Par {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número:");
        numero = dado.nextInt();
        boolean resultado = verificaPar(numero);
        
        if (resultado) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }

    // Método estático para verificar se um número é par
    static boolean verificaPar(int numero) {
        return numero % 2 == 0;
    }
}
