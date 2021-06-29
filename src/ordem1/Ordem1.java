/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordem1;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Ordem1 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
         int n, ordem, termo;
        String resp1 = "ordem: ", resp2 = "termo:";  
       termo = -1;
        System.out.println("Informe a quantidade  \"N\" :");
        n = ler.nextInt();
        for (ordem = 1; ordem <= n; ordem++) {
            resp1 += ordem + " ";
            
            resp2 += termo + " ";

            if (ordem == 1) {
                termo = termo + 2;

            } else {
                if (ordem % 2 != 0) {
                    termo++;
                } else {
                    termo = termo + 5;

                }
            }
        }
        
    }
    
}
