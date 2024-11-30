import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartaoDeCredito {
    private int numero;
    private Cliente titular;
    private double limite;
    private double totalFatura;
    private double cashback;
    private List<Transacao> historicoDeTransacoes;

    public CartaoDeCredito(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.limite = 100.0;
        this.totalFatura = 0.0;
        this.cashback = 0.0;
        this.historicoDeTransacoes = new ArrayList<>();
    }

    public CartaoDeCredito(int numero, Cliente titular, double limite, double cashback) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
        this.totalFatura = 0.0;
        this.cashback = cashback;
        this.historicoDeTransacoes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTotalFatura() {
        return totalFatura;
    }

    public void setTotalFatura(double totalFatura) {
        this.totalFatura = totalFatura;
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    public List<Transacao> getHistoricoDeTransacoes() {
        return historicoDeTransacoes;
    }

    public void setHistoricoDeTransacoes(List<Transacao> historicoDeTransacoes) {
        this.historicoDeTransacoes = historicoDeTransacoes;
    }

    
    public void realizarCompra(double valor, String descricao) {
        if (valor <= limite) {
            limite -= valor;
            totalFatura += valor;

            Transacao transacao = new Transacao(new Date(), valor, descricao);
            historicoDeTransacoes.add(transacao);

            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Você não possui limite suficiente para essa compra.");
        }
    }

    public void realizarCompra(double valor, String descricao, boolean cashbackAtivo) {
        if (valor <= limite) {
            double valorFinal = valor;
            if (cashbackAtivo) {
                double valorCashback = valor * (cashback / 100);
                valorFinal -= valorCashback;
                System.out.println("Você recebeu um cashback de: R$ " + valorCashback);
            }

            limite -= valorFinal;
            totalFatura += valorFinal;

            Transacao transacao = new Transacao(new Date(), valorFinal, descricao);
            historicoDeTransacoes.add(transacao);

            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Você não possui limite suficiente para essa compra.");
        }
    }

    public void exibirHistorico() {
        if (historicoDeTransacoes.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            System.out.println("Histórico de Transações:");
            for (Transacao transacao : historicoDeTransacoes) {
                System.out.println(transacao);
            }
        }
    }
}


    
