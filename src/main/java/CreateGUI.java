import javax.swing.*;
import java.awt.*;

public class CreateGUI extends JFrame{

    ToolBarCreate toolBar;
    ScrollTreePanelCreate scrollTreeCreate;

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
        add(new ScrollTreePanelCreate(), BorderLayout.WEST);
       // add(new ViewPanelCreate());
        add(new LineStatusCreate(), BorderLayout.SOUTH);
        //add(new CreateSplitPane());

        setVisible(true);
    }
}
