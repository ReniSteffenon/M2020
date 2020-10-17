/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.pl;

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
        
        String[][] entrada = new String[numero][2];
        
        int carrinho = 0;
        int boneca = 0;
        
        for(int i =0; i<numero; i++){
            String aux[] = in.readLine().split(" ");
            if(aux[1].trim().equalsIgnoreCase("F")){
                boneca++;
            }
            if(aux[1].trim().equalsIgnoreCase("M")){
                carrinho++;
            }
        }
        
        System.out.println(carrinho+" carrinhos");
        System.out.println(boneca+" bonecas");
    }
    
}