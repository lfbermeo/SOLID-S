package me.grupo1.clases;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {
    private List<String> lista;

    public ListaCompras (){
        this.lista = new ArrayList<>();
    }

    public List<String> getLista(){
        return this.lista;
    }

    public void setLista(List<String> lista){
        this.lista = lista;
    }

    public void addArticulo(String articulo){
        this.lista.add(articulo);
    }
    @Override
    public  String toString (){
        String salida="";
        for(int i =0; i<lista.size();i++){
            salida += String.format("Articulo %d: %s\n", i+1,this.lista.get(i) );
        }
        return salida;
    }
}
