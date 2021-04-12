package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Guilherme
 */
public class Cartao extends MetodoPagamento {
    private long numero;
    private String validade;
    private Bandeira bandeira;
    private int numeroVerificacao;

    public Cartao(long numero, String validade, Bandeira bandeira, int numeroVerificacao) {
        this.numero = numero;
        this.validade = validade;
        this.bandeira = bandeira;
        this.numeroVerificacao = numeroVerificacao;
    }

    public long getNumero() {
        return numero;
    }

    public String getValidade() {
        return validade;
    }

    public String getBandeira() {
        return bandeira.name();
    }
    
    public Bandeira getBandeiraCartao() {
        return bandeira;
    }

    public int getNumeroVerificacao() {
        return numeroVerificacao;
    }

    public String imprime() {
        return String.format("Cartão - Número: %d, Bandeira: %s", getNumero(), getBandeira());
    }
    
    @Override
    public String toString() {
        return "Cartão: " + String.valueOf(getNumeroVerificacao());
    }

    @Override
    public String getVencimentoValidade() {
        SimpleDateFormat format = new SimpleDateFormat("MM/yyyy");
        return "Vencimento em: " + format.format(validade);
    }

}
