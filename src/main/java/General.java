import javax.swing.*;

public class General {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateGUI();
            }
        });
    }
}
