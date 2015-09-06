import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class CreateScrollTree extends JScrollPane {

    JTree tree_files;

    public CreateScrollTree() {

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Список каталогов");

        for (int i = 0; i < ListFiles.getList_file().length - 1; i++) {
            root.add(new DefaultMutableTreeNode(ListFiles.getNameFile(i)));
        }

        tree_files = new JTree(root);
        setViewportView(tree_files);
    }
}
