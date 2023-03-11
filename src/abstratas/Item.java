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
abstract public class Item {
	
    private String nome;


    public Item(){
        this.setNome("Vazio");
    }

    public Item(String nome){
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "Vazio" : nome;
    }

    

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
