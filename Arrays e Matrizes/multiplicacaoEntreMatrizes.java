import java.util.*;

public class multiplicacaoEntreMatrizes {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Solicita o número de linhas e colunas para a primeira matriz
        System.out.println("Quantas linhas terá a Matriz 1?");
        int linha = dado.nextInt();
        System.out.println("Quantas colunas terá a Matriz 1?");
        int coluna = dado.nextInt();

        // Solicita o número de linhas e colunas para a segunda matriz
        System.out.println("Quantas linhas terá a Matriz 2?");
        int linha2 = dado.nextInt();
        System.out.println("Quantas colunas terá a Matriz 2?");
        int coluna2 = dado.nextInt();

        // Verifica se a multiplicação entre as matrizes é possível
        if (coluna != linha2) {
            System.out.println("Não é possível realizar a multiplicação entre as matrizes!");
            System.out.println("Obs: O número de COLUNAS da PRIMEIRA matriz deve ser IGUAL ao número de LINHAS da SEGUNDA matriz");
            System.out.println("Tente novamente");
            return;
        }

        // Cria as matrizes baseadas nas dimensões fornecidas
        int matriz1[][] = new int[linha][coluna];
        int matriz2[][] = new int[linha2][coluna2];

        // Preenche a primeira matriz com valores fornecidos pelo usuário
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Valor [" + (i + 1) + "][" + (j + 1) + "] da Matriz 1: ");
                matriz1[i][j] = dado.nextInt();
            }
        }

        // Preenche a segunda matriz com valores fornecidos pelo usuário
        for (int i = 0; i < linha2; i++) {
            for (int j = 0; j < coluna2; j++) {
                System.out.print("Valor [" + (i + 1) + "][" + (j + 1) + "] da Matriz 2: ");
                matriz2[i][j] = dado.nextInt();
            }
        }

        // Realiza a multiplicação das matrizes
        int[][] resultado = multiplicaMatriz(matriz1, matriz2, linha, coluna2, coluna);

        // Exibe as matrizes e o resultado da multiplicação
        exibeMatrizes(matriz1, matriz2, resultado);
    }

    // Método para multiplicar duas matrizes
    public static int[][] multiplicaMatriz(int matriz1[][], int matriz2[][], int linha, int coluna2, int coluna) {
        int resultado[][] = new int[linha][coluna2];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna2; j++) {
                for (int k = 0; k < coluna; k++) {
                    // O loop "k" ocorre para a dimensao compartilhada entre as duas matrizes
                    // dimensao compartilhada = colunas da matriz1 igual ao numero de linhas matriz2
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    // Método para exibir as matrizes
    public static void exibeMatrizes(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz Multiplicada:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
