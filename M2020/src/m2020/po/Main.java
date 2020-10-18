/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2020.po;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wendriu
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String coluna;
        boolean permanece = true;
        List<String> en = new ArrayList<String>();
        do {
            coluna = in.readLine();
            if (coluna.equalsIgnoreCase("EOF")) {
                permanece = false;
                en.add(coluna);
            } else {
                en.add(coluna);
            }

        } while (permanece);

        permanece = true;

        int y = 0;

        do {
            int valorF = 0;
            coluna = en.get(y);
            if (coluna.equalsIgnoreCase("EOF")) {
                permanece = false;
            } else {
                if (coluna.length() > 3) {
                    System.out.println("Essa coluna nao existe Tobias!");
                } else {
                    for (int i = 0; i < coluna.length(); i++) {
                        int valor = 0;
                        char entrada = coluna.charAt(i);
                        if (entrada == 'A') {
                            valor += 1;
                        }
                        if (entrada == 'B') {
                            valor += 2;
                        }
                        if (entrada == 'C') {
                            valor += 3;
                        }
                        if (entrada == 'D') {
                            valor += 4;
                        }
                        if (entrada == 'E') {
                            valor += 5;
                        }
                        if (entrada == 'F') {
                            valor += 6;
                        }
                        if (entrada == 'G') {
                            valor += 7;
                        }
                        if (entrada == 'H') {
                            valor += 8;
                        }
                        if (entrada == 'I') {
                            valor += 9;
                        }
                        if (entrada == 'J') {
                            valor += 10;
                        }
                        if (entrada == 'K') {
                            valor += 11;
                        }
                        if (entrada == 'L') {
                            valor += 12;
                        }
                        if (entrada == 'M') {
                            valor += 13;
                        }
                        if (entrada == 'N') {
                            valor += 14;
                        }
                        if (entrada == 'O') {
                            valor += 15;
                        }
                        if (entrada == 'P') {
                            valor += 16;
                        }
                        if (entrada == 'Q') {
                            valor += 17;
                        }
                        if (entrada == 'R') {
                            valor += 18;
                        }
                        if (entrada == 'S') {
                            valor += 19;
                        }
                        if (entrada == 'T') {
                            valor += 20;
                        }
                        if (entrada == 'U') {
                            valor += 21;
                        }
                        if (entrada == 'V') {
                            valor += 22;
                        }
                        if (entrada == 'W') {
                            valor += 23;
                        }
                        if (entrada == 'X') {
                            valor += 24;
                        }
                        if (entrada == 'Y') {
                            valor += 25;
                        }
                        if (entrada == 'Z') {
                            valor += 26;
                        }

                        if (coluna.length() == 1) {

                        }
                        if (coluna.length() == 2) {
                            if (i == 0) {
                                valor = valor * 26;
                            }

                        }
                        if (coluna.length() == 3) {
                            if (i == 0) {
                                valor = (valor * 26) * 26;
                            }
                            if (i == 1) {
                                valor = valor * 26;
                            }

                        }
                        valorF += valor;

                    }
                    if (valorF > 16385) {
                        System.out.println("Essa coluna nao existe Tobias!");
                    } else {
                        System.out.println(valorF);
                    }
                }

            }
            y++;
        } while (permanece);

    }
}
