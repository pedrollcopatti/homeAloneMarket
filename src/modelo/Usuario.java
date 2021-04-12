package modelo;

import java.util.ArrayList;

/**
 * @author Guilherme
 */
public class Usuario {

    private long id;
    private String nome;
    private final long cpfCpnj;
    private String senha;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;
    private ArrayList<Cartao> cartoes;
    private ArrayList<Compra> compras;

    public Usuario(String nome, long cpfCpnj, String senha) {
        this.nome = nome;
        this.cpfCpnj = cpfCpnj;
        this.senha = senha;
        this.enderecos = new ArrayList<Endereco>();
        this.telefones = new ArrayList<Telefone>();
        this.emails = new ArrayList<Email>();
        this.cartoes = new ArrayList<Cartao>();
        this.compras = new ArrayList<Compra>();
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public long getCpfCpnj() {
        return cpfCpnj;
    }

    public String getSenha() {
        return senha;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public boolean setSenha(String senha) {
        if (!senha.isEmpty()) {
            this.senha = senha;
            return true;
        }
        return false;
    }

    public Email getEmail() {
        Email emailDefault = null;
        for (Email email : emails) {
            emailDefault = email;
        }
        return emailDefault;
    }

    public Endereco getEndereco() {
        Endereco enderecoDefault = null;
        for (Endereco endereco : enderecos) {
            enderecoDefault = endereco;
        }
        return enderecoDefault;
    }

    public Telefone getTelefone() {
        Telefone telefoneDefault = null;
        for (Telefone telefone : telefones) {
            telefoneDefault = telefone;
        }
        return telefoneDefault;
    }

    public Cartao getCartao() {
        Cartao cartaoDefault = null;
        for (Cartao cartao : cartoes) {
            cartaoDefault = cartao;
        }
        return cartaoDefault;
    }

    public void deletaCartao(long id) {
        cartoes.remove(id);
    }

    public void deletaEmail(long id) {;
        emails.remove(id);
    }

    public void deletaTelefone(long id) {
        telefones.remove(id);
    }

    public void deletaEndereco(long id) {
        enderecos.remove(id);
    }

    public void adicionaEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void adicionaTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void adicionaEmail(Email email) {
        emails.add(email);
    }

    public void adicionaCartao(Cartao cartao) {
        cartoes.add(cartao);
    }
    
    public void adicionaCompra(Compra compra) {
        compras.add(compra);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCPF/CNPJ: %d \n", getNome(), getCpfCpnj());
    }
}
