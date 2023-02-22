package src;

import java.util.List;

public class Kurs {
    String name;
    String  acıklama;
    int percent;
    List<Gun> gunler;
    public void ekle(Gun gun){
        gunler.add(gun);
    }

    public Kurs(String name, String acıklama, int percent, List<Gun> gunler) {
        this.name = name;
        this.acıklama = acıklama;
        this.percent = percent;
        this.gunler = gunler;
    }
}
