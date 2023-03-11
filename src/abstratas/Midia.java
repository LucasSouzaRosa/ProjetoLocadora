/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas;


import Enums.TipoMidia;
import abstratas.Item;

/**
 *
 * @author lucas
 */
abstract public class Midia extends Item{
	
    private TipoMidia tipoMidia;

    public Midia(){
        super();
        this.setTipoMidia(TipoMidia.CD);
    }

    public Midia(String nome,  TipoMidia tipoMidia){
        super(nome);
        this.setTipoMidia(tipoMidia);
    }

    public void setTipoMidia(TipoMidia tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    public TipoMidia getTipoMidia() {
        return this.tipoMidia;
    }

}
