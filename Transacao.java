import java.util.Date;

public class Transacao {
    private Date data;
    private double valor;
    private String descricao;

    public Transacao(Date data, double valor, String descricao) {
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Data: " + data + ", Valor: R$ " + valor + ", Descrição: " + descricao;
    }
}
