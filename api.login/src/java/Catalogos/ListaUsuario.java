/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalogos;

import java.util.ArrayList;

/**
 *
 * @author jose_
 */
public class ListaUsuario {
	public  ArrayList<CCUsuario> lista = null;

    public ListaUsuario() {
        lista = new ArrayList<CCUsuario>();
    }

    public ArrayList<CCUsuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<CCUsuario> lista) {
        this.lista = lista;
    }

}


