package modelo;

/**
 * @author Guilherme
 */
public class Email {
    private String email;

    public Email(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.indexOf("@") >= 0){
            this.email = email;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getEmail();
    }
    
    public String imprimeEmail() {
        return String.format("Email: %s\n", getEmail());
    }
}
