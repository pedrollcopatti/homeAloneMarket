package modelo;

/**
 * @author Guilherme
 */
public abstract class MetodoPagamento {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public abstract String toString();

    public abstract String getVencimentoValidade();
    
    public abstract String imprime();
}
