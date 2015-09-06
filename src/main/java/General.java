import javax.swing.*;

public class General {
    public static void main(String[] args) {
        /*Thread thread = new Thread(new Download());
        thread.start();*/

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateGUI();
            }
        });
    }
}
