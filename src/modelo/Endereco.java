package modelo;

/**
 * @author Guilherme
 */
public class Endereco {

    private int cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;

    public Endereco(int cep, String logradouro, String complemento, String bairro, String cidade) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

   
    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public boolean setCep(int cep) {
        if (cep > 0) {
            this.cep = cep;
            return true;
        }
        return false;
    }

    public boolean setLogradouro(String logradouro) {
        if (!logradouro.isEmpty()) {
            this.logradouro = logradouro;
            return true;
        }
        return false;
    }


    public boolean setComplemento(String complemento) {
        if (!complemento.isEmpty()) {
            this.complemento = complemento;
            return true;
        }
        return false;
    }

    public boolean setBairro(String bairro) {
        if (!bairro.isEmpty()) {
            this.bairro = bairro;
            return true;
        }
        return false;
    }

    public boolean setCidade(String cidade) {
        if (!cidade.isEmpty()) {
            this.cidade = cidade;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getComplemento();
                
    }
    
    public String imprimeEndereco() {
        return String.format("Logradouro: %s, CEP: %d, Bairro: %s, Complemento: %s, Cidade: %s",
                getLogradouro(),
                getCep(),
                getBairro(),
                getComplemento(),
                getCidade());
    }
}
