package model;


public class Lek {
    private String nazwa_leku;
    private String data_waznosci;
    private int ilosc_opakowan_w_magazynie;


    public Lek(String nazwa_leku, String data_waznosci, int ilosc_opakowan_w_magazynie) {
        this.nazwa_leku = nazwa_leku;
        this.data_waznosci = data_waznosci;
        this.ilosc_opakowan_w_magazynie = ilosc_opakowan_w_magazynie;
    }

    public Lek() {
    }

    public String getNazwa_leku() {
        return nazwa_leku;
    }

    public void setNazwa_leku(String nazwa_leku) {
        this.nazwa_leku = nazwa_leku;
    }

    public String getData_waznosci() {
        return data_waznosci;
    }

    public void setData_waznosci(String data_waznosci) {
        this.data_waznosci = data_waznosci;
    }

    public int getIlosc_opakowan_w_magazynie() {
        return ilosc_opakowan_w_magazynie;
    }

    public void setIlosc_opakowan_w_magazynie(int ilosc_opakowan_w_magazynie) {
        this.ilosc_opakowan_w_magazynie = ilosc_opakowan_w_magazynie;
    }
}
