package imcdownloader.Controller;

import imcdownloader.Const;
import imcdownloader.Model.ListFiles;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;

public class UpdateFiles {

    private Workbook rdWorkBook;
    private Workbook wrWorkBook;
    private Sheet rdSheet;
    private Sheet wrSheet;
    private POIFSFileSystem inStream;

    public UpdateFiles(File temp) throws IOException {
        inStream = new POIFSFileSystem(new FileInputStream(temp));
        rdWorkBook = new HSSFWorkbook(inStream);
        rdSheet = rdWorkBook.getSheetAt(0);
        wrWorkBook = new HSSFWorkbook();
        wrSheet = wrWorkBook.createSheet();
    }

   public void reWriteFile(int index) throws FileNotFoundException {
       FileOutputStream outStream = new FileOutputStream(Const.getPathToCatalog() + ListFiles.getNameFileForTree(index) + ".xls");
       Row row = null;
       Cell cell;
       String buffer;
       rdSheet.getRow(0);
       for (int i = 3; i < rdSheet.getLastRowNum(); i++) {
           for (int j = 0; j < rdSheet.getRow(3).getLastCellNum() - 1; j++) {
               try {
                   cell = rdSheet.getRow(i).getCell(j);
                   row = wrSheet.createRow(i - 3);
                   if (cell.toString() == "0") {
                       row.createCell(j).setCellValue("0");
                   } else {
                       buffer = cell.getStringCellValue();
                       System.out.println(buffer);
                       row.createCell(j).setCellValue(buffer);
                   }

               } catch (IllegalStateException e) {

               }
           }
       }
       try {
           wrWorkBook.write(outStream);
           outStream.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}
