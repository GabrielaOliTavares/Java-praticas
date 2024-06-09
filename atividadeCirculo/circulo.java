import java.util.Scanner;

public class Circulo {

    private int x;
    private int y;
    private double raio;

    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo() {
        this(0, 0, 0);
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void moveX(int x1) {
        this.x += x1;
    }

    public void moveY(int y1) {
        this.y += y1;
    }

    public void aumenta(double r) {
        this.raio *= r;
    }

    public String exibe() {
        return String.format("Centro: (%d, %d)\nRaio: %.2f\nÁrea: %.2f\nPerímetro: %.2f",
                x, y, raio, getArea(), getPerimetro());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a coordenada X do círculo: ");
        int x = scanner.nextInt();

        System.out.print("Informe a coordenada Y do círculo: ");
        int y = scanner.nextInt();

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(x, y, raio);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade a ser movida na horizontal: ");
                    int x1 = scanner.nextInt();
                    circulo.moveX(x1);
                    break;
                case 2:
                    System.out.print("Informe o fator de aumento do raio: ");
                    double r = scanner.nextDouble();
                    circulo.aumenta(r);
                    break;
                case 3:
                    System.out.println(circulo.exibe());
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}
