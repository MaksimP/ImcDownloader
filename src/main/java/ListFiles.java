public class ListFiles {

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

    static public String[] getList_file() {
        return list_file;
    }

    static public String getNameFile(int index_array) {
        return list_file[index_array];
    }
}


