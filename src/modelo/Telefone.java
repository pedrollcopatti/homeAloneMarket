package modelo;

/**
 * @author Guilherme, Pedro
 */
public class Telefone {
    private String ddd;
    private String telefone;

    public Telefone(String ddd, String telefone) {
        this.ddd = ddd;
        this.telefone = telefone;
    }
    
    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean setDdd(String ddd) {
        if (!ddd.isEmpty()){
            this.ddd = ddd;
            return true;
        }
        return false;
   }

    public boolean setTelefone(String telefone) {
        if (!telefone.isEmpty()){
            this.telefone = telefone;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", getDdd(), getTelefone());
    }
    
    public String imprimeTelefone() {
        return String.format("Telefone: (%s) %s", getDdd(), getTelefone());
    }
    
}
