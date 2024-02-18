import java.util.Scanner;

public class calculaIMC {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Digite o seu peso em Kg:");
        peso = dado.nextDouble();
        System.out.println("Digite a sua altura em metros:");
        altura = dado.nextDouble();

        imc = peso / (altura * altura);
        System.out.println("Seu peso: " + peso);
        System.out.println("Sua altura: " + altura + "m");
        System.out.println("O seu IMC é de: " + imc + " kg/m^2");

        if (imc < 18.5) {
            System.out.println("Seu IMC identifica-se como MAGREZA");
        }
        if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Seu IMC identifica-se como NORMAL");
        }
        if (imc >= 25 && imc <= 29.9) {
            System.out.println("Seu IMC identifica-se como SOBREPESO");
        }
        if (imc >= 30 && imc <= 34.9) {
            System.out.println("Seu IMC identifica-se como OBESIDADE I");
        }
        if (imc >= 35 && imc <= 39.9) {
            System.out.println("Seu IMC identifica-se como OBESIDADE II");
        }
        if (imc > 40) {
            System.out.println("Seu IMC identifica-se como OBESIDADE III");
        }
    }
}
