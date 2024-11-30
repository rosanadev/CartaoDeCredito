public class CartaoDeCredito {
    private int numero;
    private Cliente titular;
    protected double limite;
    private double totalFatura;

    public CartaoDeCredito (int numero, Cliente titular) {
        this.numero = numero;
        this.limite = 100;
        this.totalFatura = 0;
        this.titular = titular;
    }

    public CartaoDeCredito (int numero, double limite, Cliente titular) {
        this.numero = numero;
        this.limite = limite;
        this.totalFatura = 0;
        this.titular = titular;
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

    public double consultarLimite(){
        return limite;
    }

    public double consultarTotalFatura(){
        return totalFatura;
    }

    public void realizarCompra(double valor) {
        if (valor <= this.limite){
            double limiteAnterior = this.getLimite();
            this.setLimite(limiteAnterior - valor);
            double total = this.getTotalFatura();
            this.setTotalFatura(total + valor);
        } else {
            System.out.println("Você não possui limite necessario para essa compra");
        }
    }
}
