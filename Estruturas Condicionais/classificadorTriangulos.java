import java.util.*;
public class classificadorTriangulos {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Digite o valor do lado 1:");
        lado1 = dado.nextInt();
        System.out.println("Digite o valor do lado 2");
        lado2 = dado.nextInt();
        System.out.println("Digite o valor do lado 3");
        lado3 = dado.nextInt();

        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            System.out.println("O triângulo é Equilátero!");
        }
        if (lado1 != lado2 || lado1 != lado3 || lado2 != lado3) {
            System.out.println("O triângulo é Isósceles!");
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("O triângulo é Escaleno!");
        }
    }
}
