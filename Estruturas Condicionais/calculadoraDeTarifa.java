import java.util.*;
public class calculadoraDeTarifa {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double valorProduto = 100, valorFinal;
        double descontoAVista = 0.1, aumentoCartao = 0.05;
        int opcao;

        System.out.println("O valor do produto é 100 reais");
        System.out.println("Qual a forma de pagamento:");
        System.out.println("1) À vista");
        System.out.println("2) Cartão");
        System.out.println("Opção:");
        opcao = dado.nextInt();

        switch (opcao) {
            case 1:
                valorFinal = valorProduto - valorProduto * descontoAVista;
                System.out.println("O valor final do produto é: R$" + valorFinal);
                break;
            
            case 2:
                valorFinal = valorProduto + valorProduto * aumentoCartao;
                System.out.println("O valor final do produto é: R$" + valorFinal);
            default:
                break;
        }
        
    }
}
