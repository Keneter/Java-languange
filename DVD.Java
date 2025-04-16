
package tugas.pkg1_muh.alif.faturahman_13020230039;



public class DVD extends Item {
    private int durasi;
    private String sutradara;
    private String rating;

    
    public DVD(String id, String judul, int tahunTerbit, 
              int durasi, String sutradara, String rating) {
        super(id, judul, tahunTerbit);
        this.durasi = durasi;
        this.sutradara = sutradara;
        this.rating = rating;
    }


    public int getDurasi() { return durasi; }
    public String getSutradara() { return sutradara; }
    public String getRating() { return rating; }

    @Override
    public void displayInfo() {
    super.displayInfo(); //*memanggil dan menjalankan method dari parent class
        System.out.println("Durasi: " + durasi + " menit");
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Rating: " + rating);
    }

  
    public void putar() {
        System.out.println("Memutar DVD " + getJudul() + " dengan durasi " + durasi + " menit");
    }
}
