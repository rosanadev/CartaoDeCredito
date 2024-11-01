public class CartaoDeCredito {
    private int numero;
    private String nomeTitular;
    private String cpf;
    private double limite;
    private double totalFatura;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nome) {
        this.nomeTitular = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTotalFatura() {
        return this.totalFatura;
    }

    public void setTotalFatura(double total) {
        this.totalFatura = total;
    }

    public double consultarLimite() {
        return limite;
    }

    public double consultarTotalFatura() {
        return totalFatura;
    }

    public void realizarCompra(double valor) {
        if (valor <= limite) {
            limite -= valor;
            totalFatura += valor; 
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Você não possui limite necessário para essa compra");
        }
    }

    public void realizarCompra(double valor, double percentualCashback) {
        if (valor <= limite) {
            limite -= valor;
            totalFatura += valor; 
            double cashback = valor * percentualCashback;

                System.out.println("Compra realizada com sucesso!");
                System.out.println("Você recebeu um cashback de: R$ " + cashback);
            } else {
                System.out.println("Você não possui limite necessário para essa compra");
            }
    }
}


    
