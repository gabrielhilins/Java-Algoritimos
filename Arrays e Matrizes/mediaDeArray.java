import java.util.Scanner;
public class mediaDeArray {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in); // chamada da biblioteca scanner
        int soma = 0; // inicializacao da variavel soma para armazenar a soma dos valores

        // Pergunta ao usuario 1
        System.out.println("Digite o tamanho do Array:");
        int tamanho = dado.nextInt();
        
        int array[] = new int[tamanho]; // inicializacao do array de acordo com o tamanho fornecido pelo usuario

        System.out.println("Digite os valores do array de " + tamanho + " valores");

        // Loop para perguntar os valores especificos
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Valor " + (i + 1) + ":");
            array[i] = dado.nextInt();
        }

        // loop para fazer a soma dos valores do array
        for (int i = 0; i < tamanho; i++) {
            soma += array[i];
        }

        double media = soma / tamanho;

        System.out.println("Tamanho do Array: " + tamanho);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores do Array: " + media);

    }
}
