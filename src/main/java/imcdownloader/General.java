package imcdownloader;

import imcdownloader.Controller.ControllerAction;
import imcdownloader.Veiw.CreateGUI;

import javax.swing.*;

public class General {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            CreateGUI createGUI = new CreateGUI();
            ControllerAction controllerAction = new ControllerAction(createGUI);
            createGUI.setVisible(true);
            }
        );
    }
}
