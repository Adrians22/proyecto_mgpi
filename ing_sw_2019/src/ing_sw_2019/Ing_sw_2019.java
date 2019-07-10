/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ing_sw_2019;

import java.util.Scanner;

/**
 *
 * @author ADRIAN SANCHEZZ
 */
public class Ing_sw_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, f=0,t1=1,t2;
        System.out.print("¿cuantos numeros desea generar?");
        n=leer.nextInt();
        for(int i=1;i<=n;i++){
            t2=f;
            f=t1+f;
            t1=t2;
            System.out.println(t1);
        }
    }
    
}
