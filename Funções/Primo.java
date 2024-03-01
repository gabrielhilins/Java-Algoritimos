package Funções;
import java.util.*;
public class Primo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite um Número:");
        int n1 = dado.nextInt();

        if (encontraPrimo(n1)) {
            System.out.println(n1 + " é PRIMO!");
        } else {
            System.out.println(n1 + " NÃO é PRIMO!");
        }

    }

    static boolean encontraPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se for divisivel, entao ele nao é primo
            }
        }
        return true;
    }
}
