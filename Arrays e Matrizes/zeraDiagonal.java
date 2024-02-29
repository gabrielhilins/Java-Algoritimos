import java.util.Scanner;

public class zeraDiagonal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        // Solicita o número de linhas e colunas para a matriz
        System.out.println("Quantas linhas terá a Matriz?");
        int linha = dado.nextInt();
        System.out.println("Quantas colunas terá a Matriz?");
        int coluna = dado.nextInt();

        int[][] matriz = new int[linha][coluna];

        // Preenche a matriz com valores fornecidos pelo usuário
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Valor [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = dado.nextInt();
            }
        }

        // Chama a função para zerar a diagonal da matriz
        int[][] diagonalZerada = zerandoDiagonal(matriz, linha, coluna);

        // Exibe a matriz original
        System.out.println("Matriz Original:");
        exibirMatriz(matriz);

        // Exibe a matriz com a diagonal zerada
        System.out.println("Matriz com Diagonal Zerada:");
        exibirMatriz(diagonalZerada);
    }

    public static int[][] zerandoDiagonal(int[][] matriz, int linhas, int colunas) {
        int[][] matrizZerada = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) { // Se estamos na diagonal principal
                    matrizZerada[i][j] = 0; // Zeramos o elemento
                } else {
                    matrizZerada[i][j] = matriz[i][j]; // Caso contrário, copiamos o elemento original
                }
            }
        }
        return matrizZerada;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
