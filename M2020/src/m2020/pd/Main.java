/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.pd;

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
        
        
        String linha = in.readLine();
        
        String sNumeros = linha.replace("(", "");
        sNumeros = sNumeros.replace(")", "");
        sNumeros = sNumeros.replace(" ", "");
        
        String numeros[] = sNumeros.split("");
        
        System.out.println("");
        
        String array[][] = new String[numeros.length][1];
        
        
        for (int i = 0; i < numeros.length; i++){
            
        }
        
    }
}
