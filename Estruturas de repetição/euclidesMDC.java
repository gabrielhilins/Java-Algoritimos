// O algoritmo de Euclides explora uma propriedade interessante: o MDC de dois números a e b é igual ao MDC de b e o resto da divisão de a por b
import java.util.*;
public class euclides {
    
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int a, b;
        
        System.out.println("Digite o valor de A");
        a = dado.nextInt();
        System.out.println("Digite o valor de B");
        b = dado.nextInt();
        
       System.out.println("O MDC de " + a + " e " + b + " e: " + mdc(a, b));
    }
    
    public static long mdc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdc(b, a % b);
        }
    }
}
