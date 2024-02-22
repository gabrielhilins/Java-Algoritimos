package Funções;
import java.util.*;
public class Subtracao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o valor de A:");
        a = dado.nextInt();
        System.out.println("Digite o valor de B:");
        b = dado.nextInt();

        int subtracao = calculaSubtracao(a, b);
        System.out.println("A subtracao dos Valores A(" + a + ") e B(" + b + ") é: " + subtracao);
    }
    static int calculaSubtracao(int a, int b) {
        return a- b;
    }
}
