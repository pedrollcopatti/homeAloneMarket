package modelo;

/**
 * @author Guilherme
 */
public class Pagamento {

    private double valorPago;
    private MetodoPagamento metodoPagto;

    public Pagamento(double valorPago, MetodoPagamento metodoPagto) {
        this.valorPago = valorPago;
        this.metodoPagto = metodoPagto;
    }

    public double getValorPago() {
        return valorPago;
    }

    public MetodoPagamento getMetodoPagto() {
        return metodoPagto;
    }

    @Override
    public String toString() {
        return String.format("Pagamento Realizado!\nValor: %s\nMétodo: %s",
                getValorPago(),
                metodoPagto.toString());
    }

}
