package imcdownloader.Veiw;

import imcdownloader.Const;
import imcdownloader.Model.ListFiles;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.File;

public class TreePanelCreate extends JScrollPane {

    private JTree treeFiles;
    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;

    public TreePanelCreate() {

        root = new DefaultMutableTreeNode(Const.getPathToCatalog());
        treeModel = new DefaultTreeModel(root);



        for (int i = 0; i < ListFiles.getLength(); i++) {
            root.add(new DefaultMutableTreeNode(new File(ListFiles.getNameFileForTree(i))));
        }

        treeFiles = new JTree(treeModel);
        treeFiles.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        treeFiles.setMaximumSize(new Dimension(50, 500));

        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setViewportView(treeFiles);
    }

    public void addActionMouse(MouseListener ae) {
        treeFiles.addMouseListener(ae);
    }

    public JTree getTreeFiles() {
        return treeFiles;
    }

    public DefaultMutableTreeNode getRoot() {
        return root;
    }
}
