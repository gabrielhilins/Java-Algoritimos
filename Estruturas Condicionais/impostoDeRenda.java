import java.util.Scanner;
public class impostoDeRenda {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double salario, impostoUsuario;
        double aliquota1 = 0.075, aliquota2 = 0.15, aliquota3 = 0.225, aliquota4 = 0.275;

        System.out.println("Qual o seu salário:");
        salario = dado.nextDouble();

        if (salario <= 1904) {
            System.out.println("Você está ISENTO do Imposto de Renda!");
        }
        if (salario > 1904 && salario <= 2826) {
            impostoUsuario =  salario * aliquota1;
            System.out.println("Seu Salário: " + salario);
            System.out.println("Alíquota referente: 7,5%");
            System.out.println("Você será tributado em: R$" + impostoUsuario);
        }
        if (salario > 2826 && salario <= 3751) {
            impostoUsuario = salario * aliquota2;
            System.out.println("Seu Salário: " + salario);
            System.out.println("Alíquota referente: 15%");
            System.out.println("Você será tributado em: R$" + impostoUsuario);
        }
        if (salario > 3751 && salario <= 4664) {
            impostoUsuario = salario * aliquota3;
            System.out.println("Seu Salário: " + salario);
            System.out.println("Alíquota referente: 22,5%");
            System.out.println("Você será tributado em: R$" + impostoUsuario);
        }
        if (salario > 4664) {
            impostoUsuario = salario * aliquota4;
            System.out.println("Seu Salário: " + salario);
            System.out.println("Alíquota referente: 27,5%");
            System.out.println("Você será tributado em: R$" + impostoUsuario);
        }
    }
}
