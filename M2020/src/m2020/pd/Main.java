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
        
        String array[][] = new String[numeros.length][4];
        int cont = 0;
        int nivel=0;
        
        for (int i = 0; i < linha.length(); i++){
            if (linha.substring(i, i + 1).equals("(")){
                array[cont][0] = linha.substring(i + 1, i + 2);
                array[cont][1] = String.valueOf(nivel);
                cont++;
                nivel++;
 
            }else if (linha.substring(i, i + 1).equals(")")){
                nivel--;
            }
        }
        
        for (int i=array.length - 1; i>=0; i--){
            for (int j=i; j>=0; j--){
                if (Integer.parseInt(array[j][1])==Integer.parseInt(array[i][1])-1){
                    array[i][2] = array[j][0];
                    j=0;
                }
            }
        }
        
        for (int i=0; i< array.length; i++){
            System.out.println(array[i][0] + " - " + array[i][1] + " - PAI: " + array[i][2]);
        }
        
        for (int i=array.length - 1; i>=0; i--){
            
        }
        
    }
}
