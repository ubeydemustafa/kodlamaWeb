package src.educationalInstitution;

import java.util.List;

public class Odev {


    String text;
    List<Yorum> yorumlar;
    public void yorumEkle(Yorum yorum){
        yorumlar.add(yorum);
    }

    public Odev(String text) {
        this.text = text;
    }

}
