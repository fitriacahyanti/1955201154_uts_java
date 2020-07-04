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
public class switchcase {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       char nilai ='B';
       String nama ;
        System.out.println("Masukkan nama :");
        nama =keyboard.next();
        System.out.println("Nilai:"+nilai);
        
        switch(nilai) {
            case 'A':System.out.println(nama +"nilai anda memuaskan");
            break;
            case 'B':System.out.println(nama +"nilai anda bagus");
            break;
            case 'C':System.out.println(nama +"nilai anda memuaskan");
        }
    }
}
