package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Guilherme, Pedro
 */
public class Boleto extends MetodoPagamento {

    private String arquivo;
    private String vencimento;
    private String linhaDigitavel;
    private String codigoBarra;

    public Boleto(String arquivo, String vencimento, String linhaDigitavel, String codigoBarra) {
        this.arquivo = arquivo;
        this.vencimento = vencimento;
        this.linhaDigitavel = linhaDigitavel;
        this.codigoBarra = codigoBarra;
    }

    public String getArquivo() {
        return arquivo;
    }

    public String getVencimento() {
        return vencimento;
    }

    public String getLinhaDigitavel() {
        return linhaDigitavel;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public String getVencimentoValidade() {
        //SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Vencimento em: " + getVencimento();//format.format(getVencimento());
    }

    @Override
    public String toString() {
        return "Boleto";
    }
    
    public String imprime() {
        return String.format("Boleto - Vencimento: %s, Linha digitável: %s, Código de Barras: %s",
                getVencimentoValidade(), getLinhaDigitavel(), getCodigoBarra());

    }

}
