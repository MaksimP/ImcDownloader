import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateMenuBar extends JMenuBar {

    JMenu menu_file;
    JMenu menu_options;
    JMenu menu_help;

    JMenuItem menuItem_close;
    JMenuItem menuItem_reload;
    JMenuItem menuItem_about;
    ToolsAction toolsAction;

    public CreateMenuBar() {
        toolsAction = new ToolsAction();
        menu_file = new JMenu("Файл");
        menu_options = new JMenu("Опции");
        menu_help = new JMenu("Помощь");

        menuItem_close = new JMenuItem("Закрыть");
        menuItem_close.setActionCommand("Close");
        menuItem_close.addActionListener(toolsAction);

        menuItem_reload = new JMenuItem("Обновить каталог");
        menuItem_reload.setActionCommand("Reload");
        menuItem_reload.addActionListener(toolsAction);

        menuItem_about = new JMenuItem("О программе");
        menuItem_about.setActionCommand("About");
        menuItem_about.addActionListener(toolsAction);

        menu_file.add(menuItem_close);
        menu_options.add(menuItem_reload);
        menu_help.add(menuItem_about);

        //add menu to the menubar
        add(menu_file);
        add(menu_options);
        add(menu_help);
    }


}
