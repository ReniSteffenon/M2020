/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.pn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author renisteffenon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int numero;
        
        numero = Integer.parseInt(in.readLine());
        
        int saida = 0;
        String entrada = "";
        
        for(int i=1; i<numero+1; i++){
            entrada = ""+i;
            for(int j=0; j<entrada.length(); j++){
                if(entrada.charAt(j)=='1'){
                    saida++;
                }else{
                    if(entrada.charAt(j)=='7'){
                        saida++;
                    }
                }
            }
        }
        
        System.out.println(""+saida);
        
    }
    
}