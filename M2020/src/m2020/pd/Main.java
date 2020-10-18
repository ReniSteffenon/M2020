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

class Nodo{

    protected int id;
    protected int nivel;
    protected int pai;
    protected int filho0;
    protected int filho1;
    
    public Nodo(int id, int nivel, int pai){
        this.id = id;
        this.nivel = nivel;
        this.pai = pai;
        this.filho0 = 0;
        this.filho1 = 0;
    }
    
    public boolean isFolha(){
        if(filho0==0&&filho1==0){
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPai() {
        return pai;
    }

    public void setPai(int pai) {
        this.pai = pai;
    }

    public int getFilho0() {
        return filho0;
    }

    public void setFilho0(int filho0) {
        this.filho0 = filho0;
    }

    public int getFilho1() {
        return filho1;
    }

    public void setFilho1(int filho1) {
        this.filho1 = filho1;
    }
    
    
    
}
