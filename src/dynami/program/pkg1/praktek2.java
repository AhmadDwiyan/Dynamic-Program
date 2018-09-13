/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynami.program.pkg1;

import java.util.Scanner;

public class praktek2 {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
          System.out.println("Masukan Berat Yang Ingin DIangkat");
       int uang= input.nextInt();
       int pecahan[]= new int[]{7,5,4,3,2};
         int upah[]= new int[]{10000,7000,5000,3000,2000};
         String nama[]= new String[]{"E","D","C","B","A"};
        int jumlah;
       int banyak;
       int harga;
       for(int i=0;i<pecahan.length;i++){
        if(uang >= pecahan[i]){
            jumlah = uang/pecahan[i];
            banyak= jumlah*pecahan[i];
            uang=uang%pecahan[i];
            harga=jumlah*upah[i];
            System.out.println("Nama Barang "+nama[i]+" Berat Barang "+pecahan[i]+" Harga Total Rp."+harga);
        }
    }
    }
}
