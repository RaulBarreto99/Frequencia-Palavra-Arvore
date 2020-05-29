/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_frequenciapalavra;

/**
 *
 * @author Raul
 */
public class FreqPalavra {

    private No raiz;
    
    //Cria uma árvore vazia
    public FreqPalavra(){
        this.raiz = null;
    }
    //Insere um elemento na árvore
    public void insere (String elemento){
        No pai = null;
        No p = raiz;
        No novo = new No(elemento,null,null);
        
        //Busca onde inserir o novo No
        while (p != null){
            pai = p;
            if(elemento.compareTo(p.getElemento()) < 0){
                p = p.getEsq();
            } else {
                p = p.getDir();
            }
        }
        //Verificar árvore vazia
        if(pai == null){
            raiz = novo;
            return;
        }
        if(elemento.compareTo(pai.getElemento()) < 0){
            pai.setEsq(novo);
        } else{
            pai.setDir(novo);
        }
    }
      
    public void preOrdem(){
        preOrdem(raiz);
    }
    public void preOrdem(No p){
        if(p != null){
            System.out.print(p.getElemento() + " ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }
    public void inOrdem(){
        inOrdem(raiz);
    }
    public void inOrdem(No p){
        if(p != null){
            inOrdem(p.getEsq());
            System.out.print(p.getElemento() + " " + p.getContador() + "\n");
            inOrdem(p.getDir());
        }
    }
    public void posOrdem(){
        posOrdem(raiz);
    }
    public void posOrdem(No p){
        if(p != null){
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento() + " ");
        }
    }
    
    public boolean buscaIt(String elemento){
        No p = raiz;
        
        while (p != null){
            if(elemento.equals(p.getElemento())){
                p.addContador();
                return true; //Achou
            }
            if(elemento.compareTo(p.getElemento()) < 0){
                p = p.getEsq();
            } else {
                p = p.getDir();
            }
       }
       return false; //NAO achou
    }
    
    @Override
    public String toString() {
        return "FreqPalavra{" + "raiz=" + raiz + '}';
    }
    
    public int contaNos(){
        return contaNos(raiz);
    }
    
    public int contaNos(No p){
        if(p == null)
            return 0;
        
        return contaNos(p.getEsq()) + contaNos(p.getDir()) + 1;
    }
    
    public int altura(){
        return altura(raiz);
    }
    
    public int altura(No p){
        if(p == null)
            return -1; //a altura da árvore vazia
        
        int altura_esq = altura(p.getEsq());
        int altura_dir = altura(p.getDir());
        if (altura_esq > altura_dir)
            return altura_esq + 1;
        else
            return altura_dir + 1;
    }
    
    public void inOrdemFolhas(){
        inOrdemFolhas(raiz);
    }
    public void inOrdemFolhas(No p){
        if(p != null){
            inOrdemFolhas(p.getEsq());
            if(p.getEsq() == null && p.getDir() == null){ // Nós folhas
                System.out.print(p.getElemento() + " ");
            }
            inOrdemFolhas(p.getDir());
        }
    }
    
    public No menorIt(){
       No p = raiz;
       while (p.getEsq() != null){
           p = p.getEsq();
       }
       return p;
    }
    
    public No menor(){
        return menor(raiz);
    }
    public No menor(No p){
        if (p.getEsq() == null)
            return p;
        
        return menor(p.getEsq());
    }
    public No maior(){
        return maior(raiz);
    }
    public No maior(No p){
        if (p.getDir() == null)
            return p;
        
        return maior(p.getDir());
    }
    
}
