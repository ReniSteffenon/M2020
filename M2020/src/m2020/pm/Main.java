/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.pm;

import m2020.pl.*;
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
        
        String saida[] = new String[numero];
        
        boolean q = false;
        boolean j = false;
        boolean k = false;
        boolean a = false;
        
        for(int i=0; i<numero; i++){
            
            String entrada = in.readLine();
            for(int o=0; o<entrada.length(); o++){
                char aux = entrada.charAt(o);
                if(aux=='Q'){
                    q = true;
                }
                if(aux=='J'){
                    j = true;
                }
                if(aux=='K'){
                    k = true;
                }
                if(aux=='A'){
                    a = true;
                }
            }
            if(q==true&&j==true&&k==true&&a==true){
                saida[i] = "Aaah muleke";
            }else{
                saida[i] = "Ooo raca viu";
            }
            q = false;
            j = false;
            k = false;
            a = false;
        }
        
        for(int i=0; i<numero; i++){
            System.out.println(saida[i]);
        }
        
    }
    
}