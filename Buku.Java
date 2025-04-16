
package tugas.pkg1_muh.alif.faturahman_13020230039;

// Buku.java
/**
 * Class Buku sebagai turunan dari Item untuk merepresentasikan buku
 */
public class Buku extends Item {
    private String penulis;
    private int jumlahHalaman;
    private String genre;

    /**
     * Constructor untuk inisialisasi objek Buku
     */
    public Buku(String id, String judul, int tahunTerbit, 
               String penulis, int jumlahHalaman, String genre) {
        super(id, judul, tahunTerbit);
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        this.genre = genre;
    }

    // Getter methods
    public String getPenulis() { return penulis; }
    public int getJumlahHalaman() { return jumlahHalaman; }
    public String getGenre() { return genre; }

    /**
     * Method override untuk menampilkan informasi lengkap buku
     */
    @Override
    public void displayInfo() {
        super.displayInfo();//*memanggil dan menjalankan method dari parent class
        System.out.println("Penulis: " + penulis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Genre: " + genre);
    }

    /**
     * Method khusus untuk membaca ringkasan buku
     */
    public void bacaRingkasan() {
        System.out.println("Membaca ringkasan buku " + getJudul() + " oleh " + penulis);
    }
}
