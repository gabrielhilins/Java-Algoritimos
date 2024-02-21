import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números da sequência Fibonacci que deseja saber:");
        int quantidade = dado.nextInt();
        
        int numeroAnterior = 0;
        int numeroAtual = 1;
        
        System.out.println("Sequência Fibonacci:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(numeroAnterior + "\t");
            
            int proximoNumero = numeroAnterior + numeroAtual; // A sequencia de fibonacci consiste no valor atual sendo a soma dos dois ultimos valores
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }
        
    }
}
