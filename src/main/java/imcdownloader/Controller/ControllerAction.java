package imcdownloader.Controller;

import imcdownloader.Download;
import imcdownloader.Model.ListFiles;
import imcdownloader.Model.TableModelCatalog;
import imcdownloader.Veiw.CreateGUI;

import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ControllerAction extends AbstractAction implements MouseListener, PopupMenuListener {

    CreateGUI createGUI;

    public ControllerAction() {

    }

    public ControllerAction(CreateGUI createGUI) {
        this.createGUI = createGUI;
        createGUI.getMenuBarCreate().addAction(this);
        createGUI.getToolBar().addAction(this);
        createGUI.getTreePanelCreate().addActionMouse(this);
        createGUI.getTabbedPanelCreate().addPopupListner(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();

        switch (command) {
            case "Reload" :
                Thread thread_download;
                createGUI.getLineStatusCreate().getStutusLine().setText(" Идет обновление каталогов");
                for (int i = 0; i < ListFiles.getLength() - 1; i++) {
                    thread_download = new Thread(new Download(ListFiles.getNameFile(i)));
                    thread_download.start();
                }
                createGUI.getLineStatusCreate().getStutusLine().setText(" Каталоги обновлены");
                break;
            case "Find" :
                boolean flag = false;
                String stringFind = createGUI.getToolBar().getTextFieldFind().getText();
                JScrollPane scrollBuffer = (JScrollPane)createGUI.getTabbedPanelCreate().getSelectedComponent();
                JTable tableTab = (JTable)scrollBuffer.getViewport().getView();
                /*TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tableTab.getModel());
                tableTab.setRowSorter(rowSorter);
                if (stringFind.length() != 0) {
                    rowSorter.setRowFilter(RowFilter.regexFilter(stringFind));
                }*/

                for (int i = 0; i < tableTab.getRowCount(); i++) {
                    if (stringFind.equalsIgnoreCase(tableTab.getValueAt(i, 0).toString().trim())) {
                        tableTab.scrollRectToVisible(tableTab.getCellRect(1, 1, true));
                        tableTab.setRowSelectionInterval(i, i);
                        //tableTab.requestFocus();
                        flag = true;
                        break;
                    }
                    if (!flag) {
                        createGUI.getLineStatusCreate().getStutusLine().setText(" В данном каталоге не найдено. Переключите вкладку на нужный каталог.");
                    }
                }

                break;
            case "About" :
                JOptionPane.showMessageDialog(null, "<html>О программе<br>" +
                        "ImcDownloader для скачивания и просмотра каталога элементов<br>" +
                        "с сайта магазина ООО НПП \"ИНТЕГРАЛЬНЫЕ МИКРОСИСТЕМЫ\"<br>" +
                        "http://www.ims-kharkov.narod.ru/<br>" +
                        "Все пожелания о программе писать на<br>" +
                        "maksimp86@mail.ru</html>");
                break;
            case "Close" :
                System.exit(0);
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        TreePath sellPath = createGUI.getTreePanelCreate().getTreeFiles().getPathForLocation(e.getX(), e.getY());
        if (e.getClickCount() == 2) {
            String nameNode = sellPath.toString();
            String nameFile = nameNode.substring(nameNode.indexOf(' ') + 1, nameNode.length() - 1);
            try {
                JTable tableCatalog = new JTable(new TableModelCatalog(nameFile));
                tableCatalog.setColumnSelectionAllowed(false);
                createGUI.getTabbedPanelCreate().addTab(nameFile, new JScrollPane(tableCatalog));
                //createGUI.getTabbedPanelCreate().
            } catch (FileNotFoundException ee) {
                createGUI.getLineStatusCreate().getStutusLine().setText(" Не удается найти каталог. Обновите данные");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        int index = createGUI.getTabbedPanelCreate().getSelectedIndex();
        createGUI.getTabbedPanelCreate().remove(index);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent e) {

    }


    @Override
    public void popupMenuCanceled(PopupMenuEvent e) {

    }
}
