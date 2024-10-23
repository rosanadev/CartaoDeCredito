import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        CartaoDeCredito c = new CartaoDeCredito();
        c.cpfTitular = "12312352636";
        c.limite = 100;
        Scanner sc = new Scanner(System.in);
        int opcao = 1;

        do {
            System.out.println("1 - Consultar Limite");
            System.out.println("2 - Consultar Fatura");
            System.out.println("3 - Realizar compra");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Limite disponível: R$ " + c.consultarLimite());
                    break;
                case 2:
                    System.out.println("Total da fatura: R$ " + c.consultarTotalFatura());
                    break;
                case 3:
                    System.out.println("Digite o valor da compra");
                    double valor = sc.nextDouble();
                    c.realizarCompra(valor);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;

            }

        } while (opcao != 0);

        sc.close();
    }
}
