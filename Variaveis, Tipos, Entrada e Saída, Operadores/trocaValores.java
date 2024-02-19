import java.util.Scanner;

public class trocaValores {
     public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o valor de A");
        a = dado.nextInt();
        System.out.println("Digite o valor de B");
        b = dado.nextInt();

        System.out.println("Valores inciais: " + a + " e " + b);

        a = a ^ b; // a operaçã0 "^" ou XOR funciona apenas com variaveis int
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nValores após a troca:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
