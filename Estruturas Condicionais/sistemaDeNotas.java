import java.util.*;
public class sistemaDeNotas {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double faltasAluno, aulas, nota1, nota2;

        System.out.println("Quantas aulas houveram:");
        aulas = dado.nextDouble();
        System.out.println("Quantas faltas você possui:");
        faltasAluno = dado.nextDouble();

        System.out.println("Quanto você tirou na Primeira Prova:");
        nota1 = dado.nextDouble();
        System.out.println("Quanto você tirou na Segunda Prova:");
        nota2 = dado.nextDouble();

        double limiteFaltas = aulas * 0.25;
        double media = (nota1 + nota2) / 2;
        double mediaArredondada = Math.round(media * 10.0) / 10.0;

        if (media > 10 || faltasAluno > aulas) {
            System.out.println("Média ou numero de faltas inválidas. Tente Novamente");
            return;
        }

        if (faltasAluno > limiteFaltas) {
            System.out.println("Sua quantidade de Faltas: " + faltasAluno);
            System.out.println("Limite de faltas: " + limiteFaltas);
            System.out.println("\nVocê foi REPROVADO POR FALTA!");
            return;
        }
        if (media < 7) {
            System.out.println("Sua Primeira Nota: " + nota1);
            System.out.println("Sua Segunda Nota: " + nota2);
            System.out.println("Sua Média: " + mediaArredondada);
            System.out.println("Média Mínima para passar de Ano: 7.0");
            System.out.println("\nVocê foi REPROVADO POR NOTA");
            return;
        }
        if (media < 7 && faltasAluno > limiteFaltas) {
            System.out.println("Sua quantidade de Faltas: " + faltasAluno);
            System.out.println("Limite de faltas: " + limiteFaltas);
            System.out.println("\nSua Primeira Nota: " + nota1);
            System.out.println("Sua Segunda Nota: " + nota2);
            System.out.println("Sua Média: " + mediaArredondada);
            System.out.println("Média Mínima para passar de Ano: 7.0");
            System.out.println("\nVocê foi REPROVADO POR MÉDIA E POR FALTA!");
            return;
        }
        if (media >= 7 && media <= 10 && faltasAluno < limiteFaltas) {
            System.out.println("Sua Primeira Nota: " + nota1);
            System.out.println("Sua Segunda Nota: " + nota2);
            System.out.println("Sua Média: " + mediaArredondada);
            System.out.println("Média Mínima para passar de Ano: 7.0");
            System.out.println("\nVocê foi APROVADO!");
            return;
        }
        
    }
}
