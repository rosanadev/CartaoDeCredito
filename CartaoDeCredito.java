public class CartaoDeCredito {
    private int numero;
    private Cliente titular;
    private double limite;
    private double totalFatura;
    private double cashback;

public CartaoDeCredito (int numero, String nomeTitular, String cpf) {
        this.numero = numero;
        this.limite = 100;
        this.totalFatura = 0;
    }

public CartaoDeCredito (int numero, String nomeTitular, String cpf, double limite, double cashback) {
        this.numero = numero;
        this.limite = limite;
        this.totalFatura = 0;
        this.cashback = cashback;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        if (valor <= this.limite) {
        double limiteAnterior = this.getLimite();
        this.setLimite(limiteAnterior - valor);
        double total = this.getTotalFatura();
        this.setTotalFatura(total + valor);
        System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Você não possui limite necessário para essa compra");
        }
    }

    public void realizarCompra(double valor, boolean cashback) {
        if (valor <= this.limite && cashback){
            double percentCashback = (valor/100) * this.cashback;
            double valorCompra = valor - percentCashback;
            double limiteAnterior = this.getLimite();
            this.setLimite(limiteAnterior - valorCompra);
            double total = this.getTotalFatura();
            this.setTotalFatura(total + valorCompra);
            System.out.println("Compra realizada com sucesso!");
            System.out.println("Você recebeu um cashback de: R$ " +  percentCashback);
            } else {
                System.out.println("Você não possui limite necessário para essa compra");
            }
    }
}


    
