import java.util.Scanner;
public class calculaValorEstacionamento {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int tempoPermanencia;
        

        System.out.println("Quanto tempo você passou utilizando nosso Estacionamento (em Minutos):");
        tempoPermanencia = dado.nextInt();

        int horas = tempoPermanencia / 60;
        int minutos = tempoPermanencia % 60;

        if (tempoPermanencia <= 60) {
            System.out.println("Tempo Estacionado: " + horas + " Hora(s) e " + minutos + " minutos ou " + tempoPermanencia + " Minutos");
            System.out.println("Valor do Estacionamento: R$5,00");
        }
        if (tempoPermanencia > 60 && tempoPermanencia < 120 ) {
            System.out.println("Tempo Estacionado: " + horas + " Hora(s) e " + minutos + " minutos ou " + tempoPermanencia + " Minutos");
            System.out.println("Valor do Estacionamento: R$8,00");
        }
        if (tempoPermanencia >= 120 && tempoPermanencia < 240) {
            System.out.println("Tempo Estacionado: " + horas + " Hora(s) e " + minutos + " minutos ou " + tempoPermanencia + " Minutos");
            System.out.println("Valor do Estacionamento: R$12,00");
        }
        if (tempoPermanencia >= 240) {
            System.out.println("Tempo Estacionado: " + horas + " Hora(s) e " + minutos + " minutos ou " + tempoPermanencia + " Minutos");
            System.out.println("Valor do Estacionamento: R$15,00");
        }
    }
}
