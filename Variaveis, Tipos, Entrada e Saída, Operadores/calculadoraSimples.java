import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double a, b, soma, sub, mult, div;

        System.out.println("Digite o valor de A:");
        a = dado.nextDouble();
        System.out.println("Digite o valor de B:");
        b = dado.nextDouble();

        System.out.println("Quais das operações deseja realizar:");
        System.out.println("1) Soma");
        System.out.println("2) Subtração");
        System.out.println("3) Multiplicação");
        System.out.println("4) Divisão");

        System.out.println("Opção: ");
        int escolha = dado.nextInt();

        switch (escolha) {
            case 1:
                soma = a + b;
                System.out.println("O valor da soma de " + a + " + " + b + " é : " + soma);
                break;
            case 2:
                sub = a - b;
                System.out.println("O valor da subtração de " + a + " - " + b + " é : " + sub);
                break;
            case 3:
                mult = a * b;
                System.out.println("O valor da multiplicação de " + a + " x " + b + " é : " + mult);
                break;
            case 4:
                div = a / b;
                System.out.println("O valor da divisão de " + a + " / " + b + " é : " + div);
            break;
            default:
                break;
        }
    }
}
