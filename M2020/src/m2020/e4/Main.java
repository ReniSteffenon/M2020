/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.e4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Wendriu
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int qtd = 0;
        String linha = in.readLine();
        String val[] = linha.split(" ");
        
        Integer ordenado[] = new Integer[Integer.parseInt(val[0])*Integer.parseInt(val[1])]; 
        int cont = 0;
        
        for (int i=0; i< Integer.parseInt(val[0]); i++){
            linha = in.readLine();
            String array[] = linha.split(" ");
            
            for (int j=0; j<array.length; j++){
                ordenado[cont] = Integer.parseInt(array[j]);
            }
        }
        
        
       
    }
}
