/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.po;

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
        
        String coluna;
        
        coluna = in.readLine();
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 3;
        int E = 3;
        int F = 3;
        int G = 3;
        int H = 3;
        int I = 3;
        int J = 3;
        int K = 3;
        
                
        int maior = Integer.parseInt(array[0]);
        
        for (int i=0; i< qtd; i++){
            if (maior<Integer.parseInt(array[i])){
                maior = Integer.parseInt(array[i]);
            }
        } 
        
        System.out.println(maior + 1);
        
        
    }
}
