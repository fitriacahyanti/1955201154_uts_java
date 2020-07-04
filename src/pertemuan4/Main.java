/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author FITRI CAHYANTI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // 
  String nama = "";
  String status = "";
  String alamat = "";
  String ttl = "";
  String umur = "";
  //object inputStream
  InputStreamReader isr = new InputStreamReader (System.in) ;
  //object Bufferedreader
  BufferedReader br = new BufferedReader (isr) ;
  //mengisi variabel nama dengan bufferedReader
  System.out.println( "Siapa nama anda");
  nama = br.readLine ();
   System.out.println( "Apa status anda");
  status = br.readLine ();
  System.out.println( "dimana alamat anda");
  alamat= br.readLine ();
  System.out.println( "masukkan ttl anda");
  ttl= br.readLine ();
   System.out.println( "berapa umur anda");
  umur= br.readLine ();
  
  
  
  //menampilkan output
  System.out.println( "nama anda adalah" + nama);
  System.out.println( "anda ternyata" + status);
  System.out.println( "alamat anda di" + alamat);
  System.out.println( "ttl anda adalah" + ttl);
  System.out.println( "umur anda adalah" + umur);
  
  
  
  
  
  
        }
    }
    

