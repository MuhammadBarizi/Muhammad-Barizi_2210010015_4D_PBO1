/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PembayaranBeraksi {

             // TODO code application logic here
//        PembayaranDetail ls = new PembayaranDetail("Barizi","izi");
//        
//        
//        ls.setJenisPelanggan("Pabrik");
//        ls.setJumlahPemakaian(100);
//        System.out.println(ls.infoTagihan());
            
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        try {
            PembayaranDetail[] pengguna = new PembayaranDetail[2];

            for (int i = 0; i < pengguna.length; i++) {
                System.out.println("=== Aplikasi Pembayaran Tagihan Listrik ===");

                
                System.out.print("Masukkan Nama Pelanggan ke " + (i+1)+": ");
                String namaPelanggan = scanner.nextLine();

                System.out.print("Masukkan IDPEL ke " + (i+1)+": ");
                String IDPEL = scanner.nextLine();

                System.out.println("Pilih Jenis Pelanggan ke " + (i+1)+": ");
                System.out.println("1. Pabrik");
                System.out.println("2. Swalayan");
                System.out.println("3. Toko");
                System.out.println("4. Rumah");
                System.out.print("Pilihan (1/2/3/4): ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); 

                String jenisPelanggan;
                switch (pilihan) {
                    case 1 -> jenisPelanggan = "Pabrik";
                    case 2 -> jenisPelanggan = "Swalayan";
                    case 3 -> jenisPelanggan = "Toko";
                    case 4 -> jenisPelanggan = "Rumah";
                    default -> throw new IllegalArgumentException("Pilihan tidak valid");
                }

                  int jumlahPemakaian;
                while (true) {
                    try {
                        System.out.print("Masukkan Jumlah Pemakaian (KWH) ke " + (i + 1) + ": ");
                        jumlahPemakaian = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Jumlah Pemakaian harus berupa angka. Silakan coba lagi.");
                    }
                } 

                // Membuat objek pembayaran listrik
                pengguna[i] = new PembayaranDetail(namaPelanggan, IDPEL, jenisPelanggan, jumlahPemakaian);
            }

            for (PembayaranDetail data : pengguna) {
                System.out.println("\n=== Struk Tagihan Listrik ===");
                System.out.println(data.infoTagihan());
            }
           
        } 
        catch(NumberFormatException e) {
             System.out.println("Kesalahan Format Nomor" + e.getMessage());
             }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
    }
    

