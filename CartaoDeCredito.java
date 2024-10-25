public class CartaoDeCredito {
        private int numero;
        private String nomeTitular;
        private String cpf;
        private float limite;
        private float totalFatura;

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
                
        public void  setCpf(String cpf) {
                this.cpf = cpf;
        }
                
        public double getLimite() {
                return this.limite;
        }
                
        public void  setLimite(double limite) {
                this.limite = limite;
        }
                
        public String getTotalFatura() {
                return this.totalFatura;
        }
                
        public void  setTotalFatura(double total) {
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
                double limiteAnterior = this.getLimite()
                this.setLimite(limiteAnterior - valor);
                double total = this.getTotalFatura();
                this.setTotalFatura(total + valor);
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Você não possui limite necessario para essa compra");
            }
        }
    }    




    
