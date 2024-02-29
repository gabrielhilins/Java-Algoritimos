import java.util.Scanner;
public class encontraElemento {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int array[] = {10, 20, 4, 9, 11, 19, 4, 20};
        int posicao = -1;

        System.out.println("Qual valor deseja saber se tem no Array?");
        System.out.println("Dica: os valores estão entre 1 e 20");
        int valorProcurado = dado.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorProcurado) {
                posicao = i + 1;
                break;
            }
        }

        // Exibe o resultado
        if (posicao != -1) {
            System.out.print("Array: ");
            for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            }
            System.out.println("\nElemento que deseja encontrar: " + valorProcurado);
            System.out.println("O elemento " + valorProcurado + " se encontra na posição " + posicao);
        } else {
            System.out.print("Array: ");
                for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
                }
            System.out.println("Elemento que deseja encontrar: " + valorProcurado);
            System.out.println("Elemento não encontrado no array.");
        }


    }
}
