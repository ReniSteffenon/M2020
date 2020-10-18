/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.pj;

/**
 *
 * @author Wendriu
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int qtd;
        String linha;
        
        qtd = Integer.parseInt(in.readLine());
        linha = in.readLine();
        
        String array[] = linha.split(" ");
        
        int maior = Integer.parseInt(array[0]);
        
        for (int i=0; i< qtd; i++){
            if (maior<Integer.parseInt(array[i])){
                maior = Integer.parseInt(array[i]);
            }
        } 
        
        System.out.println(maior + 1);
        
        
    }
}
