import java.util.Scanner;

public class conversorTemperatura {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double celsius, farenheit;

        System.out.println("Digite o valor da temperatura em Celsius para converter em Farenheit:");
        celsius = dado.nextDouble();

        farenheit = (celsius * 9)/ 5 + 32;

        System.out.println(celsius + " graus são " + farenheit + " F");
    }
}