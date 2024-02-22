package Funções;
import java.util.Scanner;
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o valor de A:");
        a = dado.nextInt();
        System.out.println("Digite o valor de B:");
        b = dado.nextInt();

        int multiplicacao = calculaMultiplicacao(a, b);
        System.out.println("A multiplicacao dos Valores A(" + a + ") e B(" + b + ") é: " + multiplicacao);
    }
    static int calculaMultiplicacao(int a, int b) {
        return a * b;
    }
}
