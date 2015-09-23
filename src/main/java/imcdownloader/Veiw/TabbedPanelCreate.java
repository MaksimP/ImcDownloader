package imcdownloader.Veiw;

import javax.swing.*;
import javax.swing.event.PopupMenuListener;

public class TabbedPanelCreate extends JTabbedPane{

    JPopupMenu popupMenu;
    JMenuItem menuItem;
    JScrollPane scrollPane;
    JTable tableCatalog;

    public TabbedPanelCreate() {

        setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        popupMenu = new JPopupMenu();
        menuItem = new JMenuItem("Close Tab");

        popupMenu.add(menuItem);

        this.setComponentPopupMenu(popupMenu);
    }

    public void addPopupListner(PopupMenuListener ae) {
        popupMenu.addPopupMenuListener(ae);
    }

    public JPopupMenu getPopupMenu() {
        return popupMenu;
    }
}
