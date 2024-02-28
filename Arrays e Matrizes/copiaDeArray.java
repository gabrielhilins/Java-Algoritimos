import java.util.Scanner;

public class copiaDeArray {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do Array:");
        int tamanho = dado.nextInt();
        
        int array1[] = new int[tamanho]; // inicializacao do array de acordo com o tamanho fornecido pelo usuario

        System.out.println("Digite os valores do array de " + tamanho + " valores");

        // Loop para perguntar os valores especificos
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Valor " + (i + 1) + ":");
            array1[i] = dado.nextInt();
        }

        // Criar uma nova array e copiar os valores de array1 para array2
        int array2[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Array 1:");
        for (int valor : array1) {
            System.out.print(valor + " ");
        }
        System.out.println(); // Adicionar uma quebra de linha para separar as saídas

        System.out.println("Copia do Array 1:");
        for (int valor : array2) {
            System.out.print(valor + " ");
        }
        System.out.println(); // Adicionar uma quebra de linha para separar as saídas
    }   
}
