package src;

import java.util.List;

public class Odev {
    String name;
    String text;
    List<Yorum> yorumlar;
    public void ekle(Yorum yorum){
        yorumlar.add(yorum);
    }

}
