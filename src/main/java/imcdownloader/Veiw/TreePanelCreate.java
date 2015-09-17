package imcdownloader.Veiw;

import imcdownloader.Model.ListFiles;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreePanelCreate extends JScrollPane {

    JTree tree_files;
    JPopupMenu tree_popup_menu;
    JMenuItem menuItem_open;

    public TreePanelCreate() {

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Список каталогов");


        for (int i = 0; i < ListFiles.getList_file().length - 1; i++) {
            root.add(new DefaultMutableTreeNode(ListFiles.getNameFile(i)));

        }

        tree_files = new JTree(root);
        tree_popup_menu = new JPopupMenu();
        menuItem_open = new JMenuItem("Открыть");

        tree_popup_menu.add(menuItem_open);
        setComponentPopupMenu(tree_popup_menu);

        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setViewportView(tree_files);
    }

    public JTree getTree_files() {
        return tree_files;
    }

    public JPopupMenu getTree_popup_menu() {
        return tree_popup_menu;
    }

    public JMenuItem getMenuItem_open() {
        return menuItem_open;
    }
}
