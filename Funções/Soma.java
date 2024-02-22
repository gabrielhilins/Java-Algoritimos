package Funções;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o valor de A:");
        a = dado.nextInt();
        System.out.println("Digite o valor de B:");
        b = dado.nextInt();

        int soma = calculaSoma(a, b);
        System.out.println("A soma dos Valores A(" + a + ") e B(" + b + ") é: " + soma);
    }
    static int calculaSoma(int a, int b) {
        return a + b;
    }
}
