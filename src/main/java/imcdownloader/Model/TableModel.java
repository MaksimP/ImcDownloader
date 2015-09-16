package imcdownloader.Model;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.swing.table.AbstractTableModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class TableModel extends AbstractTableModel {

    private InputStream in;
    private Workbook wr_book;
    private Sheet sheet;

    public TableModel(String name_file) throws IOException {
        in = new FileInputStream(name_file);
        wr_book = new HSSFWorkbook(in);
        sheet = wr_book.getSheetAt(0);
    }

    @Override
    public String getColumnName(int column) {
        return sheet.getRow(3).getCell(column).toString();
    }

    @Override
    public int getRowCount() {
        return sheet.getLastRowNum();
    }

    @Override
    public int getColumnCount() {
        return sheet.getRow(3).getLastCellNum();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return sheet.getRow(rowIndex).getCell(columnIndex);
    }
}
