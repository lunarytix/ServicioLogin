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
public class ListaLogin {

    public  ArrayList<CClogin> lista = null;

    public ListaLogin() {
        lista = new ArrayList<CClogin>();
    }

    public ArrayList<CClogin> getLista() {
        return lista;
    }

    public void setLista(ArrayList<CClogin> lista) {
        this.lista = lista;
    }
}


