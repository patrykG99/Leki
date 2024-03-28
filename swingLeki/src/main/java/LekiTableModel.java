import model.Lek;

import javax.swing.table.AbstractTableModel;

import java.util.ArrayList;
import java.util.List;

public class LekiTableModel extends AbstractTableModel {


    private List<Lek> lekList = new ArrayList<>();
    private final static String KOLUMNA_NAZWA_LEKU = "Nazwa leku";
    private final static String KOLUMNA_DATA_WAZNOSCI = "Data waznosci";
    private final static String KOLUMNA_ILOSC = "Ilosc";
    private final String kol[] = {
            KOLUMNA_NAZWA_LEKU,
            KOLUMNA_DATA_WAZNOSCI,
            KOLUMNA_ILOSC

    };

    public LekiTableModel(List<Lek> lekList) {
        this.lekList = lekList;
    }

    @Override
    public int getRowCount() {
        System.out.println(lekList.size());
        return lekList.size();

    }

    @Override
    public int getColumnCount() {
        System.out.println(kol.length);
        return kol.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return kol[columnIndex];
    }

    @Override
    public Object getValueAt(int x, int y) {
        Lek lek = lekList.get(x);
        String kolumna = kol[y];
        if (lek != null) {
            switch (kolumna) {
                case KOLUMNA_NAZWA_LEKU:
                    return lek.getNazwa_leku();
                case KOLUMNA_DATA_WAZNOSCI:
                    return lek.getData_waznosci();
                case KOLUMNA_ILOSC:
                    return lek.getIlosc_opakowan_w_magazynie();
                default:
                    return null;

            }
        } else
            return null;

    }
}
