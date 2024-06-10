import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        double[] notas = new double[10];
        double somaNotas = 0;
        double media = 0;
        int alunosAcimaMedia = 0;
        int alunosAbaixoMedia = 0;

        // Leitura das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }

        // Cálculo da média
        media = somaNotas / notas.length;

        // Listagem de alunos com notas abaixo da média
        System.out.println("\nAlunos com notas abaixo da média:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < media) {
                System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
                alunosAbaixoMedia++;
            }
        }

        // Verificação se há alunos com notas acima da média
        if (alunosAcimaMedia == 0) {
            System.out.println("\nNão há alunos com notas acima da média.");
        } else {
            // Listagem de alunos com notas acima ou iguais à média
            System.out.println("\nAlunos com notas acima ou iguais à média:");
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= media) {
                    System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
                    alunosAcimaMedia++;
                }
            }
        }

        // Impressão da média
        System.out.println("\nMédia das notas: " + media);
    }
}
