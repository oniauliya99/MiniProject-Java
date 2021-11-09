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
public class MiniProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char menu,pilih,memilih;
        int  harga=50000,hargaVIP=75000,hargaUndangan=60000, tiket;
        double diskonVIP=0.1F,diskonSedang=0.03F,total,biaya,diskon;
        double diskonr=0.1F,diskonu=0.5F;
        String persetujuan;
        System.out.println("--------------SELAMAT DATANG DI PEMESANAN TIKET GELORA BUNG TOMO!---------------");
        System.out.println("=================================================================================");
        System.out.println("|Menu Tiket\t\t\t\t\t\t\t\t\t|");
        System.out.println("|1.VIP\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|2.Reguler\t\t\t\t\t\t\t\t\t|");
        System.out.println("|3.Undangan (Khusus Tamu Undangan)\t\t\t\t\t\t|");
        System.out.println("=================================================================================");
        System.out.print("|Silahkan pilih berdasar angka (Pilihan Angka)\t\t:");
        menu = scan.next().charAt(0);
        
        switch(menu){
            case'1':
                System.out.println("---------------------------------Menu VIP----------------------------------------");
                System.out.println("|a.Luar Biasa (\u2605 5.0 up to diskon 10%) \t\t\t\t\t\t|");
                System.out.println("|b.Sedang     (\u2605 4.8 up to diskon 3%)\t\t\t\t\t\t|");
                System.out.println("|c.Biasa      (\u2605 3.0)\t\t\t\t\t\t\t\t|");
                System.out.println("---------------------------------Menu VIP----------------------------------------");
                System.out.print("|Silahkan Pilih berdasarkan huruf (Pilihan huruf)\t:");
                pilih = scan.next().charAt(0);
                switch(pilih){
                    case'a':
                        System.out.println("CATATAN : Tiket yang Anda beli harus lebih dari 5 jika ingin mendapat diskon Luar Biasa");
                        System.out.print("Masukkan tiket yang akan dibeli\t:");
                        tiket =scan.nextInt();
                        if(tiket>5){
                            biaya = tiket*hargaVIP;
                            diskon=diskonVIP*biaya;
                            total= biaya-diskon;
                            System.out.printf("Selamat Anda mendapatkan diskon 10 persen%ndan total Anda adalah Rp.%.1f dan Anda mendapat minuman gratis%n",total);
                        }
                        else { 
                            
                            System.out.println("Silahkan memilih menu Sedang atau Biasa");
                        }
                        break;
                    
                        
                    case'b':
                        System.out.println("CATATAN : Tiket yang Anda beli harus antara 2 sampai dengan 5 jika ingin mendapat diskon Sedang");
                        System.out.print("Masukkan tiket yang akan dibeli\t:");
                        tiket =scan.nextInt();
                        if(tiket>=2&&tiket<=5){
                            biaya = tiket*hargaVIP;
                            diskon=diskonSedang*biaya;
                            total= biaya-diskon;
                            System.out.printf("Selamat Anda mendapatkan diskon 3 persen%ndan total Anda adalah Rp.%.1f dan Anda mendapat minuman gratis%n",total);
                        }
                        else { 
                            
                            System.out.println("Silahkan memilih menu biasa");
                        }
                        break;
                    case'c':
                        
                        System.out.print("Masukkan tiket yang akan dibeli\t:");
                        tiket =scan.nextInt();
                        
                            total = tiket*hargaVIP;
                            System.out.printf("Selamat Anda mimilih jalur VIP, total Anda Rp.%s Anda mendapat minuman gratis%n", total);
                        
                        
                        break;
                    default:
                        System.out.println("Pilihan Salah!!!");
                }
                break;
            case'2':
                System.out.println("-------------------------------Menu Reguler--------------------------------------");
                System.out.println("|a.Luar Biasa (\u2605 5.0 up to diskon 10%) \t\t\t\t\t\t|");
                System.out.println("|b.Biasa      (\u2605 2.0)\t\t\t\t\t\t\t\t|");
                System.out.println("-------------------------------Menu Reguler--------------------------------------");
                System.out.print("|Silahkan Pilih berdasarkan huruf (Pilihan huruf)\t:");
                pilih = scan.next().charAt(0);
                switch(pilih){
                    case'a':
                        System.out.println("CATATAN : Tiket yang Anda beli harus lebih dari 10 jika ingin mendapat diskon Luar Biasa");
                        System.out.print("Masukkan tiket yang akan dibeli\t:");
                        tiket =scan.nextInt();
                        if(tiket>10){
                            biaya = tiket*harga;
                            diskon=biaya*diskonr;
                            total=biaya-diskon;
                            System.out.printf("|Selamat Anda mendapatkan diskon 10 persen%ndan total Anda adalah Rp.%.1f%n",total);
                        }
                        else { 
                            
                            System.out.println("Silahkan memilih menu Biasa ");
                        }
                        break;
                    case'b':
                        
                        System.out.print("Masukkan tiket yang akan dibeli\t:");
                        tiket =scan.nextInt();
                        
                            total = tiket*harga;
                            System.out.printf("Selamat Anda mimilih jalur Reguler, total Anda Rp.%s %n", total);
                            System.out.println("Apakah Anda ingin memilih ");
                            System.out.println("a. Topi");
                            System.out.println("b. Minuman");
                            memilih = scan.next().charAt(0);
                        switch(memilih){
                    case'a':
                            System.out.println("Selamat Anda mendapat Topi");
                        break;
                     case'b':
                         System.out.println("Selamat Anda Mendapat Minuman");
                        break;
                        }
                        
                        break;
                    default:
                        System.out.println("Pilihan salah!!");
        }
                break;
            case'3':
                        System.out.println("-------------------------\u2605-----Tamu Undangan-----\u2605------------------------------");
                        System.out.print("Masukkan tiket yang akan dibeli\t:");
                        tiket =scan.nextInt();
                        
                            biaya = tiket*hargaUndangan;
                            diskon=biaya*diskonu;
                            total=biaya-diskon;
                            System.out.printf("Silahkan duduk di kursi yang telah disediakan, total Anda Rp.%s Anda mendapat minuman gratis%n", total);
                 break;
            default:
                System.out.println("Pilihan salah!!");
    
}
}
}