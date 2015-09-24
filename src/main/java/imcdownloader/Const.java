package imcdownloader;

import java.io.File;

public class Const {

    private static String jarPath = Const.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    private static String dirPath = new File(jarPath).getParent();

    private static String pathToCatalog = dirPath + "\\Catalog\\";

    public static String getPathToCatalog() {
        return pathToCatalog;
    }

}
