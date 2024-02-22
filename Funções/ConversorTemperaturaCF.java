package Funções;
import java.util.Scanner;

public class ConversorTemperaturaCF {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double celsius, farenheit;

        System.out.println("Digite o valor da temperatura em Celsius para converter em Farenheit:");
        celsius = dado.nextDouble();
        
        farenheit = converteTemperatura(celsius);
        System.out.println(celsius + " graus são " +farenheit + " F");

        
    }
    static double converteTemperatura(double celsius) {
        return (celsius * 9 / 5 )+ 32;
    }
}