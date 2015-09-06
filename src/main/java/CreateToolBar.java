import javax.swing.*;
import java.awt.*;

public class CreateToolBar extends JToolBar{

    JButton button_reload;
    JButton button_open;
    JButton button_find;
    JTextField textField_find;
    ToolsAction toolsAction;

    public CreateToolBar() {
        toolsAction = new ToolsAction();
        ImageIcon image_reload = new ImageIcon("src/main/resources/arrow_refresh.png");
        ImageIcon image_find = new ImageIcon("src/main/resources/find.png");
        ImageIcon image_open = new ImageIcon("src/main/resources/folder_table.png");

        textField_find = new JTextField("Поиск", 10);

        button_open = new JButton(image_open);
        button_open.setActionCommand("Open");
        button_open.setToolTipText("Открыть каталог");
        button_open.addActionListener(toolsAction);

        button_reload = new JButton(image_reload);
        button_reload.setActionCommand("Reload");
        button_reload.setToolTipText("Обновить каталог");
        button_reload.addActionListener(toolsAction);

        button_find = new JButton(image_find);
        button_find.setActionCommand("Find");
        button_find.setToolTipText("Найти");
        button_reload.addActionListener(toolsAction);

        add(button_open);
        add(button_reload);
        addSeparator(new Dimension(700, 20));
        add(textField_find);
        add(button_find);

        setFloatable(false);
    }
}
