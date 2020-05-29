/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_frequenciapalavra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class testaFreqPalavra {

    public static void main(String[] args) {
        String arquivo = "Arquivo.txt";
        String linha = "";
        FreqPalavra freqPalavra = new FreqPalavra();
        String[] palavra = null;

        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((linha = bufferedReader.readLine()) != null) {
                palavra = linha.split(" ");
                for (int i = 0; i < palavra.length; i++) {
                    if(!freqPalavra.buscaIt(palavra[i])){
                    freqPalavra.insere(palavra[i]);
                    }
                }
            }
            
           freqPalavra.inOrdem();

        } catch (Exception e) {
            System.out.println("Atrquivo " + arquivo + " inexistente");
        }

    }
}
