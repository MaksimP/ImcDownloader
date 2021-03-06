package imcdownloader.Controller;

import imcdownloader.Const;
import imcdownloader.Download;
import imcdownloader.Model.ListFiles;
import imcdownloader.Model.TableModelCatalog;
import imcdownloader.Veiw.CreateGUI;

import javax.swing.*;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ControllerAction extends AbstractAction implements MouseListener, PopupMenuListener {

    private CreateGUI createGUI;
    private int label;

    public ControllerAction(CreateGUI createGUI) {
        this.createGUI = createGUI;
        createGUI.getMenuBarCreate().addAction(this);
        createGUI.getToolBar().addAction(this);
        createGUI.getTreePanelCreate().addActionMouse(this);
        createGUI.getTabbedPanelCreate().addPopupListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();

        switch (command) {
            case "Reload" :
                Thread thread_download;
                createGUI.getLineStatusCreate().getStatusLine().setText(" Идет обновление каталогов");
                thread_download = new Thread(new Download());
                thread_download.start();
                //createGUI.getLineStatusCreate().getStatusLine().setText(" Каталоги обновлены");
                break;
            case "Find" :
                String stringFind = createGUI.getToolBar().getTextFieldFind().getText();
                JScrollPane scrollBuffer = (JScrollPane)createGUI.getTabbedPanelCreate().getSelectedComponent();
                JTable tableTab = (JTable)scrollBuffer.getViewport().getView();

                int i;
                start:
                for (i = label; i < tableTab.getRowCount(); i++) {
                    for (int j = 0; j < tableTab.getColumnCount(); j++) {
                        try {
                            if (tableTab.getValueAt(i, j).toString().indexOf(stringFind) != -1 ||
                                    tableTab.getValueAt(i, j).toString().indexOf(stringFind.toUpperCase()) != -1) {
                                tableTab.setRowSelectionInterval(i, i);
                                scrollBuffer.getVerticalScrollBar().setValue(tableTab.getCellRect(i, 1, true).y);
                                createGUI.getLineStatusCreate().getStatusLine().setText(" Строка " + i);
                                label = ++i;
                                break start;
                            } else {
                                label = 0;
                            }
                        } catch (NullPointerException e) {
                            createGUI.getLineStatusCreate().getStatusLine().setText(" В данном каталоге не найдено. Переключите вкладку на нужный каталог.");
                        }
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

        int column = 0;
        if (SwingUtilities.isRightMouseButton(e)) {
            if (e.getSource() instanceof JTable) {
                JTable table = (JTable) e.getSource();
                if (column == table.columnAtPoint(e.getPoint())) {
                    table.setRowSelectionInterval(table.rowAtPoint(e.getPoint()), table.rowAtPoint(e.getPoint()));
                    JPopupMenu popupMenu = new JPopupMenu();
                    JMenuItem item = new JMenuItem("Find datasheet");
                    popupMenu.add(item);
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    item.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            try {
                                Runtime.getRuntime().exec("C:/Program Files/Google/Chrome/Application/chrome.exe google.ru#newwindow=1&q=" +
                                        table.getValueAt(table.rowAtPoint(e.getPoint()), 0));

                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        }
                    });
                }
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
        TreePath sellPath = createGUI.getTreePanelCreate().getTreeFiles().getPathForLocation(e.getX(), e.getY());
        if (e.getClickCount() == 2) {
            String nameNode = sellPath.toString();
            String nameFile = nameNode.substring(nameNode.lastIndexOf(',') + 2, nameNode.length() - 1);
            try {
                JTable tableCatalog = new JTable(new TableModelCatalog(nameFile));
                tableCatalog.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                tableCatalog.addMouseListener(this);

                createGUI.getTabbedPanelCreate().addTab(nameFile, new JScrollPane(tableCatalog));
                createGUI.getTabbedPanelCreate().setSelectedIndex(createGUI.getTabbedPanelCreate().indexOfTab(nameFile));
                //System.out.println(createGUI.getTabbedPanelCreate().getComponentAt(createGUI.getTabbedPanelCreate().indexOfTab(nameFile)).get);
                createGUI.getLineStatusCreate().getStatusLine().setText("");
            } catch (FileNotFoundException ee) {
                createGUI.getLineStatusCreate().getStatusLine().setText(" Не удается найти каталог. Обновите данные");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
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
