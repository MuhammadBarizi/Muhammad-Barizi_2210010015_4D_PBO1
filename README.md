# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PembayaranListrik`, `PembayaranDetail`, dan `PembayaranBeraksi` adalah contoh dari class.

```bash
public class PembayaranListrik {
    ...
}

public class MahasiswaDetail extends Mahasiswa {
    ...
}

public class MahasiswaBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pengguna[i] = new PembayaranDetail(namaPelanggan, IDPEL, jenisPelanggan, jumlahPemakaian);` adalah contoh pembuatan object.

```bash
pengguna[i] = new PembayaranDetail(namaPelanggan, IDPEL, jenisPelanggan, jumlahPemakaian);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPelanggan` ,`IDPEL`,`JenisPelanggan`,` dan `,`jumlahPemakaian` adalah contoh atribut.

```bash
String namaPelanggan;
String IDPEL;
String jenisPelanggan;
int jumlahPemakaian;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
 public PembayaranListrik(String namaPelanggan, String IDPEL, String jenisPelanggan, int jumlahPemakaian) {
        this.namaPelanggan = namaPelanggan;
        this.IDPEL = IDPEL;
        this.jenisPelanggan = jenisPelanggan;
        this.jumlahPemakaian = jumlahPemakaian;
    }
}

public PembayaranDetail(String namaPelanggan, String IDPEL, String jenisPelanggan, int jumlahPemakaian) {
        super(namaPelanggan, IDPEL, jenisPelanggan, jumlahPemakaian);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPelanggan`, `setIDPEL` `setJenisPelanggan` `setJumlahPemakaian` dan `setNpm` adalah contoh method mutator.

```bash
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    
    public void setIDPEL(String IDPEL) {
        this.IDPEL = IDPEL;
    }  
    
    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }

    public void setJumlahPemakaian(int jumlahPemakaian) {
        this.jumlahPemakaian = jumlahPemakaian;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPelanggan`, `getIDPEL`, `getJenisPelanggan`, `getJumlahPemakaian`, `getHitungTagihan` adalah contoh method accessor.

```bash
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
   
    public String getIDPEL() {
        return IDPEL;
    }
    
    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public int getJumlahPemakaian() {
        return jumlahPemakaian;
    }

    publinic int getHitungTagihan() {
        }

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPelanggan` ,`IDPEL`,`JenisPelanggan`,` dan `,`jumlahPemakaian` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String namaPelanggan;
    private String IDPEL;
    private String jenisPelanggan;
    private int jumlahPemakaian;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PembayaranDetail` mewarisi `PembayaranDetail` dengan sintaks `extends`.

```bash
public class PembayaranDetail extends PembayaranListrik {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `infoTagihan(String)` di `PembayaranListrik` merupakan overloading method `infoTagihan` dan `infoTagihan` di `PembyaranDetail` merupakan override dari method `infoTagihan` di `PembayaranListrik`.

```bash
public String infoTagihan() {
        return "Nama Pelanggan : " + namaPelanggan +
                "\nKode Pelanggan : " +  IDPEL;
    }


    @Override
     public String infoTagihan() {
        return super.infoTagihan() +
                "\nJenis Pelanggan : " +getJenisPelanggan() +
                "\nJumlah Pemakaian :" + getJumlahPemakaian() +
                "\nTotal Tagihan :" + hitungTagihan();
    }

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getHitungTagihan` dan seleksi `switch` dalam method  di PembayaranDetail`getJenisPelanggan` di PembayaranListrik. 

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 for (int i = 0; i < pengguna.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
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

                System.out.print("Masukkan Jumlah Pemakaian (KWH) ke "  + (i+1)+": ");
                int jumlahPemakaian = scanner.nextInt();
                scanner.nextLine(); 
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
PembayaranDetail[] pengguna = new PembayaranDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Barizi
NPM: 2210010015
