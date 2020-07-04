/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import static java.time.Clock.system;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author FITRI CAHYANTI
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("*     TOKO BUKU DELIMA       *");
        String nama_barang;
        int jumlah_barang = 0,harga,totalharga;
        double diskon = 0.075;
        double totalbayar ;
        
        System.out.println("selamat datang di toko buku delima");
        System.out.println("------------------------------------");
        System.out.println("Masukkan data berikut");
        System.out.println("nama barang");
        Scanner keyboard = new Scanner(System.in);
         nama_barang = keyboard.next();
         System.out.println("jumlah barang");
       nama_barang = keyboard.next();
       if (jumlah_barang<= 0)
            System.out.println("Mohon masukkan jumlah yang benar dan ulangi programnya");
       System.exit(0);
        System.out.println("Harga barang = ");
        harga = keyboard.nextInt();
        if (harga<100)
            System.out.println("mohon masukkan harga yang valid dan ulangi programnya");
        System.exit(0);
        System.out.println("Anda mendapat diskon 7,5%");
        totalharga = jumlah_barang*harga ;
        System.out.println("totalharga " + totalharga );
        diskon = totalharga*diskon ;
        totalbayar = totalharga-diskon;
        System.out.println("totalbayar"+ totalbayar);
        System.out.println("---------------------------------------------");
        System.out.println("Nota Belanja");
        System.out.println("Nama Barang" + nama_barang);
        System.out.println("Jumlah Barang" + jumlah_barang);
        System.out.println("Harga Barang" + harga);
        System.out.println("Total Harga" + totalharga);
        System.out.println("Total Bayar" + totalbayar);
        System.out.println("-----------------------------------------------");
        
       
       
       
     
        
        
        
        
        
    }
}
