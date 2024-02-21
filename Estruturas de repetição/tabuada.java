import java.util.*;
public class tabuada {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numeroUsuario, resultado;

        System.out.println("Digite um número que você queira saber a tabuada dele:");
        numeroUsuario = dado.nextInt();

        for (int i = 1; i <= 10; i++) {
            resultado = numeroUsuario * i;
            System.out.println("" + numeroUsuario + " x " + i + " = " + resultado);
        }


    }
}
