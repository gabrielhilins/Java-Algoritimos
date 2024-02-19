import java.util.Scanner;

public class compara2Num {
     public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double a, b;

        System.out.println("Digite o valor de A");
        a = dado.nextDouble();
        System.out.println("Digite o valor de B");
        b = dado.nextDouble();

       if (a > b) {
        System.out.println("A > B");
       }
       if (a < b) {
        System.out.println("A < B");
       }
       if (a == b){
        System.out.println("A = B");
       }
    }
}
