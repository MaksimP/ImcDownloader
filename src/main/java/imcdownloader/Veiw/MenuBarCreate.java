package imcdownloader.Veiw;

import imcdownloader.Controller.ControllerAction;

import javax.swing.*;

public class MenuBarCreate extends JMenuBar {

    JMenu menu_file;
    JMenu menu_options;
    JMenu menu_help;

    JMenuItem menuItem_close;
    JMenuItem menuItem_reload;
    JMenuItem menuItem_about;
    ControllerAction controllerAction;

    public MenuBarCreate() {
        controllerAction = new ControllerAction();
        menu_file = new JMenu("Файл");
        menu_options = new JMenu("Опции");
        menu_help = new JMenu("Помощь");

        menuItem_close = new JMenuItem("Закрыть");
        menuItem_close.setActionCommand("Close");
        menuItem_close.addActionListener(controllerAction);

        menuItem_reload = new JMenuItem("Обновить каталог");
        menuItem_reload.setActionCommand("Reload");
        menuItem_reload.addActionListener(controllerAction);

        menuItem_about = new JMenuItem("О программе");
        menuItem_about.setActionCommand("About");
        menuItem_about.addActionListener(controllerAction);

        menu_file.add(menuItem_close);
        menu_options.add(menuItem_reload);
        menu_help.add(menuItem_about);

        //add menu to the menubar
        add(menu_file);
        add(menu_options);
        add(menu_help);
    }
}
