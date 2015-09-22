package imcdownloader.Veiw;

import javax.swing.*;

public class TabbedPanelCreate extends JTabbedPane{

    JPopupMenu popupMenu;
    JMenuItem menuItem;

    public TabbedPanelCreate() {

        setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        popupMenu = new JPopupMenu();
        menuItem = new JMenuItem("Close«");

        popupMenu.add(menuItem);

        this.setComponentPopupMenu(popupMenu);
    }
}
