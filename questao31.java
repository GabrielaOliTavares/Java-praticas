import java.util.Scanner;

public class CaixaRegistradora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCompra = 0;
        double valorPago;
        double troco;

        while (true) {
            System.out.println("\nLojas Tabajara");

            double valorProduto;
            do {
                System.out.print("Produto: R$ ");
                valorProduto = scanner.nextDouble();

                if (valorProduto > 0) {
                    totalCompra += valorProduto;
                    System.out.printf("Total: R$ %.2f\n", totalCompra);
                }
            } while (valorProduto != 0);

            System.out.printf("Total: R$ %.2f\n", totalCompra);
            System.out.print("Dinheiro: R$ ");
            valorPago = scanner.nextDouble();

            troco = valorPago - totalCompra;
            System.out.printf("Troco: R$ %.2f\n", troco);
        }
    }
}
