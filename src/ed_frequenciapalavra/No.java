/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_frequenciapalavra;

/**
 *
 * @author anacris
 */
public class No {
    private String elemento;
    private No esq;
    private No dir;
    private int contador = 1;

    public No(String elemento, No esq, No dir) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }

    public String getElemento() {
        return elemento;
    }

    public No getEsq() {
        return esq;
    }

    public No getDir() {
        return dir;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public void addContador(){
        contador++;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", esq=" + esq + ", dir=" + dir + '}';
    }
    
    
}
