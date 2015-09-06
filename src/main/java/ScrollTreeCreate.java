import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ScrollTreeCreate extends JScrollPane {

    JTree tree_files;

    public ScrollTreeCreate() {

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Список каталогов");

        for (int i = 0; i < ListFiles.getList_file().length - 1; i++) {
            root.add(new DefaultMutableTreeNode(ListFiles.getNameFile(i)));
        }

        tree_files = new JTree(root);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setViewportView(tree_files);
    }
}
