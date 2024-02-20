import java.util.Scanner;
public class planoDeTelefonia {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        double consumoMensal, planoBasico = 5, planoMedio = 10, planoVip = 20;

        System.out.println("Digite o seu consumo mensal de dados moveis: ");
        consumoMensal = dado.nextDouble();

        if (consumoMensal <= planoBasico) {
            System.out.println("Sugerimos o plano BÁSICO pra voce de acordo com seu consumo!");
            System.out.println("Consumo: " + consumoMensal + " GB");
            System.out.println("Plano Básico: " + planoBasico + " GB");
        }
        if (consumoMensal > planoBasico && consumoMensal <= planoMedio) {
            System.out.println("Sugerimos o plano MÉDIO pra voce de acordo com seu consumo!");
            System.out.println("Consumo: " + consumoMensal + " GB");
            System.out.println("Plano Médio: " + planoMedio + " GB");
        }
        if (consumoMensal > planoMedio && consumoMensal <= planoVip) {
            System.out.println("Sugerimos o plano VIP pra voce de acordo com seu consumo!");
            System.out.println("Consumo: " + consumoMensal + " GB");
            System.out.println("Plano VIP: " + planoVip + " GB");
        }
    }
}
