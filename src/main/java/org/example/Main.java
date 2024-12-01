package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Mobil toyota = new Mobil("Toyota", 2012, "Deni");
        Mobil honda = new Mobil("Honda", 2011, "Supri");
        MobilSport subaru = new MobilSport("Subaru", 2015, "Lena");
        subaru.setTopSpeed(180);
        MobilLuxury lexus = new MobilLuxury("Lexus", 2021, "Ryan");
        lexus.setHarga(5000000);
        String toyotaMerk = toyota.getMerk();
        String toyotaMekanik = toyota.getMekanik();
        String hondaMekanik = honda.getMekanik();
        String subaruMekanik = subaru.getMekanik();
        String lexusMekanik = lexus.getMekanik();
        MobilAmbulance ambulance = new MobilAmbulance("RS Siloam","Mitsubishi",2015,"Jefri");
        isFineVehicle(toyota);
        isFineVehicle(honda);
        isFineVehicle(subaru);
        isFineVehicle(lexus);
        isFineVehicle(ambulance);
    }

    private static void isFineVehicle(Bengkel bengkel) {
        Boolean isFine = bengkel.isFine();
        System.out.println("Apakah kendaraan dalam keadaan aman untuk digunakan? " + isFine);
    }
}