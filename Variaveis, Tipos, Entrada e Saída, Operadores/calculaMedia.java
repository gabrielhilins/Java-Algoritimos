import java.util.Scanner;

public class calculaMedia {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota:");
        nota1 = dado.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = dado.nextFloat();
        System.out.println("Digite a terceira nota:");
        nota3 = dado.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota1 > 10 || nota2 > 10 || nota3 > 10) {
           System.out.println("Alguma das notas é menor que zero ou maior que dez. Tente novamente");
        }
    
        else {
            if (media >= 7 && media <= 10) {
                System.out.println("Você está aprovado");
            }
            else if (media < 7 && media >= 0) {
                System.out.println("Você está reprovado");
            }
        }
            
    }
}
