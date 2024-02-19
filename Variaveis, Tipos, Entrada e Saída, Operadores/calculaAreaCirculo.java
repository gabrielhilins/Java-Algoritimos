import java.util.Scanner;

public class calculaAreaCirculo {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double pi = Math.PI;
        double raio, area;

        System.out.println("Digite o valor do raio da circuferência em cm em questão:");
        raio = dado.nextDouble();

        area = pi * raio * raio;

        System.out.println("A área da circunferência de raio " + raio + "cm é igual a: " + area + "cm");

    }
}
