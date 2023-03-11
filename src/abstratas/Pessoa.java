/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;

/**
 *
 * @author lucas
 */
abstract public class Pessoa {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Pessoa() {
        this.setNome("Vazio");
        this.setEndereco("Vazio");
        this.setEmail("Vazio");
        this.setTelefone("Vazio");
    }

    public Pessoa(String nome, String endereco, String email, String telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "Vazio" : nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty() ? "Vazio" : endereco;
    }

    public void setEmail(String email) {
        this.email = email.trim().isEmpty() ? "Vazio" : email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "Vazio" : telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
