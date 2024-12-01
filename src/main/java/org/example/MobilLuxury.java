package org.example;

public class MobilLuxury extends Mobil {
    private int harga;

    public MobilLuxury(String merk, int tahun, String mekanik) {
        super(merk, tahun, mekanik);
    }

    public MobilLuxury(String merk, int tahun, int harga, String  mekanik) {
        super(merk, tahun, mekanik);
        this.harga = harga;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
