package modelo;

import java.text.DecimalFormat;

/**
 * @author Guilherme
 */
public class Orcamento {

    private double valorTotal;
    private Pagamento pagto;

    public Orcamento(double valorTotal) {
        this.valorTotal = valorTotal;
        this.pagto = null;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Pagamento getPagamento() {
        return pagto;
    }

    public void pagar(MetodoPagamento metodoPagto) {
        this.pagto = new Pagamento(valorTotal, metodoPagto);
    }
    
    public void setPagamento(Pagamento pagamento) {
        this.pagto = pagamento;
    }

    @Override
    public String toString() {
        return (getValorTotal() > 0.0) ? new DecimalFormat("00.0").format(getValorTotal()) : "";
    }
    
}
