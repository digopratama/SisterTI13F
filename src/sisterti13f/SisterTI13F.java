/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisterti13f;
import java.util.Scanner;

/**
 *
 * @author Digo Pratama <digopratama@digo.my.id>
 */
public class SisterTI13F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputan=new Scanner(System.in);
        String nama;
        
        System.out.print("Input Nama: ");
        nama=inputan.nextLine();
        
        System.out.println("Namaku adalah "+nama);
        System.out.printf("Namaku adalah %s \n",nama);
        
    }
    
}
