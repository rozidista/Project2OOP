package org.example;

public class MobilAmbulance extends Mobil {
    private String hospital;

    public MobilAmbulance(String hospital, String merk, int tahun, String mekanik) {
        super(merk, tahun, mekanik);
        this.hospital = hospital;
    }

    @Override
    public void klakson() {
        this.print("Ninu Ninu");
    }

    public Boolean isFine() {
        return false;
    }
}
