import java.util.Scanner;

public class numerosImparesEntre2Num {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numero1, numero2;
        int maior, menor;

        System.out.println("Digite um número:");
        numero1 = dado.nextInt();
        System.out.println("Digite outro número:");
        numero2 = dado.nextInt();

        if (numero1 > numero2) {
            maior = numero1;
            menor = numero2;
        } else {
            maior = numero2;
            menor = numero1;
        }

        System.out.println("Números Ímpares entre " + menor + " e " + maior + ":");
        for (int i = menor; i < maior; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
