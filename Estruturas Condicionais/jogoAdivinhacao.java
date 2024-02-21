import java.util.*;
public class jogoAdivinhacao {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int chuteUsuario;
        int numeroCerto = (int) (Math.random() * 10) + 1; // O metodo Math.random escolhe um valor aleatorio

        System.out.println("Bem Vindo ao Jogo de Adivinhação!");
        System.out.println("Digite um numero inteiro entre 1 e 10");
        chuteUsuario = dado.nextInt();

        if (chuteUsuario < 1 || chuteUsuario > 10) {
            System.out.println("Número inválido. Tente novamente");
        }
        else if (chuteUsuario == numeroCerto) {
            System.out.println("Parabéns! Você acertou! O número é:" + numeroCerto);
        }
        else {
            System.out.println("Errou! O número é: " + numeroCerto);
        }


    }
}
