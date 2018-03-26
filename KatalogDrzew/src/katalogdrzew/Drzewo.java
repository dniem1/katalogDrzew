/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalogdrzew;

import java.io.Serializable;

/**
 *
 * @author Darek
 */
public class Drzewo implements Serializable {

    private int id;
    private String Rodzaj;
    private String Nazwa;

    public Drzewo() {
    }

    public Drzewo(int id, String Rodzaj, String Nazwa) {
        this.id = id;
        this.Rodzaj = Rodzaj;
        this.Nazwa = Nazwa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRodzaj() {
        return Rodzaj;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setRodzaj(String Rodzaj) {
        this.Rodzaj = Rodzaj;
    }

    public void setNazwa(String Nazwa) {
        this.Nazwa = Nazwa;
    }
}
