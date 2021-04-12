package modelo;

/**
 * @author Guilherme
 */
public class Produto {

    private String nome;
    private String descricao;
    private int qtdSelecionada;

    public Produto(String nome, String descricao, int qtdSelecionada) {
        this.nome = nome;
        this.descricao = descricao;
        this.qtdSelecionada = qtdSelecionada;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtdSelecionada() {
        return qtdSelecionada;
    }

    public boolean setDescricao(String descricao) {
        if (!descricao.isEmpty()) {
            this.descricao = descricao;
            return true;
        }
        return false;

    }

    public boolean setQtdSelecionada(int qtdSelecionada) {
        if (qtdSelecionada > 0) {
            this.qtdSelecionada = qtdSelecionada;
            return true;
        }
        return false;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s (%d) unidades", getNome(), getQtdSelecionada());
    }
    
    public String imprimeProduto() {
        return String.format("%s, Descrição: %s, Quantidade: %d",
                getNome(),
                getDescricao(),
                getQtdSelecionada());
    }

}
