package recyclerview.models;
public class Mobil {
    public String gambar;
    public String merek;
    public String produksi;

    public Mobil(String gambar, String merek, String produksi) {
        this.gambar = gambar;
        this.merek = merek;
        this.produksi = produksi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getProduksi() {
        return produksi;
    }

    public void setProduksi(String produksi) {
        this.produksi = produksi;
    }
}