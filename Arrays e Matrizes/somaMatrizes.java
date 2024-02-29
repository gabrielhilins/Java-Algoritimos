import java.util.Scanner;

public class somaMatrizes {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        // Solicita o número de linhas e colunas para a primeira matriz
        System.out.println("Quantas linhas terão as Matrizes 1 e 2?");
        int linha = dado.nextInt();
        System.out.println("Quantas colunas terão as Matrizes 1 e 2?");
        int coluna = dado.nextInt();

        // Declaracao das matrizes tendo linhas e colunas determinadas pelo usuario
        int[][] matriz1 = new int[linha][coluna];
        int[][] matriz2 = new int[linha][coluna];

        // Loops para perguntar os valores [linha][coluna] da Matriz 1
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Valor [" + (i + 1) + "][" + (j + 1) + "] da Matriz 1:");
                matriz1[i][j] = dado.nextInt();
            }
        }

        // Loops para perguntas os valores [linha][coluna] da Matriz 2
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Valor [" + (i + 1) + "][" + (j + 1) + "] da Matriz 2:");
                matriz2[i][j] = dado.nextInt();
            }
        }
        
        // inicializacao do resultado da matriz somada
        // usando a funcao somarMatrizes com os parametros matriz1 e matriz2 (declaradas anteriormente)
        int[][] resultado = somarMatrizes(matriz1, matriz2);

        // Chamando a funcao exibeMatrizes para mostrar as matrizes, incluindo a matriz somada
        exibeMatrizes(matriz1, matriz2, resultado);
    }

    // Método para somar duas matrizes
    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] resultado = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    // Método para exibir as matrizes
    public static void exibeMatrizes(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        System.out.println("Matriz 1:");
        exibirMatriz(matriz1);

        System.out.println("Matriz 2:");
        exibirMatriz(matriz2);

        System.out.println("Matriz Somada:");
        exibirMatriz(resultado);
    }

    // Método para exibir uma matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
