package imcdownloader.Veiw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ToolBarCreate extends JToolBar{

    JButton buttonReload;
    JButton buttonOpen;
    JButton buttonFind;
    JTextField textFieldFind;

    public ToolBarCreate() {
        ImageIcon imageReload = new ImageIcon(ToolBarCreate.class.getResource("/arrow_refresh.png"));
        ImageIcon imageFind = new ImageIcon(ToolBarCreate.class.getResource("/find.png"));
        ImageIcon imageOpen = new ImageIcon(ToolBarCreate.class.getResource("/folder_table.png"));

        textFieldFind = new JTextField(10);

        buttonOpen = new JButton(imageOpen);
        buttonOpen.setActionCommand("Open");
        buttonOpen.setToolTipText("Открыть каталог");

        buttonReload = new JButton(imageReload);
        buttonReload.setActionCommand("Reload");
        buttonReload.setToolTipText("Обновить каталог");

        buttonFind = new JButton(imageFind);
        buttonFind.setActionCommand("Find");
        buttonFind.setToolTipText("Найти");

       // add(buttonOpen);
        add(buttonReload);
        addSeparator(new Dimension(700, 20));
        add(textFieldFind);
        add(buttonFind);

        setFloatable(false);
    }

    public void addAction(ActionListener ae) {
        buttonOpen.addActionListener(ae);
        buttonFind.addActionListener(ae);
        buttonReload.addActionListener(ae);
    }

    public JButton getButtonReload() {
        return buttonReload;
    }

    public JButton getButtonOpen() {
        return buttonOpen;
    }

    public JButton getButtonFind() {
        return buttonFind;
    }

    public JTextField getTextFieldFind() {
        return textFieldFind;
    }
}
