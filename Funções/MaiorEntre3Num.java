package Funções;

public class MaiorEntre3Num {

    public static void main(String[] args) {
        int a = 20;
        int b = 65;
        int c = 2;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        int maior = verificaMaior(a, b, c);
        System.out.println("O maior número é: " + maior);
    }

    
    static int verificaMaior(int a, int b, int c) {
        int maior = a; // Começaremos supondo que o primeiro valor vai ser o maior

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        return maior;
    }
}
