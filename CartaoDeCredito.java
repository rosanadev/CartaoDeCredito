public class CartaoDeCredito {
        private int numero;
        private String nomeTitular;
        private String cpfTitular;
        private float limite;
        private float totalFatura;

        public int getNumero() {
                return this.numero;
        }
                rosana
        public void setNumero() {
                this.numero = numero;
        }
    
        public String getNomeTitular() {
                return this.nomeTitular;
        }
                
        public void setNomeTitular() {
                this.nomeTitular = nomeTitular;
        }

        public String getCpfTitular() {
                return this.cpfTitular;
        }
                
        public void  setCpfTitular() {
                this.cpfTitular = cpfTitular;
        }
                
        public String getLimite() {
                return this.limite;
        }
                
        public void  setLimite() {
                this.limite = limite;
        }
                
        public String getTotalFatura() {
                return this.totalFatura;
        }
                
        public void  setTotalFatura() {
                this.totalFatura = totalFatura;
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




    
