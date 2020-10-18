/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.pn;

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

        long indexa = 1000000000;
        long index1 = 1800000001;
        long indexb = 1000000;
        long index2 = 1200001;
        long indexc = 10000000;
        long index3 = 14000001;
        long indexd = 100000000;
        long index4 = 160000001;
        long indexe = 100000;
        long index5 = 100001;
        long numero;

        numero = Long.parseLong(in.readLine());

        List<Integer> digitos = new ArrayList<Integer>();

        long saida = 0;
        String entrada = "";
        int ultimoD = 0;
        long anterior = 0;

        if (numero > indexa) {
            saida += index1;
            anterior = verificarDigitos("" + (indexa + 1));
            for (long i = indexa + 1; i < numero + 1; i++) {
                entrada = "" + i;
                if (ultimoD == 9) {
                    ultimoD = 0;
                    anterior = verificarDigitos(entrada);
                } else {
                    ultimoD++;
                }
                if (ultimoD == 1 || ultimoD == 7) {
                    saida++;
                }
                saida += anterior;
            }
        } else {
            if (numero > indexd) {
                saida += index4;
                anterior = verificarDigitos("" + (indexd + 1));
                for (long i = indexd + 1; i < numero + 1; i++) {
                    entrada = "" + i;
                    if (ultimoD == 9) {
                        ultimoD = 0;
                        anterior = verificarDigitos(entrada);
                    } else {
                        ultimoD++;
                    }
                    if (ultimoD == 1 || ultimoD == 7) {
                        saida++;
                    }
                    saida += anterior;
                }
            } else {
                if (numero > indexc) {
                    saida += index3;
                    anterior = verificarDigitos("" + (indexc + 1));
                    for (long i = indexc + 1; i < numero + 1; i++) {
                        entrada = "" + i;
                        if (ultimoD == 9) {
                            ultimoD = 0;
                            anterior = verificarDigitos(entrada);
                        } else {
                            ultimoD++;
                        }
                        if (ultimoD == 1 || ultimoD == 7) {
                            saida++;
                        }
                        saida += anterior;
                    }
                } else {
                    if (numero > indexb) {
                        saida += index2;
                        anterior = verificarDigitos("" + (indexb + 1));
                        for (long i = indexb + 1; i < numero + 1; i++) {
                            entrada = "" + i;
                            if (ultimoD == 9) {
                                ultimoD = 0;
                                anterior = verificarDigitos(entrada);
                            } else {
                                ultimoD++;
                            }
                            if (ultimoD == 1 || ultimoD == 7) {
                                saida++;
                            }
                            saida += anterior;
                        }
                    } else {
                        if (numero > indexe) {
                            saida += index5;
                            anterior = verificarDigitos("" + (indexe + 1));
                            for (long i = indexe + 1; i < numero + 1; i++) {
                                entrada = "" + i;
                                if (ultimoD == 9) {
                                    ultimoD = 0;
                                    anterior = verificarDigitos(entrada);
                                } else {
                                    ultimoD++;
                                }
                                if (ultimoD == 1 || ultimoD == 7) {
                                    saida++;
                                }
                                saida += anterior;
                            }
                        } else {
                            for (long i = 1; i < numero + 1; i++) {
                                entrada = "" + i;
                                if (ultimoD == 9) {
                                    ultimoD = 0;
                                    anterior = verificarDigitos(entrada);
                                } else {
                                    ultimoD++;
                                }
                                if (ultimoD == 1 || ultimoD == 7) {
                                    saida++;
                                }
                                saida += anterior;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("" + saida);

    }

    public static long verificarDigitos(String entrada) {
        long saida = 0;
        for (int j = 0; j < entrada.length() - 1; j++) {
            if (entrada.charAt(j) == '1') {
                saida++;
            } else {
                if (entrada.charAt(j) == '7') {
                    saida++;
                }
            }
        }
        return saida;
    }

}
