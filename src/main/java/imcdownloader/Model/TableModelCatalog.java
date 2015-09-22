package imcdownloader.Model;

import imcdownloader.Const;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.swing.table.AbstractTableModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class TableModelCatalog extends AbstractTableModel {

    private InputStream in;
    private Workbook wrBook;
    private Sheet sheet;

    public TableModelCatalog(String nameFile) throws IOException {
        in = new FileInputStream(Const.getPathToCatalog() + nameFile);
        wrBook = new HSSFWorkbook(in);
        sheet = wrBook.getSheetAt(0);
    }

    @Override
    public String getColumnName(int column) {
        return sheet.getRow(2).getCell(column).toString();
    }

    @Override
    public int getRowCount() {
        return sheet.getLastRowNum();
    }

    @Override
    public int getColumnCount() {
        return sheet.getRow(2).getLastCellNum();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return sheet.getRow(rowIndex + 3).getCell(columnIndex);
    }
}
