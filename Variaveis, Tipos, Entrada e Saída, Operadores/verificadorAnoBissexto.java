import java.util.*;
public class verificadorAnoBissexto {
    
public static void main(String[] args) {
    Scanner dado = new Scanner(System.in);
    int ano;

    System.out.println("Digite o ano referente:");
    ano = dado.nextInt();

    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
        System.out.println(ano + " é um ano bissexto.");
    } else {
        System.out.println(ano + " não é um ano bissexto.");
    }

    // Se o ano for divisível por 4 e não for divisível por 100 ou seja divisível por 400
    // ele é um ano bissexto

    }
}


