
package tugas.pkg1_muh.alif.faturahman_13020230039;
public class Item {

    private String id;
    private String judul;
    private int tahunTerbit;
    private boolean statusTersedia;

    /**
     * Constructor untuk inisialisasi objek Item
     * @param id ID unik item
     * @param judul Judul item
     * @param tahunTerbit Tahun terbit item
     */
    public Item(String id, String judul, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.statusTersedia = true;
    }

    // Getter methods
    public String getId() { return id; }
    public String getJudul() { return judul; }
    public int getTahunTerbit() { return tahunTerbit; }
    public boolean isStatusTersedia() { return statusTersedia; }

    /**
     * Method untuk meminjam item
     */
    public void pinjam() {
        statusTersedia = false;
        System.out.println("Item " + judul + " dipinjam");
    }

    /**
     * Method untuk mengembalikan item
     */
    public void kembalikan() {
        statusTersedia = true;
        System.out.println("Item " + judul + " dikembalikan");
    }

    /**
     * Method untuk menampilkan informasi dasar item
     */
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status Tersedia: " + (statusTersedia ? "Tersedia" : "Dipinjam"));
    }
}

