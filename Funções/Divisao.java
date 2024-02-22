package Funções;
import java.util.Scanner;
public class Divisao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double a, b;

        System.out.println("Digite o valor de A:");
        a = dado.nextDouble();
        System.out.println("Digite o valor de B:");
        b = dado.nextDouble();

        double divisao = calculaDivisao(a, b);
        System.out.println("A divisao dos Valores A(" + a + ") por B(" + b + ") é: " + divisao);
    }
    static double calculaDivisao(double a, double b) {
        return a / b;
    }
}
