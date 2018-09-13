/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynami.program.pkg1;
import java.util.Scanner;
import java.math.BigInteger;
public class dinamic {
    public static void au(String identitas){
        System.out.println("Identitas "+identitas);
        
        System.out.println("\n Hitung Fibonacci ");
        
        System.out.println("1,1,2,3,5,8,13,21,.....dst.\n");
    }
    public static int tampilinputwes(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan Ke : - ");
        int n =scanner.nextInt();
        return n;
    }
    public static BigInteger fibo(int n){
       BigInteger[] hasil = new BigInteger[n] ;
       hasil[0]=BigInteger.ONE;
       hasil[1]=BigInteger.ONE;
       for (int i = 2;i < n;i++) {
           hasil[i]=hasil[i-1].add(hasil[i-2]);
       }
       return hasil[n-1];
    }
    private static void au(int n,BigInteger hasil) {
        System.out.println("Bilangan Fibonacci ke-"+n+" : "+hasil);
    }
    public static void main(String[] args){
        String identitas="Ahmad Dwiyan Anugrah Putra / X RPL 5/ 03";
        au(identitas);
        int n = tampilinputwes();
        BigInteger hasil = fibo(n);
        au(n, hasil);
    }
}
