public class CartaoDeCredito {
        private int numero;
        private String nomeTitular;
        private String cpfTitular;
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
                
        public void setNomeTitular(String nomeTitular) {
                this.nomeTitular = nomeTitular;
        }

        public String getCpfTitular() {
                return this.cpfTitular;
        }
                
        public void  setCpfTitular(String cpfTitular) {
                this.cpfTitular = cpfTitular;
        }
                
        public String getLimite() {
                return this.limite;
        }
                
        public void  setLimite(float limite) {
                this.limite = limite;
        }
                
        public String getTotalFatura() {
                return this.totalFatura;
        }
                
        public void  setTotalFatura(float totalFatura) {
                this.totalFatura = totalFatura;
        }

        public void realizarCompra(float valor) {
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




    
