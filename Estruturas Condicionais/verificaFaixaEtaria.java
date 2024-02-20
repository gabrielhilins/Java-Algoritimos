import java.util.*;
public class verificaFaixaEtaria {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade:");
        idade = dado.nextInt();

        if (idade >= 18 && idade < 60) {
            System.out.println("Você é Adulto!");
        }
        if (idade > 11 && idade < 18) {
            System.out.println("Você é Adolescente!");
        }
        if (idade < 11 && idade > 0) {
            System.out.println("Você é Criança!");
        }
        if (idade > 60 && idade < 122) {
            System.out.println("Você é Idoso");
        }
    }

}
