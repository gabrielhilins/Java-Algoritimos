import java.util.*;
public class mediaDosNumeros {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numero;

        int i = 1;
        int soma = 0;
        

        System.out.println("Digite um número inteiro:");
        numero = dado.nextInt();

    

        while (numero != 0) {
            soma += numero;
            i++;
            System.out.println("Número " + i + ": ");

            numero = dado.nextInt();
            System.out.println();
            System.out.println("Aviso: Para parar de digitar números, digite 0");
            System.out.println();
            
        }

        if (i != 0) {
            double media = (double) soma / i;
            double mediaArredondada = Math.round(media);
            System.out.println("A média dos números inseridos é: " + mediaArredondada);
        } 
        else {
            System.out.println("Nenhum número foi inserido.");
        }

    }
}
