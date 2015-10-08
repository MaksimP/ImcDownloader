package imcdownloader;

import imcdownloader.Controller.ControllerAction;
import imcdownloader.Veiw.CreateGUI;

import javax.swing.*;
import java.io.File;

public class General {
    public static void main(String[] args) {

        File dirCatalog = new File(Const.getPathToCatalog());
        if (!dirCatalog.exists()) {
            dirCatalog.mkdirs();
        }

        SwingUtilities.invokeLater(() -> {
            CreateGUI createGUI = new CreateGUI();
            ControllerAction controllerAction = new ControllerAction(createGUI);
            createGUI.setVisible(true);
            }
        );
    }
}
