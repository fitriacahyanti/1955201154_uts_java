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
public class kasir {
    public static void main(String[] args) {
        System.out.println("__________________________________");
        System.out.println("|       KEDAI KOPI INSPIRASI     |");
        System.out.println("__________________________________");
        System.out.println("| -Jenis kopi-     |  -Harga        |");
        System.out.println("|1. Espresso       | Rp 14.000      |");
        System.out.println("|2. Cappuccino     | Rp 22.000      |");
        System.out.println("|3. Mochachino     | Rp 24.000      |");
        System.out.println("|4. Latte          | Rp 22.000      |");
        System.out.println("|5. Hazelnut Latte | Rp 26.000      |");
        System.out.println("|__________________|________________|");
        System.out.println("");
        
        int harga,total,kembali;
        int h1 = 14000 , h2 = 22000, h3 = 24000 , h4 = 22000 , h5 = 26000;
        String menu ;
        
        {
            System.out.println("___________________________________");
            
            
            System.out.println("Masukkan Kode Kopi");
            Scanner keyboard = new Scanner(System.in);
            int inNomor = keyboard.nextInt ();    
            System.out.println("Masukkan Banyak Pesanan");
            int jumlah = keyboard.nextInt();
            
            
            System.out.println("_____________________________________");
            
            if (inNomor==1)
            {
                menu = ".Espresso";
                System.out.println("Pilihan anda nomor :"+inNomor+menu);
                total=h1*jumlah ;
                System.out.println("Total Harga : Rp."+total);
                
                System.out.println("____________________________________");
                System.out.println("Uang yang Anda Bayar : Rp.");
                int jumlah_bayar = keyboard.nextInt();
                kembali = jumlah_bayar - total ;
                System.out.println("Uang Kembalian: Rp."+ kembali);
            }
            
             if (inNomor==2)
            {
                menu = ".Cappuccino";
                System.out.println("Pilihan anda nomor :"+inNomor+menu);
                total=h1*jumlah ;
                System.out.println("Total Harga : Rp."+total);
                
                System.out.println("____________________________________");
                System.out.println("Uang yang Anda Bayar : Rp.");
                int jumlah_bayar = keyboard.nextInt();
                kembali = jumlah_bayar - total ;
                System.out.println("Uang Kembalian: Rp."+ kembali);
            }
            
             if (inNomor==3)
            {
                menu = ".Mochachino";
                System.out.println("Pilihan anda nomor :"+inNomor+menu);
                total=h1*jumlah ;
                System.out.println("Total Harga : Rp."+total);
                
                System.out.println("____________________________________");
                System.out.println("Uang yang Anda Bayar : Rp.");
                int jumlah_bayar = keyboard.nextInt();
                kembali = jumlah_bayar - total ;
                System.out.println("Uang Kembalian: Rp."+ kembali);
            }
            
            if (inNomor==4)
            {
                menu = ".Latte";
                System.out.println("Pilihan anda nomor :"+inNomor+menu);
                total=h1*jumlah ;
                System.out.println("Total Harga : Rp."+total);
                
                System.out.println("____________________________________");
                System.out.println("Uang yang Anda Bayar : Rp.");
                int jumlah_bayar = keyboard.nextInt();
                kembali = jumlah_bayar - total ;
                System.out.println("Uang Kembalian: Rp."+ kembali);
            }
            
            if (inNomor==5)
            {
                menu = ".Hazelnut Latte";
                System.out.println("Pilihan anda nomor :"+inNomor+menu);
                total=h1*jumlah ;
                System.out.println("Total Harga : Rp."+total);
                
                System.out.println("____________________________________");
                System.out.println("Uang yang Anda Bayar : Rp.");
                int jumlah_bayar = keyboard.nextInt();
                kembali = jumlah_bayar - total ;
                System.out.println("Uang Kembalian: Rp."+ kembali);
            }
            
            else 
            {System.out.println("Nomor yang dipilih tidak ada di menu");}
        }
        
    }
}
