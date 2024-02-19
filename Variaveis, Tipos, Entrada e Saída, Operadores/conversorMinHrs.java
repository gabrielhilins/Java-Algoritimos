import java.util.Scanner;

public class conversorMinHrs {
     public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int minutosUsuario, minutos, horas;

        System.out.println("Digite os minutos:");
        minutosUsuario = dado.nextInt();

        horas = minutosUsuario / 60;
        minutos = minutosUsuario % 60;

        System.out.println(minutosUsuario + " minutos são: " + horas + " hora(s) e " + minutos + " minutos");
    }
}
