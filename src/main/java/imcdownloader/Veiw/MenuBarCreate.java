package imcdownloader.Veiw;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuBarCreate extends JMenuBar {

    private JMenu menuFile;
    private JMenu menuOptions;
    private JMenu menuHelp;

    private JMenuItem menuItemClose;
    private JMenuItem menuItemReload;
    private JMenuItem menuItemAbout;

    public MenuBarCreate() {

        menuFile = new JMenu("Файл");
        menuOptions = new JMenu("Опции");
        menuHelp = new JMenu("Помощь");

        menuItemClose = new JMenuItem("Закрыть");
        menuItemClose.setActionCommand("Close");

        menuItemReload = new JMenuItem("Обновить каталог");
        menuItemReload.setActionCommand("Reload");

        menuItemAbout = new JMenuItem("О программе");
        menuItemAbout.setActionCommand("About");

        menuFile.add(menuItemClose);
        menuOptions.add(menuItemReload);
        menuHelp.add(menuItemAbout);

        //add menu to the menubar
        add(menuFile);
        add(menuOptions);
        add(menuHelp);
    }

    public void addAction(ActionListener ae) {
        menuItemReload.addActionListener(ae);
        menuItemAbout.addActionListener(ae);
        menuItemClose.addActionListener(ae);
    }

    public JMenu getMenuFile() {
        return menuFile;
    }

    public JMenu getMenuOptions() {
        return menuOptions;
    }

    public JMenu getMenuHelp() {
        return menuHelp;
    }

    public JMenuItem getMenuItemClose() {
        return menuItemClose;
    }

    public JMenuItem getMenuItemReload() {
        return menuItemReload;
    }

    public JMenuItem getMenuItemAbout() {
        return menuItemAbout;
    }
}
