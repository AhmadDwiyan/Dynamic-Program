/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynami.program.pkg1;
import java.util.Scanner;
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
    public static void main(String[] args){
        String identitas="Ahmad Dwiyan Anugrah Putra / X RPL 5/ 03";
        au(identitas);
        int n = tampilinputwes();
    }
}
