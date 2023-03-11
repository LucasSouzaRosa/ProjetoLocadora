/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Enums.Funcao;
import abstratas.Pessoa;
import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class Funcionario extends Pessoa {
	
    private double salario;
    private Funcao funcao;
    private LocalDate dataContratacao;
    private String cpf;

    public Funcionario(){
        super();
        this.setSalario(0);
        this.setFuncao(Funcao.AT);
        this.setDataContratacao(LocalDate.now());
        this.setCpf("000.000.000-00");
    }

    public Funcionario(String nome, String endereco, String email, String telefone, double salario, Funcao funcao, LocalDate dataContratacao, String cpf){
        super(nome, endereco, email, telefone);
        this.setSalario(salario);
        this.setFuncao(funcao);
        this.setDataContratacao(dataContratacao);
        this.setCpf(cpf);
    }

    public void setSalario(double salario) {
        this.salario = salario <= 0 ? 0 : salario;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao == null ? LocalDate.now() : dataContratacao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty() ? "000.000.000-00" : cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public Funcao getFuncao() {
        return this.funcao;
    }

    public LocalDate getDataContratacao() {
        return this.dataContratacao;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    

    @Override
    public String toString(){
            return super.getNome() + " - Função: " +this.getFuncao();
    }
	
}
