package imcdownloader.Veiw;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuBarCreate extends JMenuBar {

    JMenu menu_file;
    JMenu menu_options;
    JMenu menu_help;

    JMenuItem menuItem_close;
    JMenuItem menuItem_reload;
    JMenuItem menuItem_about;

    public MenuBarCreate() {

        menu_file = new JMenu("Файл");
        menu_options = new JMenu("Опции");
        menu_help = new JMenu("Помощь");

        menuItem_close = new JMenuItem("Закрыть");
        menuItem_close.setActionCommand("Close");

        menuItem_reload = new JMenuItem("Обновить каталог");
        menuItem_reload.setActionCommand("Reload");

        menuItem_about = new JMenuItem("О программе");
        menuItem_about.setActionCommand("About");

        menu_file.add(menuItem_close);
        menu_options.add(menuItem_reload);
        menu_help.add(menuItem_about);

        //add menu to the menubar
        add(menu_file);
        add(menu_options);
        add(menu_help);
    }

    public void addAction(ActionListener ae) {
        menuItem_reload.addActionListener(ae);
        menuItem_about.addActionListener(ae);
        menuItem_close.addActionListener(ae);
    }

    public JMenu getMenu_file() {
        return menu_file;
    }

    public JMenu getMenu_options() {
        return menu_options;
    }

    public JMenu getMenu_help() {
        return menu_help;
    }

    public JMenuItem getMenuItem_close() {
        return menuItem_close;
    }

    public JMenuItem getMenuItem_reload() {
        return menuItem_reload;
    }

    public JMenuItem getMenuItem_about() {
        return menuItem_about;
    }
}
