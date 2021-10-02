package live;

import music.*;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Playable p ;
        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
