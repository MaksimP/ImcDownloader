package imcdownloader.Veiw;

import javax.swing.*;
import java.awt.*;

public class CreateGUI extends JFrame{

    ToolBarCreate toolBar;
    TreePanelCreate scrollTreeCreate;

    public CreateGUI() {

        setSize(1080, 620);
        //main_frame.setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        //main_menu_bar = new JMenuBar();
        setJMenuBar(new MenuBarCreate());

        toolBar = new ToolBarCreate();

        add(toolBar, BorderLayout.NORTH);
        add(new TreePanelCreate(), BorderLayout.WEST);
       // add(new imcdownloader.Veiw.ViewPanelCreate());
        add(new LineStatusCreate(), BorderLayout.SOUTH);
        //add(new CreateSplitPane());


        setVisible(true);
    }
}
