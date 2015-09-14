package imcdownloader.Model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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

    static private String[] list_file = {
            "ic_import.xls",
            "ic_sovok.xls",
            "vt_import.xls",
            "vt_sovok.xls",
            "vd_import.xls",
            "vd_sovok.xls",
            "cap_smd.xls",
            "capacitor.xls",
            "resistor.xls",
            "res_smd.xls",
            "res_prec.xls",
            "res_power.xls",
            "res_f.xls",
            "res_pot.xls",
            "relay.xls",
            "qrystal.xls",
            "inductor.xls",
            "x_import.xls",
            "x_sovok.xls",
            "panelki.xls",
            "s_import.xls",
            "s_sovok.xls",
            "other.xls",
            "pribor.xls",
            "multimetr.xls",
            "hl.xls",
            "opto.xls",
            "korpus.xls",
            "krepezh.xls",
            "material.xls",
            "instrument.xls",
            "power.xls"
    };

    static private String[] list_file_names = {
            "микросхемы(имп)",
            "микросхемы(сов)",
            "транзисторы(имп)",
            "транзисторы(сов)",
            "диоды(имп)",
            "диоды(сов)",
            "конденсаторы smd",
            "конденсаторы",
            "резисторы",
            "резисторы smd",
            "резисторы прецизионные",
            "резисторы мощные",
            "резисторы нелинейные",
            "резисторы переменные",
            "реле",
            "резонаторы",
            "индуктивности",
            "разьемы имп",
            "разьемы сов",
            "панельки",
            "кнопки имп",
            "кнопки сов",
            "кнопки сов",
            "предохранители",
            "приборы(сов)",
            "измерительная техника",
            "индикаторы",
            "оптроны",
            "корпуса",
            "крепеж",
            "материалы",
            "инструменты",
            "источники питания",
    };

    static void ttt() {
        Set<Map.Entry<String, String>> set_list = list_files.entrySet();

    }

    static public String[] getList_file() {
        return list_file;
    }

    static public String getNameFile(int index_array) {
        return list_file[index_array];
    }
}


