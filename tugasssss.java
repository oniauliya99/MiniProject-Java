/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.project;

/**
 *
 * @author oni
 */
import java.util.Scanner;
public class tugasssss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char menu,pilih;
        int luarBiasa=5, harga=50000, biasa=3,tiket;
        double diskon=0.1F,total;
        String persetujuan;
        
        System.out.println("=========================");
        System.out.println("Menu Tiket");
        System.out.println("1.VIP");
        System.out.println("2.Reguler");
        System.out.println("3.Undangan");
        System.out.println("=========================");
        System.out.print("Silahkan pilih\t:");
        menu = scan.next().charAt(0);
        
        switch(menu){
            case'1':
                System.out.println("----------Menu VIP----------");
                System.out.println("a.Luar Biasa");
                System.out.println("b.Sedang");
                System.out.println("c.Biasa");
                System.out.println("----------Menu VIP----------");
                System.out.print("Silahkan Pilih\t:");
                pilih = scan.next().charAt(0);
                switch(pilih){
                    case'a':
                        System.out.println("CATATAN : Tiket yang Anda beli harus lebih dari 5 jika ingin mendapat diskon LuarBiasa");
                        System.out.print("Masukkan tiket yang akan dibeli\t:");
                        tiket =scan.nextInt();
                        if(tiket>5){
                            total = tiket*harga*luarBiasa-(diskon*harga);
                            System.out.printf("Selamat Anda mendapatkan diskon 10 persen%ndan total Anda adalah Rp.%.1f dan Anda mendapat minuman gratis%n",total);
                        }
                        break;
                    
                            
                        
                            
                }
        }
        // TODO code application logic here
    }
    
}
