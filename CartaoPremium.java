public class CartaoPremium extends CartaoDeCredito {
    private double cashback;

    CartaoPremium (int numero, double cashback, double limite, Cliente titular) {
        super(numero, limite, titular);
        this.cashback = cashback;
    }

    public double getCashback() {
        return this.cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    @Override
    public void realizarCompra(double valor) {
        if (valor <= this.limite){
            double percentCashback = (valor/100) * this.cashback;
            double valorCompra = valor - percentCashback;
            double limiteAnterior = this.getLimite();
            this.setLimite(limiteAnterior - valorCompra);
            double total = this.getTotalFatura();
            this.setTotalFatura(total + valorCompra);
        } else {
            System.out.println("Você não possui limite necessario para essa compra");
        }
    }
}