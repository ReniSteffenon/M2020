/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.e3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

        boolean continuar = true;
        int vGremio = 0;
        int vInter = 0;
        int empate = 0;
        int nJogos = 0;
        do {
            String resultado[] = in.readLine().split(" ");
            String seguir = in.readLine();
            nJogos++;
            int gremio = Integer.parseInt(resultado[0]);
            int inter = Integer.parseInt(resultado[1]);
            
            if(gremio>inter){
                vGremio++;
            }else{
                if(gremio<inter){
                    vInter++;
                }else{
                    empate++;
                }
            }
            
            if(!seguir.trim().equalsIgnoreCase("1")){
                continuar=false;
            }
            
        } while (continuar);
        
        System.out.println(nJogos+" jogos");
        System.out.println("gremio:"+vGremio);
        System.out.println("inter:"+vInter);
        System.out.println("empate:"+empate);
    }
    
}

