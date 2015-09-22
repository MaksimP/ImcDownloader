package imcdownloader;

import imcdownloader.Controller.ControllerAction;
import imcdownloader.Controller.MainController;
import imcdownloader.Veiw.CreateGUI;

import javax.swing.*;

public class General {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateGUI createGUI = new CreateGUI();
                ControllerAction controllerAction = new ControllerAction(createGUI);
                createGUI.setVisible(true);
                //createGUI.setVisible(true);
                //new imcdownloader.Veiw.CreateGUI();
            }
        });
        // SwingUtilities.invokeLater(() -> new ControllerAction());
    }
}
