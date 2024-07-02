/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;


public class PembayaranListrik {
    private String namaPelanggan;
    private String IDPEL;
    private String jenisPelanggan;
    private int jumlahPemakaian;
 

    public PembayaranListrik(String namaPelanggan, String IDPEL, String jenisPelanggan, int jumlahPemakaian) {
        this.namaPelanggan = namaPelanggan;
        this.IDPEL = IDPEL;
        this.jenisPelanggan = jenisPelanggan;
        this.jumlahPemakaian = jumlahPemakaian;
   
    }

    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }

    public void setJumlahPemakaian(int jumlahPemakaian) {
        this.jumlahPemakaian = jumlahPemakaian;
    }

  
    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public int getJumlahPemakaian() {
        return jumlahPemakaian;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setIDPEL(String IDPEL) {
        this.IDPEL = IDPEL;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getIDPEL() {
        return IDPEL;
    }
    
    public String infoTagihan() {
        return "Nama Pelanggan : " + namaPelanggan +
                "\nKode Pelanggan : " +  IDPEL;
                
    }
    
   
} 
