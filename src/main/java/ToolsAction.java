import javax.swing.*;
import java.awt.event.ActionEvent;


public class ToolsAction extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();

        switch (command) {
            case "Reload" :
                Thread thread_download = new Thread(new Download());
                thread_download.start();
                break;
                 /*if (!thread_download.isAlive()) {
                     System.out.println("end");
                     break;
                 }*/
            case "About" :
                System.out.println("dialog");
                JOptionPane.showMessageDialog(null, "<html>О программе<br>Программа написана</html>");

                break;
            case "Close" :
                System.exit(0);
                break;
        }
    }
}
