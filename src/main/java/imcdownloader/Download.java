package imcdownloader;

import imcdownloader.Controller.UpdateFiles;
import imcdownloader.Model.ListFiles;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Download implements Runnable {

    private String url_connection = "http://ims-kharkov.narod.ru/xls";
    private String nameFile;

   /* public Download(String nameFile) {
        this.nameFile = nameFile;
    }*/

    @Override
    public void run() {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        String url_file_download;

        try {
            for (int i = 0; i < ListFiles.getLength() - 1; i++) {
                int buffer;
                url_file_download = url_connection + "/" + ListFiles.getNameFile(i);
                URL url = new URL(url_file_download);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                inputStream = connection.getInputStream();
                fileOutputStream = new FileOutputStream(Const.getPathToCatalog() + ListFiles.getNameFileForTree(i));
                /*File temp = new File(Const.getPathToCatalog() + "temp.xls");
                fileOutputStream = new FileOutputStream(temp);*/

                while ((buffer = inputStream.read()) != -1) {
                    fileOutputStream.write(buffer);
                }
                /*UpdateFiles updateFiles = new UpdateFiles(temp);
                updateFiles.reWriteFile(i);
                temp = null;*/
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
