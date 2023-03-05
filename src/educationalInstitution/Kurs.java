package src.educationalInstitution;

import java.util.List;

public class Kurs {
    String name;
    String  acıklama;
    int price;
    List<Gun> gunler;
    public void ekle(Gun gun){
        gunler.add(gun);
    }

    public Kurs(String name, String acıklama, int price, List<Gun> gunler) {
        this.name = name;
        this.acıklama = acıklama;
        this.price = price;
        this.gunler = gunler;
    }
}
