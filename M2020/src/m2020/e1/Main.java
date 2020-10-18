/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.e1;

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
        
        String alfabetoU = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String alfabetoL = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        
        String arrayU[] = alfabetoU.split(" ");
        String arrayL[] = alfabetoL.split(" ");
        
        String linha = in.readLine();
        
        String l[] = linha.split("");
        
        for (int i=0; i<l.length; i++){
            for (int j=0; j<arrayL.length; j++){
                int prox = j + 13;
                if (prox >= 25){
                    prox = prox - 26;
                }
                if (l[i].equals(arrayL[j])){
                    l[i]=arrayL[prox];
                    j=arrayL.length;
                }
            }
            
            for (int j=0; j<arrayU.length; j++){
                int prox = j + 13;
                if (prox >= 25){
                    prox = prox - 26;
                }
                if (l[i].equals(arrayU[j])){
                    l[i]=arrayU[prox];
                    j=arrayU.length;
                }
            }
        }
        
        linha = "";
        for(int i=0; i<l.length; i++){
            linha += l[i];
        }
        
        System.out.println(linha);
    }
}
