// A sequencia de fibonacci consiste no valor atual sendo a soma dos dois ultimos valores
import java.util.*;
public class fibonacci {
    
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int quantidade;
        
        System.out.println("Digite a quantidade de numeros da sequencia Fibonacci que deseja saber?");
        quantidade = dado.nextInt();
      
            for (int i = 0; i < quantidade; i++) {
            System.out.print("(" + i + "):" + fibo(i) + "\t");
        }
    }
    
    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
