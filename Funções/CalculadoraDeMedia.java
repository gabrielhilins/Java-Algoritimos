package Funções;
import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        // Solicita ao usuário o tamanho do array
        System.out.println("Digite o tamanho do array:");
        int tamanho = dado.nextInt();
        
        // Cria um array com o tamanho especificado pelo usuário
        double[] numeros = new double[tamanho];
        
        // Solicita ao usuário que insira os valores para cada posição do array
        for (int i = 0; i < tamanho + 1; i++) {
            System.out.println("Digite o valor para a posição " + i + ":");
            numeros[i] = dado.nextDouble();
        }

        System.out.println("Números do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        double media = calcularMedia(numeros);
        System.out.println("A média desses números é: " + media);
    }

    
    static double calcularMedia(double[] numeros) {
        double soma = 0;

        // Calcula a soma de todos os números no array
        for (double numero : numeros) {
            soma += numero;
        }

        // Calcula a média dividindo a soma pelo número de elementos no array
        double media = soma / numeros.length;
        return media;
    }
}
