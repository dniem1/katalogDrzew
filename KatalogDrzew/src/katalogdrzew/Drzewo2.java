package katalogdrzew;

import java.io.Serializable;

public class Drzewo2 extends Drzewo implements Serializable {

    private int Obwod_pnia;

    public Drzewo2(int id, String Rodzaj, String Nazwa, int Obwod_pnia) {
        super(id, Rodzaj, Nazwa);
        this.Obwod_pnia = Obwod_pnia;
    }

    public int getObwod_pnia() {
        return Obwod_pnia;
    }

    public void setObwod_pnia(int Obwod_pnia) {
        this.Obwod_pnia = Obwod_pnia;
    }

    public Drzewo2() {
    }

}
