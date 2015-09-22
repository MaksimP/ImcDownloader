package imcdownloader.Model;

import java.util.HashMap;
import java.util.Set;

public class ListFiles {

    static private HashMap<String, String> list_files = new HashMap<>();

    static {
        list_files.put("ic_import.xls", "микросхемы(имп)");
        list_files.put("ic_sovok.xls", "микросхемы(сов)");
        list_files.put("vt_import.xls", "транзисторы(имп)");
        list_files.put("vt_sovok.xls", "транзисторы(сов)");
        list_files.put("vd_import.xls", "диоды(имп)");
        list_files.put("vd_sovok.xls", "диоды(сов)");
        list_files.put("cap_smd.xls", "конденсаторы smd");
        list_files.put("capacitor.xls", "конденсаторы");
        list_files.put("resistor.xls", "резисторы");
        list_files.put("res_smd.xls", "резисторы smd");
        list_files.put("res_prec.xls", "резисторы прецизионные");
        list_files.put("res_power.xls", "резисторы мощные");
        list_files.put("res_f.xls", "резисторы нелинейные");
        list_files.put("res_pot.xls", "резисторы переменные");
        list_files.put("relay.xls", "реле");
        list_files.put("qrystal.xls", "резонаторы");
        list_files.put("inductor.xls", "индуктивности");
        list_files.put("x_import.xls", "разьемы имп");
        list_files.put("x_sovok.xls", "разьемы сов");
        list_files.put("panelki.xls", "панельки");
        list_files.put("s_import.xls", "кнопки имп");
        list_files.put("s_sovok.xls", "кнопки сов");
        list_files.put("s_sovok.xls", "кнопки сов");
        list_files.put("other.xls", "предохранители");
        list_files.put("pribor.xls", "приборы(сов)");
        list_files.put("multimetr.xls", "измерительная техника");
        list_files.put("hl.xls", "индикаторы");
        list_files.put("opto.xls", "оптроны");
        list_files.put("korpus.xls", "корпуса");
        list_files.put("krepezh.xls", "крепеж");
        list_files.put("material.xls", "материалы");
        list_files.put("instrument.xls", "инструменты");
        list_files.put("power.xls", "источники питания");
    }

    static public String getNameFile(int index) {
        Set<String> entrySet = list_files.keySet();
        return (String) entrySet.toArray()[index];
    }

    static public String getNameFileForTree(int index) {
        return list_files.get(getNameFile(index));
    }

    static public String getNameFileForTree(String key) {
        return list_files.get(key);
    }

    static public int getLength() {
        return list_files.size();
    }
}

