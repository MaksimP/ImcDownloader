package imcdownloader.Model;

import imcdownloader.Const;

import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;

public class CatalogMutableTreeNode extends DefaultMutableTreeNode {

    private String pathFile;
    private String nameFile;
    private String corePath = Const.getPathToCatalog();

    public CatalogMutableTreeNode() {

    }

    public CatalogMutableTreeNode(String nameFile) {
        this.nameFile = nameFile;
        pathFile =  corePath + nameFile;
    }

    public String getPathFile() {
        return pathFile;
    }

    public File getFile() {
        return new File(pathFile);
    }

    public String getNameFile() {
        return nameFile;
    }

    @Override
    public String toString() {
        return ListFiles.getNameFileForTree(nameFile);
    }
}
