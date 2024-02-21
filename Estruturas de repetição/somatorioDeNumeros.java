import java.util.Scanner;
public class somatorioDeNumeros {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int n;
    
        System.out.println("Digite o valor de N (Último numero que sera somado):");
        n = dado.nextInt();

        int soma = 0, i = 1;

        do {
            soma += i;
            i++;
        }
        while (i <= n); 
            System.out.println("A soma dos números de 1 até " + n + " é: " + soma);
        


    }
}
