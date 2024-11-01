import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do cartão: ");
        int numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o nome do titular do cartão: ");
        String nomeTitular = entrada.nextLine();

        System.out.println("Digite o limite de crédito padrão do cartão: ");
        double limite = entrada.nextDouble();
        entrada.nextLine();

     
        CartaoDeCredito c = new CartaoDeCredito();
        c.setNumero(numero); 
        c.setNomeTitular(nomeTitular);
        c.setLimite(limite);
        

        System.out.println("O número do cartão é: " + numero );
        System.out.println("O titular do cartão é: " + nomeTitular);

     
        int opcao = 0;

        do {
            System.out.println("1 - Consultar Limite");
            System.out.println("2 - Consultar Fatura");
            System.out.println("3 - Realizar compra simples");
            System.out.println("4 - Realizar compra com cashback");
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
                case 4:
                    System.out.println("Digite o valor da compra");
                    double valorCompra = sc.nextDouble();
                    System.out.println("Digite a taxa de cashback: ");
                    double percentualCashback = entrada.nextDouble();
                    c.realizarCompra(valorCompra, percentualCashback); 
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
        entrada.close();
    }
}
