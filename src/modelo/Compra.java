package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Guilherme
 */
public class Compra {

    private String dataEntrega;
    private String dataPrevisao;
    private Status status;
    private String telefoneCompra;
    private String enderecoCompra;
    private String emailCompra;
    private String metodoPagamento;
    private ArrayList<Orcamento> orcamentos;
    private ArrayList<Produto> produtos;

    public Compra(String dataPrevisao, String telefoneCompra, String enderecoCompra, String emailCompra, String metodoPagamento) {
        this.dataPrevisao = dataPrevisao;
        this.dataEntrega = null;
        this.enderecoCompra = enderecoCompra;
        this.emailCompra = emailCompra;
        this.telefoneCompra = telefoneCompra;
        this.metodoPagamento = metodoPagamento;
        this.status = Status.Processando;
        this.orcamentos = new ArrayList<Orcamento>();
        this.produtos = new ArrayList<Produto>();
    }

    public String getTelefoneCompra() {
        return telefoneCompra;
    }

    public String getEnderecoCompra() {
        return enderecoCompra;
    }

    public String getEmailCompra() {
        return emailCompra;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public String getDataPrevisao() {
        return dataPrevisao;
    }

    public Status getStatus() {
        return status;
    }

    public boolean adicionaOrcamento(Orcamento orcamento) {
        if (orcamento == null) {
            return false;
        }
        
        for (Orcamento orcamentoIN : orcamentos) {
            if (orcamentoIN.getValorTotal() == orcamento.getValorTotal()){
                orcamentoIN = orcamento;
                return true;
            }
        }
        this.orcamentos.add(orcamento);
        return true;
    }
    

    public boolean adicionaProduto(Produto produto) {
        if (produto == null) {
            return false;
        }
        this.produtos.add(produto);
        return true;
    }

    public void deletaProduto(Produto produto) {
        produtos.remove(produto);
    }
    
    public void deletaProduto(int indexProduto) {
        produtos.remove(indexProduto);
    }

    public Pagamento getPagamento() {
        for (Orcamento orcamento : orcamentos) {
            if (orcamento.getPagamento() != null) {
                return orcamento.getPagamento();
            }
        }
        return null;
    }

    public ArrayList<Produto> getProduto() {
        return produtos;
    }

    public Produto getProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Produto getProduto(int indexProduto) {
        return produtos.get(indexProduto);
    }
    
    public void adicionaProduto(ArrayList<Produto> produto){
        this.produtos = produto;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void setDataPrevisao(String dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTelefoneCompra(String telefoneCompra) {
        this.telefoneCompra = telefoneCompra;
    }

    public void setEnderecoCompra(String enderecoCompra) {
        this.enderecoCompra = enderecoCompra;
    }

    public void setEmailCompra(String emailCompra) {
        this.emailCompra = emailCompra;
    }

    
}
