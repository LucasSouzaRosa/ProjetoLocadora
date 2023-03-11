/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Enums.TipoMidia;

/**
 *
 * @author lucas
 */
public class Plataforma {

	private String nome;
	private String empresa;
	private TipoMidia tipoMidia;
	
	public Plataforma(){
            this.setNome("Vazio");
            this.setEmpresa("Vazio");
            this.setTipoMidia(tipoMidia.CD);
	}
	
	public Plataforma(String nome, String empresa, TipoMidia tipoMidia){
            this.setNome(nome);
            this.setEmpresa(empresa);
            this.setTipoMidia(tipoMidia);
	}
	
	public void setNome(String nome){
		this.nome = nome.trim().isEmpty() ? "Vazio" : nome;
	}
	
	public void setEmpresa(String empresa){
		this.empresa = empresa.trim().isEmpty() ? "Vazio" : empresa;
	}

	public void setTipoMidia(TipoMidia tipoMidia){
		this.tipoMidia = tipoMidia;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getEmpresa(){
		return this.empresa;
	}
	
	public TipoMidia getTipoMidia(){
		return this.tipoMidia;
	}
	
	@Override
	public String toString(){
		return this.nome;
	}
	
}