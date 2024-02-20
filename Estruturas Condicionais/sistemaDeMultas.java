import java.util.*;
public class sistemaDeMultas {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double limite = 60, velocidadeMotorista, tolerancia = 0.1;
        double multaNaCerta = limite + limite * tolerancia;

        System.out.println("Digite a velocidade que você estava passando:");
        velocidadeMotorista = dado.nextInt();

        if (velocidadeMotorista > multaNaCerta) {
            System.out.println("Você foi multado por exceder o limite de velocidade da via que é de: " + limite);
            System.out.println("Sua Velocidade: " + velocidadeMotorista);
            System.out.println("Limite da via: " + limite);
            System.out.println("Tolerancia: " + multaNaCerta);
        }
        if (velocidadeMotorista > limite && velocidadeMotorista < multaNaCerta) {
            System.out.println("Você pode ser multado por exceder o limite de velocidade da via que é de: " + limite);
            System.out.println("Sua Velocidade: " + velocidadeMotorista);
            System.out.println("Limite da via: " + limite);
            System.out.println("Tolerancia: " + multaNaCerta);
        }
        if (velocidadeMotorista <= limite && velocidadeMotorista > 0) {
            System.out.println("Você não será multado por exceder o limite de velocidade da via que é de: " + limite);
            System.out.println("Sua Velocidade: " + velocidadeMotorista);
            System.out.println("Limite da via: " + limite);
            System.out.println("Tolerancia: " + multaNaCerta);
        }


    }
}
