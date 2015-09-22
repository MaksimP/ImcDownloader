package imcdownloader.Veiw;

import imcdownloader.Model.CatalogList;
import imcdownloader.Model.CatalogMutableTreeNode;
import imcdownloader.Model.ListFiles;

import javax.swing.*;
import java.awt.*;

public class ListPanelCreate extends JScrollPane{

    JList listCatalog;
    DefaultListModel listModel;

    public ListPanelCreate() {

        setPreferredSize(new Dimension(150, 500));
        listCatalog = new JList();
        listCatalog.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        listModel = new DefaultListModel();

        setBackground(Color.green);

        for (int i = 0; i < ListFiles.getLength() - 1; i++) {
            listModel.addElement("ttt");
            System.out.println(listModel.getSize());
        }

        listCatalog.setModel(listModel);
    }

    public JList getListCatalog() {
        return listCatalog;
    }
}
