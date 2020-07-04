/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author FITRI CAHYANTI
 */
public class classscanner {
    public static void main(String[] args) {
        String nama = "";
        int ipk =0;
     Integer usia = 0;
     String Alamat="";
     Integer nokk=0;
      // membuat scanner
        System.out.println("nama anda siapa?");
        Scanner keyboard = new Scanner(System.in);
         nama = keyboard.next();
         System.out.println("berapa ipk anda?");
        ipk = (int) keyboard.nextDouble ();
        System.out.println("berapa usia anda?");
        usia = keyboard.nextInt ();
        System.out.println("dimana alamat anda");
        Alamat = keyboard.next();
        System.out.println("masukkan nokk anda");
        nokk = keyboard.nextInt();
        
         
       //output
        System.out.println("nama anda adalah"+ nama);
        System.out.println("ipk anda adalah"+ ipk);
        System.out.println("usia anda adalah"+ usia); 
        System.out.println("alamat anda di" + Alamat);
        System.out.println("nokk anda adalah" + nokk);
              
                        
    
    }
}