public class CartaoDeCredito {
        int numero;
        String nomeTitular;
        String cpfTitular;
        float limite;
        float totalFatura;;

        public double consultarLimite(){
            return limite;
        }

        public double consultarTotalFatura(){
            return totalFatura;
        }

        public void realizarCompra(double valor) {
            if (valor <= this.limite){
                this.limite -= valor;
                this.totalFatura += valor;
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Você não possui limite necessario para essa compra");
            }
        }
    }    




    
