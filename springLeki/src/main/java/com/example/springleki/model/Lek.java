package com.example.springleki.model;

import java.time.LocalDate;

public class Lek {


    private String nazwa_leku;
    private LocalDate data_waznosci;
    private int ilosc_opakowan_w_magazynie;


    public Lek(String nazwa_leku, LocalDate data_waznosci, int ilosc_opakowan_w_magazynie) {
        this.nazwa_leku = nazwa_leku;
        this.data_waznosci = data_waznosci;
        this.ilosc_opakowan_w_magazynie = ilosc_opakowan_w_magazynie;
    }

    public String getNazwa_leku() {
        return nazwa_leku;
    }

    public void setNazwa_leku(String nazwa_leku) {
        this.nazwa_leku = nazwa_leku;
    }

    public LocalDate getData_waznosci() {
        return data_waznosci;
    }

    public void setData_waznosci(LocalDate data_waznosci) {
        this.data_waznosci = data_waznosci;
    }

    public int getIlosc_opakowan_w_magazynie() {
        return ilosc_opakowan_w_magazynie;
    }

    public void setIlosc_opakowan_w_magazynie(int ilosc_opakowan_w_magazynie) {
        this.ilosc_opakowan_w_magazynie = ilosc_opakowan_w_magazynie;
    }
}
