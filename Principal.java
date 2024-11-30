import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rosana", "12312352636", "rosana@email.com", "11999999999");
        CartaoDeCredito cartao = new CartaoDeCredito(123, cliente);

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Consultar Limite");
            System.out.println("2 - Consultar Fatura");
            System.out.println("3 - Realizar Compra");
            System.out.println("4 - Exibir Histórico de Transações");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Limite disponível: R$ " + cartao.getLimite());
                    break;
                case 2:
                    System.out.println("Total da fatura: R$ " + cartao.getTotalFatura());
                    break;
                case 3:
                    System.out.print("Digite o valor da compra: ");
                    double valor = sc.nextDouble();
                    sc.nextLine(); // Limpa o buffer
                    System.out.print("Digite a descrição da compra: ");
                    String descricao = sc.nextLine();
                    cartao.realizarCompra(valor, descricao);
                    break;
                case 4:
                    cartao.exibirHistorico();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
