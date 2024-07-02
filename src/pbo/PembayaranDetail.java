/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author ASUS
 */
public class PembayaranDetail extends PembayaranListrik {

    public PembayaranDetail(String namaPelanggan, String IDPEL, String jenisPelanggan, int jumlahPemakaian) {
        super(namaPelanggan, IDPEL, jenisPelanggan, jumlahPemakaian);
    }
     public int hitungTagihan() {
        int biayaPerKWH = 0;
        int biayaAdmin = 0;
        
        switch (getJenisPelanggan()) {
            case "Pabrik" -> {
                biayaPerKWH = 2500;
                biayaAdmin = 50000;
            }
            case "Swalayan" -> {
                biayaPerKWH = 2500;
                biayaAdmin = 35000;
            }
            case "Toko" -> {
                biayaPerKWH = 1500;
                biayaAdmin = 25000;
            }
            case "Rumah" -> {
                biayaPerKWH = 750;
                biayaAdmin = 15000;
            }
            default -> throw new IllegalArgumentException("Jenis pelanggan tidak valid");
        }
        int totalTagihan =  biayaAdmin + (biayaPerKWH * getJumlahPemakaian());
        
        return  totalTagihan;
    }
    @Override
     public String infoTagihan() {
        return super.infoTagihan() +
                "\nJenis Pelanggan : " +getJenisPelanggan() +
                "\nJumlah :" + getJumlahPemakaian() +
                "\nTotal Tagihan :" + hitungTagihan();
    }
     
    
}
