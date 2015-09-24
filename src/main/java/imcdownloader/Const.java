package imcdownloader;

import java.io.File;

public class Const {


    static String jarPath = General.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    static String dirPath = new File(jarPath).getPath();

    private static String pathToCatalog = dirPath + "\\Catalog\\";

    public static String getPathToCatalog() {
        return pathToCatalog;
    }
}
