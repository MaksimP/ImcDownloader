package imcdownloader.Model;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import javax.swing.table.AbstractTableModel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;


public class TableModel extends AbstractTableModel {

    private InputStream in;
    private Workbook wr_book;
    private Sheet sheet;
    private int row_count;
    private int column_count;

    public TableModel() {

    }

    public TableModel(String name_file) throws IOException {
        in = new FileInputStream(name_file);
        wr_book = new HSSFWorkbook(in);
        sheet = wr_book.getSheetAt(0);
        //sheet.get


    }



    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int count_rows = sheet.getLastRowNum();
        for (int i = 0; i < 10; i++) {
            Row row = sheet.getRow(i);
        }
        /*Iterator<Row> it_row = sheet.rowIterator();
        while (it_row.hasNext()) {
            it_row.next();
            it_row.next();
            row_count++;
            Row row = it_row.next();
            Iterator<Cell> it_cell = row.iterator();
            while (it_cell.hasNext()) {
                Cell cell = it_cell.next();
                column_count++;
            }
        }*/
        return null;
    }
}
