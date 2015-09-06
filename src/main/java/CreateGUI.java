import javax.swing.*;
import java.awt.*;

public class CreateGUI extends JFrame{

    CreateToolBar toolBar;

    public CreateGUI() {

        setSize(1080, 620);
        //main_frame.setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //main_menu_bar = new JMenuBar();
        setJMenuBar(new CreateMenuBar());

        toolBar = new CreateToolBar();

        add(toolBar, BorderLayout.NORTH);
        add(new CreateScrollTree(), BorderLayout.WEST);
        //add(new CreateSplitPane());

        setVisible(true);


    }
}
