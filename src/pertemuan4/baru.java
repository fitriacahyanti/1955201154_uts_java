/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author FITRI CAHYANTI
 */
public class baru {
    public static void main(String[] args) {
        String nama =JOptionPane.showInputDialog("siapa nama anda");
        String alamat =JOptionPane.showInputDialog("dimana anda tinggal") ; 
        String umur =JOptionPane.showInputDialog("berapa umur anda");
        String kampus =JOptionPane.showInputDialog("dimana anda kuliah");
        String prodi =JOptionPane.showInputDialog("prodi apa yang anda ambil");
   
    
    
        System.out.println("nama anda adalah" + nama);
        System.out.println("anda tinggal di"+alamat);
        System.out.println("umur anda"+umur);
        System.out.println("anda kuliah di"+kampus);
        System.out.println("prodi anda adalah"+ prodi);
    }
}
