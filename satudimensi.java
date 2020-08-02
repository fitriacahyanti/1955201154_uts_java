/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author FITRI CAHYANTI
 */
public class satudimensi {
    public static void main(String[] args) {
        int NH [] = new int [3];
        int NU [] = new int [3];
        int NUAS [] = new int [3];
        String [] mahasiswa = new String [3];
        int NA;
        Scanner keyboard = new Scanner(System.in);
        for (int i= 0; i < mahasiswa.length; i++){
        System.out.println("---------------------------------");
            System.out.println("Input Nama Mahasiswa ke-" + (i +1)+ "=");
            mahasiswa [i] = keyboard.next();
            System.out.println("-------------------------------");
            System.out.println("Nilai Harian = ");
            NH [i] = keyboard.nextInt();
            System.out.println("Nilai Uts = ");
            NU [i] = keyboard.nextInt();
            System.out.println("Nilai Uas = ");
            NUAS [i] = keyboard.nextInt();
            System.out.println("---------------------------------");
            NA = (int) ((NH [i]* 0.2) + (NU [i]*0.3) + (NUAS [i]*0.5));
            System.out.println("Nilai Akhir : " + NA);
            
            
    }
        
    }
    }

