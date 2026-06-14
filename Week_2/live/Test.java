package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
        Playable p = veena;
        Playable q = saxophone;
        p.play();
        q.play();

    }
}
