import java.util.Scanner;

public class matrizTransposta {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.println("Quantas linhas terá a Matriz 1?");
        int linha = dado.nextInt();
        System.out.println("Quantas colunas terá a Matriz 1?");
        int coluna = dado.nextInt();

        int matriz1[][] = new int[linha][coluna];
        int matrizTransposta[][] = new int[coluna][linha]; // Corrigido: trocado linha por coluna

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Valor [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz1[i][j] = dado.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizTransposta[j][i] = matriz1[i][j];
            }
        }

        System.out.println("Matriz 1:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz1[i][j] + ", "); // Usando print em vez de println
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }

        System.out.println("Matriz Transposta:");
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.print(matrizTransposta[i][j] + ", "); // Usando print em vez de println
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }
}
