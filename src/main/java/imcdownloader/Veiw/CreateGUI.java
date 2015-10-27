package imcdownloader.Veiw;

import javax.swing.*;
import java.awt.*;

public class CreateGUI extends JFrame{

    private ToolBarCreate toolBar;
    private TreePanelCreate treePanelCreate;
    private MenuBarCreate menuBarCreate;
    private TabbedPanelCreate tabbedPanelCreate;
    private LineStatusCreate lineStatusCreate;
    private JSplitPane splitPane;

    public CreateGUI() {

        setSize(1100, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //setResizable(false);
        setLocationRelativeTo(null);

        menuBarCreate = new MenuBarCreate();
        setJMenuBar(menuBarCreate);

        toolBar = new ToolBarCreate();
        add(toolBar, BorderLayout.NORTH);

        treePanelCreate = new TreePanelCreate();
        //add(treePanelCreate, BorderLayout.WEST);

        tabbedPanelCreate = new TabbedPanelCreate();
        //add(tabbedPanelCreate, BorderLayout.CENTER);

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, treePanelCreate, tabbedPanelCreate);
        //splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(220);
        splitPane.setDividerSize(2);
        add(splitPane);

        lineStatusCreate = new LineStatusCreate();
        add(lineStatusCreate, BorderLayout.SOUTH);

        //pack();
        //setVisible(true);
    }

    public LineStatusCreate getLineStatusCreate() {
        return lineStatusCreate;
    }

    public ToolBarCreate getToolBar() {
        return toolBar;
    }

    public TreePanelCreate getTreePanelCreate() {
        return treePanelCreate;
    }

    public MenuBarCreate getMenuBarCreate() {
        return menuBarCreate;
    }

    public TabbedPanelCreate getTabbedPanelCreate() {
        return tabbedPanelCreate;
    }
}
